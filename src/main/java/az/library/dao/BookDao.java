package az.library.dao;

import az.library.model.Book;

import java.util.List;

public interface BookDao {
    List<Book> getBookList() throws Exception;
}

