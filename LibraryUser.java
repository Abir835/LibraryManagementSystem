package LibraryManagementSystem;
import java.util.*;
abstract class LibraryUser {
    private String userId;
    private String name;
    private List<LibraryItem> borrowItems = new ArrayList<>();

    public LibraryUser(String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    String getUserId(){
        return userId;
    }

    String getName(){
        return name;
    }

    public List<LibraryItem> getBorrowItems(){
        return borrowItems;
    }

    public abstract int getMaxBorrowLimit();
}
