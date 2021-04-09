package railway;

public class SeatNotAvailableException extends Exception {
    String msg;

    SeatNotAvailableException(String msg){
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return "Seat not available: " + this.msg;
    }
}
