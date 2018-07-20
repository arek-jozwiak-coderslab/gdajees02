package pl.coderslab.workshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/books-list")
public class BookList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                BookDao bookDao = new BookDao();
        List<Book> books = bookDao.findAll();
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/workshop/list.jsp")
                .forward(request, response);
    }
}
