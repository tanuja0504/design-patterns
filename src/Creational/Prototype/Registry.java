package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(25);
        movie.setRuntime("2");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNoOfPages(335);
        book.setPrice(20);
        book.setTitle("Basic Book ");
        items.put("Books", book);
    }
}
