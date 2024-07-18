package org.challenger.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("cookie")
public class ReaderCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        Cookie[] cookies = req.getCookies();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ReaderCookies Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        for (Cookie cookie : cookies) {
            out.println("<h1>" + cookie.getName() + "</h1>");
            out.println("<h1>" + cookie.getValue() + "</h1>");
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }
}
