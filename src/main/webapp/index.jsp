<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>B-Library</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css"/>
    <link rel="stylesheet" href="//cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" type="text/css">
    <script src="JS/JQuery/jquery-3.6.0.js" type="text/javascript"></script>
    <script src="//cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="JS/main.js" type="text/javascript"></script>
</head>
<body style="margin: 0">
<div class="header">
    <header>
        <img src="Image/B-library(header%20logo).png">
    </header>
</div>


<ul>
    <li><a href="#" id="idMainPage">Ana Səhifə</a></li>
    <li><a href="CServlet?action=getBookList" id="idBook">Kitab</a></li>
    <li><a href="#" id="idAuthor">Müəllif</a> </li>
    <li><a href="#" id="idGenre">Janr</a></li>
</ul>
<div class="main">
    <div id="#idBookData">


    </div>

</div>

<div class="footer">
    <footer>Copyright &copy; 2021 Burhan Ahmadov</footer>
</div>


<br/>
</body>
</html>