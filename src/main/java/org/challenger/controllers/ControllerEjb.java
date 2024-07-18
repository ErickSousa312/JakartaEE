package org.challenger.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/WebServlet")
public class ControllerEjb extends HttpServlet {
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Destroyed - teste log");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Initilized - teste log");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("password");

        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ControllerEjb tests</title>");
        out.println("</head>");
        out.println("<body>");
        for(int a = 0; a < 1; a++) {
            out.println("<h1>Servlet ControllerEjb tests 1 </h1>");
        }
        out.println("<h1> nome: "+ name + "</h1>");
        out.println("<h1> senha:"+ email + "</h1>");
        out.println("<a href=\"WebServlet2\">Go</a>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      Exemplo passando parameters

//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//
//        // Redirecionando para ServletB com parâmetros na URL
//        response.sendRedirect(request.getContextPath() + "/servletB?name=" + name + "&email=" + email);

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ControllerEjb tests</title>");
        out.println("</head>");
        out.println("<body>");
        for(int a = 0; a < 1; a++) {
            out.println("<h1>Servlet ControllerEjb tests 1 </h1>");
        }
        out.println("<h1>"+ name + "</h1>");
        out.println("<h1>"+ email + "</h1>");
        out.println("<a href=\"WebServlet2\">Go</a>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }
}
