package producer.consumer;


/**
 * A utility to add and poll item from shared resource
 * in a synchronized way
 */
public class Buffer extends SharedResources {
    private int value = 0;
    public void add() throws InterruptedException {
        synchronized(this){
            while (ProducerConsumerConstants.CAPACITY == producerList.size())
                wait(); //Wait when consumer is consuming
            producerList.add(value);
            value++;
            notify();   //notify consumer when the items are produced
        }
    }
    public int poll() throws InterruptedException {
        int poll;
        synchronized (this){
            while (ProducerConsumerConstants.ZERO == producerList.size())
                wait(); //wait when producer is producing
            poll = producerList.poll();
            notify();   //notify producer once the consumption is done
        }
        return poll;
    }
}
