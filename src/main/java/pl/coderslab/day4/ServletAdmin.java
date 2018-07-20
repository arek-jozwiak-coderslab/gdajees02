package pl.coderslab.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin/index")
public class ServletAdmin extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JESTEM SERVLET");

        HttpSession session = request.getSession();
        if(session.getAttribute("admin")==null){
            response.sendRedirect(getServletContext()+"/login");
        }

        response.getWriter().append("HELLO IN ADMIN PANEL");
    }
}
