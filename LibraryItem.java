package LibraryManagementSystem;

abstract class LibraryItem {
    private String id;
    private String item;
    private boolean isAvailability;


    public LibraryItem(String id, String item){
        this.id = id;
        this.item = item;
        isAvailability = true;
    }

    public String getId(){
        return id;
    }

    public String getItem(){
        return item;
    }

    public boolean getIsAvailability(){
        return isAvailability;
    }

    public void setAvailability(boolean availability){
        isAvailability = availability;
    }

}
