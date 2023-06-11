/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import java.awt.event.ActionListener;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.*;
import view.*;

public class RegisterController {
    RegisterModel model;
    SignUp view;
    Statement stmt; 
    ResultSet rs;
    Connection conn;
    
    
    public RegisterController(SignUp view) {
        this.view= view;
}


   
}
