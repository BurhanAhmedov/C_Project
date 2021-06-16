package Servlet;

import az.library.dao.BookDao;
import az.library.dao.BookDaoImpl;
import az.library.model.Book;
import az.library.service.BookService;
import az.library.service.BookServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ControllerServlet", value = "/CServlet")
public class ControllerServlet extends HttpServlet {
    private String action;
    private BookDao bookDao = new BookDaoImpl();
    private BookService bookService = new BookServiceImpl(bookDao);




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
      processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        processRequest(request,response);
    }

    private void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
         String action = null;


         if (request.getParameter("actiom")!=null){
             action= request.getParameter("action");
             System.out.println(action);
         }
         if(action.equalsIgnoreCase("getBookList")){
             try {
                 List<Book> bookList = bookService.getBookList();
                 request.setAttribute("bookList",bookList);
                 request.getRequestDispatcher("main/webapp/WEB-INF/Pages/BookPage.jsp").forward(request,response);
             } catch (Exception e) {
                 e.printStackTrace();
             }

         }

    }
}