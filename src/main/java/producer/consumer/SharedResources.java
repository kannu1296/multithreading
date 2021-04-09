package producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * List shared between producer and consumer
 */
public class SharedResources {
    Queue<Integer> producerList = new LinkedList<>();
}
