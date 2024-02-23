/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fetchingformdata;

/**
 *
 * @author Owner
 */
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to Register Servlet</h1>");
        
        String name = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");
        String gender = request.getParameter("ugender");
        String course = request.getParameter("ucourse");
        
        
        String cond = request.getParameter("condition");
        if(cond!=null){
            if(cond.equals("checked")){
                out.println("<h2>Name : "+name+"</h2>");
                out.println("<h2>Email : "+email+"</h2>");
                out.println("<h2>Password : "+password+"</h2>");
                out.println("<h2>Gender : "+gender+"</h2>");
                out.println("<h2>Course : "+course+"</h2>");
                RequestDispatcher rd2 = request.getRequestDispatcher("success");
                rd2.forward(request, response);
            }    
        }
        else{
                out.println("<h2>Please Check terms and Conditions</h2>");
//                out.println("<h3><a href=\"index.html\">Go to Form</a></h3>");
               RequestDispatcher rd = request.getRequestDispatcher("index.html");
               rd.include(request, response);
            }
        
        
    }
    
    
}
