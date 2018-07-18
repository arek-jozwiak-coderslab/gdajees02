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

@WebServlet("/session-get")
public class ServletSessionGet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        response.setContentType("text/html");

        response.setCharacterEncoding("UTF-8");

        String name = (String) session.getAttribute("name");
        response.getWriter().append(name);
        int counter = (int) session.getAttribute("counter");
        response.getWriter().append(counter + "");

        Product product = (Product) session.getAttribute("product");

        response.getWriter().append(product.toString());

        List<Product> products = (List<Product>) session.getAttribute("products");

        response.getWriter().append("<br/><br/>");
        for (Product product1 : products) {
            response.getWriter().append(product1.toString());
        }


    }
}
