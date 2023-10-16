package LibraryManagementSystem;

public class Guest extends LibraryUser{
    private static final int MAX_BORROW_LIMIT = 5;
    public Guest(String userId, String name) {
        super(userId, name);
    }

    @Override
    public int getMaxBorrowLimit() {
        return MAX_BORROW_LIMIT;
    }
}
