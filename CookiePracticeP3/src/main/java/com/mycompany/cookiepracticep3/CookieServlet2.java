
package com.mycompany.cookiepracticep3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        Cookie [] cookies = request.getCookies();
        String name = "";
        if(cookies==null){
            out.println("<h1>No Cookies Found. You Are new User</h1>");
        }
        for(Cookie c:cookies){
            String temp = c.getName();
            if(temp.equals("cname")){
                name = c.getValue();
            }  
        }
        out.println("<h1>Hello "+name +"(name is retrived by cookie)</h1>");
        
        
    }
    
}
