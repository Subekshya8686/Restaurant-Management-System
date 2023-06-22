/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*; 
import model.*;
import view.*;

public class RegisterController {
    RegisterModel model;
    SignUp view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    
    
    public RegisterController(SignUp view) {
        this.view= view;

        new RegisterListener().actionPerformed();
    } 

    
    class RegisterListener {
        
        public void actionPerformed(){
            try{
                model= view.getUser();
                if(checkUser(model)){
                    view.setMessage("Registered Successfully");

                }
            else{
                    view.setMessage("Invalid username or password");
                    }
            } 
            catch(Exception e1){
                
            }}

        public boolean checkUser(RegisterModel user) throws Exception{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","subekshya");
                String sql = "insert into register(fname, lname, email, phone, Username, Password) values(?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, user.getFName());
                pst.setString(2, user.getLname());
                pst.setString(3, user.getEmail());
                pst.setString(4, user.getPhone());
                pst.setString(5, user.getUsername());
                pst.setString(6, user.getPassword());
                
                pst.executeUpdate();
               
               
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return false;
        }
    }

    }

