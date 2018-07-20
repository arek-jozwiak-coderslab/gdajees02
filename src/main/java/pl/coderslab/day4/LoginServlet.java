package pl.coderslab.day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final static String USER = "arek";
    private final static String PASSWORD = "arek1";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
       String pass = request.getParameter("pass");
       if(user.equals(USER)&&  pass.equals(PASSWORD)){
           session.setAttribute("admin", USER);
           response.sendRedirect(getServletContext()+"/admin/index");
       }else{
            response.getWriter().append("WRONG PASSWORD contact with HR ");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login-form.jsp")
                .forward(request, response);
    }
}
