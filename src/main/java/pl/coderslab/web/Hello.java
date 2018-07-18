package pl.coderslab.web;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Hello extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        http://localhost:8080/hello?a=1&b=2&c=3&d=4
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));





       Calculator calculator = new Calculator();
       response.getWriter().append("<html><h1>Some html</h1>");
        response.getWriter().append("result = " + calculator.add(a, b));

    }

}
