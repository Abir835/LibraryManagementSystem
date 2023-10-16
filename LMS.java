package LibraryManagementSystem;

public class LMS {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Data Structures", "Alice Smith");
        DVD dvd1 = new DVD("D001", "Movie 1", 120);
        Journal journal1 = new Journal("J001", "Research Journal");
        // Create library users
        Student student = new Student("S001", "Student One");
        Faculty faculty =  new Faculty("F001", "Professor Smith");
        Guest guest = new Guest("G001", "Guest User");
//
        // Create a library and add items and users
        Library library = new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(journal1);
        library.addUser(student);
        library.addUser(faculty);
        library.addUser(guest);
        // Perform library operations
        library.borrowItem(student, book1);
        library.borrowItem(student, dvd1);
        library.borrowItem(faculty, book2);
        library.returnItem(student, book1);
        library.borrowItem(student, journal1);
        // List available items
        System.out.println("=================");
        System.out.println("Available Items:");
        library.listAvailableItems();
        // List borrowed items for a user
        System.out.println("=================");
        library.listBorrowedItems(student);
    }
}
