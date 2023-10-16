package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<LibraryItem> items = new ArrayList<>();
    public List<LibraryUser> users = new ArrayList<>();

    public void addUser(LibraryUser user){
        users.add(user);
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void borrowItem(LibraryUser user, LibraryItem item) {
        Borrowable borrowableItem = (Borrowable) item;
        if(borrowableItem.borrow()) {
            if (item.getIsAvailability() && user.getBorrowItems().size() <= user.getMaxBorrowLimit()) {
                user.getBorrowItems().add(item);
                item.setAvailability(false);
                System.out.println(user.getName() + " borrowed " + item.getItem());
            } else {
                System.out.println("Item not available or borrowing limit reached.");
            }
        }
        else{
            System.out.println("Item not available or borrowing limit reached.");
        }

    }


    public boolean returnItem(LibraryUser user, LibraryItem item) {
        Borrowable returnableItem = (Borrowable) item;
        if(returnableItem.returnItem()) {
            if (user.getBorrowItems().contains(item)) {
                user.getBorrowItems().remove(item);
                item.setAvailability(true);
                System.out.println(user.getName() + " returned " + item.getItem());
                return true;
            } else {
                System.out.println("Item cannot be returned or is not return by " + user.getName());
                return false;
            }
        }
        else{
            System.out.println("Item cannot be returned or is not return by " + user.getName());
            return false;
        }
    }

    public void listAvailableItems(){
        for (LibraryItem item: items){
            if(item.getIsAvailability()){
            System.out.println(item.getId() +": "+ item.getItem());
            }
        }
    }

    public void listBorrowedItems(LibraryUser user) {
        System.out.println(user.getName() + "'s Borrowed Items:");
        for (LibraryItem item : user.getBorrowItems()) {
            System.out.println(item.getItem());
        }
    }

}
