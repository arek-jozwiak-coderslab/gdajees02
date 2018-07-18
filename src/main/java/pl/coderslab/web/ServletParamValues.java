package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

//http://localhost:8080/param-values?multi=1&multi=2&multi=3&a=1
@WebServlet("/param-values")
public class ServletParamValues extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] multi = request.getParameterValues("multi");

        Map<String, String[]> map= request.getParameterMap();

        Writer writer = response.getWriter();
        for (String s : multi){
            writer.append(s);
        }
    }
}
