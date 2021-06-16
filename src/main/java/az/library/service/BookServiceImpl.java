package az.library.service;

import az.library.dao.BookDao;
import az.library.model.Book;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor

public class BookServiceImpl implements  BookService{
    private BookDao bookDao;

    public List<Book> getBookList() throws Exception {
        return bookDao.getBookList();

    }


}
