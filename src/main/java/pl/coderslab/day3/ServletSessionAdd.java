package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session-add")
public class ServletSessionAdd extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        session.setAttribute("name", "Arek");
        session.setAttribute("counter", 33);
        session.setAttribute("product", new Product("Java book", 2.0));
        List<Product> products = new ArrayList<>();
        products.add(new Product("Thinking in Java", 33.0));
        products.add(new Product("Java 2 podstawy", 53.0));

        session.setAttribute("products", products);

    }
}
