$(function () {
    $('#idMainPage').click(function () {
        mainpagaClick();
    });
    $('#idBook').click(function () {
        bookClick();
    });
    $('#idAuthor').click(function () {
        authorClick();
    });
    $('#idGenre').click(function () {
        genreClick();
    });
});

function mainpagaClick() {

}

function bookClick() {
    $.ajax({
        url: '/CServlet?action=getBookList',
        type: `GET`,
        dataType: 'html',
        success: function (data) {
            $('#idBookData').html(data);
        }

    });

}

function authorClick() {

}

function genreClick() {

}