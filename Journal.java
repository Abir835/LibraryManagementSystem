package LibraryManagementSystem;

public class Journal extends LibraryItem implements Borrowable{
    public Journal(String id, String item) {
        super(id, item);
    }

    @Override
    public boolean borrow() {
        return false;
    }

    @Override
    public boolean returnItem() {
        return false;
    }
}
