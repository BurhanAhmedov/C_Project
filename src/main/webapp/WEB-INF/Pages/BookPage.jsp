<%@ page import="az.library.service.BookService" %>
<%@ page import="az.library.model.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Bürhan
  Date: 16.06.2021
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    $(function () {
        $('#idTableBook').DataTable();
    });
</script>
<head>
    <title>B-Library/Book</title>
</head>
<body>
<%List<Book> bookList = (List<Book>) request.getAttribute("bookList");%>
<table border="1" id="idTableBook">
    <thead>
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Page</th>
        <th>Purchase price</th>
        <th>Sale price</th>
        <th>Profit</th>
        <th>Stock</th>
    </tr>
    </thead>
    <tbody>
    <%for (Book book : bookList) {%>
    <tr>
        <td><%=book.getId()%></td>
        <td><%=book.getName()%></td>
        <td><%=book.getPage()%></td>
        <td><%=book.getPurchasePrice()%></td>
        <td><%=book.getSalePrice()%></td>
        <td><%=book.getProfit()%></td>
        <td><%=book.getStock()%></td>
    </tr>

    <%}%>


    </tbody>


</table>

</body>
</html>
