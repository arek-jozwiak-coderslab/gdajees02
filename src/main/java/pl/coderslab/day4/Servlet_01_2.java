package pl.coderslab.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_01_2")
public class Servlet_01_2 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String selectedLang = request.getParameter("selectedLang");
        Cookie cookie = new Cookie("lang", selectedLang);
        response.addCookie(cookie);
        response.sendRedirect(request.getContextPath()+"/Servlet_01_1");
    }

}
