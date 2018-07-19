package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet("/sess02")
public class Sess02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int grade = Integer.parseInt(request.getParameter("grade"));
//        List<Integer> grades;
//
//        if (session.getAttribute("grades") != null) {
//            grades = new ArrayList<>();
//        } else {
//            grades = (List<Integer>) session.getAttribute("grades");
//
//        }

        List<Integer> grades = new ArrayList<>();
        // jeżeli w sesji jet atrybut o nazwie grades
        if (session.getAttribute("grades") != null) {
            //podstaw do zmiennej pobraną z sesji wartość
            grades = (List<Integer>) session.getAttribute("grades");
        }
        if (grade > 0 && grade < 7) {
            grades.add(grade);
        }
        session.setAttribute("grades", grades);
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html");
        response.getWriter().append(
                "<form method=\"post\">\n" +
                        "    <input name=\"grade\"/>\n" +
                        "    <input type=\"submit\"/>\n" +
                        "</form>"
        );
        List<Integer> grades = (List<Integer>) session.getAttribute("grades");
        if (grades != null) {
            response.getWriter().append("<br/>AVG: " + countAvg(grades));
            response.getWriter().append("<br/>Grades: " + grades);
        }

    }

    private double countAvg(List<Integer> grades) {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
