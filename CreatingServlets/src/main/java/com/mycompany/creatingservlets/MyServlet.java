/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creatingservlets;

import jakarta.servlet.*;
import java.io.IOException;

/**
 *
 * @author Owner
 */

public class MyServlet implements Servlet {
    
    ServletConfig confg;
    @Override
    public void init(ServletConfig confg){
        this.confg = confg;
        System.out.println("Object created....."); 
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing");
    }
    
    @Override
    public void destroy(){
        System.out.println("Destroying the object");
    }
    
    @Override
    public ServletConfig getServletConfig()
    {
        return this.confg;
    }
    @Override
    public String getServletInfo(){
        return "This is created by me";
    }
}
