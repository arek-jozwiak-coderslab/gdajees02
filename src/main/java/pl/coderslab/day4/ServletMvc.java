package pl.coderslab.day4;

import pl.coderslab.day3.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servletMvc")
public class ServletMvc extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String changedName = name.concat(" jest super !!").toUpperCase();

        request.setAttribute("superName", changedName);


        List<Product> products = new ArrayList<>();
        products.add(new Product("Some name 1", 20.0));
        products.add(new Product("Some name 2", 30.0));
        products.add(new Product("Some name 3", 40.0));

        request.setAttribute("products", products);

        getServletContext().getRequestDispatcher("/mvc.jsp")
                .forward(request, response);
    }
}
