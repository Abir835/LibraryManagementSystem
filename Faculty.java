package LibraryManagementSystem;

public class Faculty extends LibraryUser{
    private static final int MAX_BORROW_LIMIT = 1;
    public Faculty(String userId, String name) {
        super(userId, name);
    }

    @Override
    public int getMaxBorrowLimit() {
        return MAX_BORROW_LIMIT;
    }
}
