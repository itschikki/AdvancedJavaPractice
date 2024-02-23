/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creatingservlets;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class MyServlet2 extends GenericServlet{
   @Override
   public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
        System.out.println("Servicing.....");
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("Using Generic servlet...");
    }
}
