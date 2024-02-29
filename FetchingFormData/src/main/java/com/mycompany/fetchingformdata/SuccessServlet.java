/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fetchingformdata;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class SuccessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to Success Servlet</h2>");
        out.println("<h1>Successfully Registered</h1>");
//        Getting parameters from index.html
        String name = request.getParameter("uname");
        String course = request.getParameter("ucourse");
//        out.println(password);
        // Getting Sum attribute from request object
        String sum = request.getAttribute("sum").toString();
        out.println("Sum Attribute : "+sum);
        String Fullsum = name+course+sum;
        out.println("<h2>The Concatinated Sum will be "+Fullsum+"</h2>");
        
        
    }
    
}
