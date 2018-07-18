package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet-cookie-get")
public class ServletCookieGet extends HttpServlet {

    private String getCookieValue(HttpServletRequest request, String cookieName){
        String cookieValue = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("myName")) {
                cookieValue = cookie.getValue();
            }
        }
        return cookieValue;
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.getWriter().append(getCookieValue(request, "myName"));
    }
}
