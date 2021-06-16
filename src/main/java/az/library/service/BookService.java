package az.library.service;

import az.library.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList() throws Exception;
}
