/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discussion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

/**
 *
 * @author Kam Kam
 */
@WebServlet(name = "NewSignIn", urlPatterns = {"/NewSignIn"})
public class NewSignIn extends HttpServlet {

 public NewSignIn(){
       super();
   }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getdata
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        request.getSession().setAttribute("username", username);
        
        //loop through file to find match
        String temp;
        boolean found = false;
        String path = getServletContext().getRealPath("/") + "users.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while ((temp = bufferedReader.readLine()) != null) {
        if((username + password).equals(temp)) {
        request.setAttribute("username", username);
        request.getSession().setAttribute("username", username);
        request.getRequestDispatcher("/newpost.jsp").forward(request, response);
        found = true;
        break;
        }
        }
        
        if (found == false){
            request.getRequestDispatcher("/invalidlogin.jsp").forward(request, response);
        }
        
        /*if (username.equals(uname)){
            if (password.equals(pword)){
                request.setAttribute("username", username);
                request.getSession().setAttribute("username", username);
                request.getRequestDispatcher("/newpost.jsp").forward(request, response);
                
            }
            else{
                request.getRequestDispatcher("/invalidlogin.jsp").forward(request, response);
            }
        }else{
                request.getRequestDispatcher("/invalidlogin.jsp").forward(request, response);
        }*/
       
    }
    
}
