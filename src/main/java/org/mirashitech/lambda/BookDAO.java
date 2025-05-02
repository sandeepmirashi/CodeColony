package org.mirashitech.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(10, "Core Java", 400));
        books.add(new Book(36, "Spring", 200));
        books.add(new Book(45, "Hibernate", 100));
        books.add(new Book(54, "Webserice", 300));
        return books;
    }

}
