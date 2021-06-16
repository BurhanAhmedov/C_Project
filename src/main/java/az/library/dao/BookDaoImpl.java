package az.library.dao;

import az.library.model.Book;
import az.library.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> getBookList() throws Exception {

        List<Book> bookList = new ArrayList<>();
        String sql = "Select * from book where active=1";
        try (Connection connect = DBUtil.getConnection(); PreparedStatement ps = connect.prepareStatement(sql); ResultSet rs = ps.executeQuery(sql)) {
            if (connect != null) {
                while (rs.next()) {
                    Book book = new Book();
                    book.setId(rs.getLong("id"));
                    book.setName(rs.getString("name"));
                    book.setPage(rs.getInt("page"));
                    book.setPurchasePrice(rs.getFloat("purchasePrice"));
                    book.setSalePrice(rs.getFloat("salePrice"));
                    book.setProfit(rs.getFloat("profit"));
                    book.setStock(rs.getInt("stock"));
                    bookList.add(book);


                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }


        return bookList;
    }
}
