package pl.coderslab.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Servlet_01_1")
public class Servlet_01_1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Ehre");
        lang.put("es", "Hola");
        lang.put("fr", "Bienvenue");

        Cookie[] cookies = request.getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lang")) {
                    request.setAttribute("hello", lang.get(cookie.getValue()));
                }
            }
        }

        request.setAttribute("langs", lang);




        getServletContext().getRequestDispatcher("/day4/form.jsp")
                .forward(request, response);
    }
}
