package org.challenger.kotlin

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.Cookie
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.io.PrintWriter

//@WebServlet(urlPatterns = ["/user/*"])
@WebServlet("Kotlin")
class Teste: HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {

        PrintWriter(resp!!.writer).println(req!!.requestURI)

        val cookie = Cookie("name", "erickName")
        cookie.maxAge = 60 * 60
        resp.addCookie(cookie)

        val out = resp.writer
        resp.contentType = "text/html"
        out.println("<html>")
        out.println("<head>")
        out.println("<title>Servlet ControllerEjb tests</title>")
        out.println("</head>")
        out.println("<body>")
        for (a in 0..0) {
            out.println("<h1>Servlet ControllerEjb tests 1 </h1>")
        }
        out.println("<h1>ServeLetKotlin</h1>")
        out.println("<h1>erickName2</h1>")
        out.println("<a href=\"WebServlet2\">Go</a>")
        out.println("</body>")
        out.println("</html>")
        out.flush()

    }
}