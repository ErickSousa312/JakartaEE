package org.challenger.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("Register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        System.out.println("req veio para esse JB");
        User user = new User(name,email);
//        req.getSession().setAttribute("user",user); isso fica no session
        req.setAttribute("user", user);
        //a tela foi para welcome mas ta aparecendo q ele foi para o Register
//        req.getRequestDispatcher("/welcome.jsp").forward(req, resp);

        // Codificando o objeto User em uma string de parâmetros na URL
        String queryString = "name=" + URLEncoder.encode(user.getUsername(), "UTF-8") + "&email=" + URLEncoder.encode(user.getEmail(), "UTF-8");

        // Redirecionando para a página JSP com os parâmetros na URL
        resp.sendRedirect(req.getContextPath() + "/welcome.jsp?" + queryString);
    }
}
