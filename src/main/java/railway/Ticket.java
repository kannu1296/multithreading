package railway;

public class Ticket extends Thread {
    private static final int NUMBER_OF_SEATS = 100;
    private int availabeSeats;

    public void setAvailabeSeats(){
        availabeSeats = Ticket.NUMBER_OF_SEATS;
    }

    public int getAvailabeSeats(){
        return availabeSeats;
    }

    public synchronized void bookTicket(int seat) throws SeatNotAvailableException{
        if((availabeSeats - seat) >= 0)
            availabeSeats = availabeSeats - seat;
        else
            throw new SeatNotAvailableException(seat + "Not available! Please book from available seats: "+ availabeSeats);

    }

    @Override
    public void run() {
        //this.bookTicket(100);
    }
}
