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
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

/**
 *
 * @author Kam Kam
 */
@WebServlet(name = "CreatePost", urlPatterns = {"/CreatePost"})
public class CreatePost extends HttpServlet {

   public CreatePost(){
       super();
   }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get data from post
        String newpost = request.getParameter("newpost");
        String username = request.getParameter("username");
        //String timestamp = "";
       
        
        
        
        //get timestamp
        Date date = new Date();
        String time = (date.toString());
        //Calendar calendar = Calendar.getInstance();
        //java.sql.Timestamp timestamp = new java.sql.Timestamp(calendar.getTime().getTime());
        
        
        
        //set data
        request.setAttribute("username", username);
        request.setAttribute("newpost", newpost);
        request.setAttribute("time", time);
        
        
        
        
        
        String path = getServletContext().getRealPath("/") + "discussion.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = "";
        String result = "";
        while ((line = reader.readLine()) != null){
        result = result + line + "\n";
        }
        //String temp = in.readLine();
        BufferedWriter out = new BufferedWriter(new FileWriter(path));
        out.write("'" + newpost + "'" + "\n" +
                  "Submitted by: " + username + "\n" + 
                  "on " + time + "\n\n" + result + "\n");
        out.close();
        
        
        /*String temp = "";
        String disc = "";
        while ((temp = reader.readLine()) != null){
        disc = disc + temp + "\n";
        }
        request.setAttribute("disc", disc);*/
        
        request.getRequestDispatcher("/viewpost.jsp").forward(request, response);
    }
    
    /*public String toFileString() {
            //return newpost + "," + username + "," + timestamp;
        String newpost = "newpost";
        return newpost;
     }

 
     public void loadFromFileString(String str) {
            // TODO: Validation should be done here
            String[] parts = str.split(",");

 
            //newpost = parts[0];
            //username = Integer.parseInt(parts[1]);
            //timestamp = Integer.parseInt(parts[2]);
     }*/

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    

}
