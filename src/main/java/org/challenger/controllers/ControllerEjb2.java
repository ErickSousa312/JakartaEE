package org.challenger.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/WebServlet2")
public class ControllerEjb2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ControllerEjb tests</title>");
        out.println("</head>");
        out.println("<body>");
        for(int a = 0; a < 10; a++) {
            out.println("<h1>Servlet ControllerEjb tests 2</h1>");
        }
        out.println("<a href=WebServlet>Back</a>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }
}
