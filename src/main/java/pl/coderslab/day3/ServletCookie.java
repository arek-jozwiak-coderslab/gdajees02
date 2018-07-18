package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet-cookie")
public class ServletCookie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("myName", "Arek");
        Cookie lastName = new Cookie("myLastName", "Jozwiak");

        cookie.setMaxAge(3600);
        response.addCookie(cookie);
        response.addCookie(lastName);

        response.getWriter().append("servlet-cookie");

    }
}
