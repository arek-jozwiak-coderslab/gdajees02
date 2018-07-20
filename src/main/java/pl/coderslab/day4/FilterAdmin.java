package pl.coderslab.day4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/admin/*")
public class FilterAdmin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("JESTEM PRZED FILTER");

        chain.doFilter(req, resp);

        System.out.println("JESTEM PO FILTER");

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
