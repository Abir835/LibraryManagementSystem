package LibraryManagementSystem;

public class DVD extends LibraryItem implements Borrowable, Reservable{
    private int duration;
    public DVD(String id, String item, int duration) {
        super(id, item);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    @Override
    public boolean borrow() {
        return true;
    }

    @Override
    public boolean returnItem() {
       return true;
    }

    @Override
    public boolean reserve() {
        return getIsAvailability();
    }
}
