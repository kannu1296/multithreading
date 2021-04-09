package railway;

public class SeatInformation {
    private int availableUpperSeats;
    private int availableLowerSeats;
    private int availableMiddleSeats;
    private int availableSideUpperSeats;
    private int availableSideLowerSeats;
    private int availableTotalSeats;

    public int getAvailableTotalSeats() {
        return availableTotalSeats;
    }

    public void setAvailableTotalSeats(int availableTotalSeats) throws SeatNotAvailableException {
        if((SeatConstants.TOTAL_SEATS - availableTotalSeats)>=0){
            this.availableTotalSeats = SeatConstants.TOTAL_SEATS - availableTotalSeats;
        }
        else{
            throw new SeatNotAvailableException("Seats are not availble!!Booking not possible");
        }
    }

    public int getAvailableUpperSeats() {
        return availableUpperSeats;
    }

    public void setAvailableUpperSeats(int availableUpperSeats) throws SeatNotAvailableException {
        if((SeatConstants.UPPER_SEATS - availableUpperSeats)>=0){
            this.availableUpperSeats = SeatConstants.UPPER_SEATS - availableUpperSeats;
            this.setAvailableTotalSeats(availableUpperSeats);
        }
        else {
            throw new SeatNotAvailableException("Upper seats are not available! Please select another category");
        }

    }

    public int getAvailableLowerSeats() {
        return availableLowerSeats;
    }

    public void setAvailableLowerSeats(int availableLowerSeats) throws SeatNotAvailableException {
        if((SeatConstants.LOWER_SEATS - availableLowerSeats)>=0){
            this.availableLowerSeats = SeatConstants.LOWER_SEATS - availableLowerSeats;
            this.setAvailableTotalSeats(availableLowerSeats);
        }else {
            throw new SeatNotAvailableException("Lower seats are not available! Please select another category");
        }

    }

    public int getAvailableMiddleSeats() {
        return availableMiddleSeats;
    }

    public void setAvailableMiddleSeats(int availableMiddleSeats) throws SeatNotAvailableException {
        if((SeatConstants.MIDDLE_SEATS - availableMiddleSeats)>=0){
            this.availableMiddleSeats = SeatConstants.MIDDLE_SEATS - availableMiddleSeats;
            this.setAvailableTotalSeats(availableMiddleSeats);
        }else{
            throw new SeatNotAvailableException("Middle seats are not available! Please select another category");
        }
    }

    public int getAvailableSideUpperSeats() {
        return availableSideUpperSeats;
    }

    public void setAvailableSideUpperSeats(int availableSideUpperSeats) throws SeatNotAvailableException {
        if((SeatConstants.SIDE_UPPER_SEATS - availableSideUpperSeats)>=0){
            this.availableSideUpperSeats = SeatConstants.SIDE_UPPER_SEATS - availableSideUpperSeats;
            this.setAvailableTotalSeats(availableSideUpperSeats);
        }else {
            throw new SeatNotAvailableException("SideUpper seats are not available! Please select another category");
        }
    }

    public int getAvailableSideLowerSeats() {
        return availableSideLowerSeats;
    }

    public void setAvailableSideLowerSeats(int availableSideLowerSeats) throws SeatNotAvailableException {
        if((SeatConstants.SIDE_LOWER_SEATS - availableSideLowerSeats)>=0){
            this.availableSideLowerSeats = SeatConstants.SIDE_LOWER_SEATS - availableSideLowerSeats;
            this.setAvailableTotalSeats(availableSideLowerSeats);
        }else{
            throw new SeatNotAvailableException("Side Lower seats are not available! Please select another category");
        }
    }
}
