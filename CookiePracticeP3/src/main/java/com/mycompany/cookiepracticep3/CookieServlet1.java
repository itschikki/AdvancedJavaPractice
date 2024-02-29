/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookiepracticep3;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class CookieServlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("uname");
       PrintWriter out = response.getWriter();
       response.setContentType("text/html");
       out.println("<h1>Welcome "+name+"</h1><br>");
       out.println("<h1><a href=\"CookieServlet2\">Go to Servlet 2</a></h1>");
       
       Cookie ck = new Cookie("cname",name);
       response.addCookie(ck);
    }
    
}
