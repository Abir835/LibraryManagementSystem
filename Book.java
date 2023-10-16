package LibraryManagementSystem;

public class Book extends LibraryItem implements Borrowable{
    private String  author;
    public Book(String id, String item, String author) {
        super(id, item);
        this.author = author;
    }

    public  String getAuthor(){
        return author;
    }

    @Override
    public boolean borrow() {
        return true;
    }

    @Override
    public boolean returnItem() {
        return true;
    }
}
