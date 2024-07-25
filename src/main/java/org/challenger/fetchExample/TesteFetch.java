package org.challenger.fetchExample;

import jakarta.json.*;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonString;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("dataServlet")
public class TesteFetch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        JsonObjectBuilder json = Json.createObjectBuilder();
        json.add("teste","erick");
//        JsonClass json = new JsonClass();
//        json.jsonObject.put("message", Json.createValue("message by json"));
        PrintWriter out = resp.getWriter();
//        out.write(json.toStringFromJson(json));
        out.write(json.build().toString());
        out.flush();
    }
}
