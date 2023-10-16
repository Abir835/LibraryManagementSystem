package LibraryManagementSystem;

public class Student extends LibraryUser{
    private static final int MAX_BORROW_LIMIT = 3;
    public Student(String userId, String name) {
        super(userId, name);
    }

    @Override
    public int getMaxBorrowLimit() {
        return MAX_BORROW_LIMIT;
    }
}
