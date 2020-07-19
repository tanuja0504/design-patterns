package Creational.Prototype;

public class Book extends Item {
    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    private int noOfPages;

}
