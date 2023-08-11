/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 97798
 */
public class MyConnection {
        @SuppressWarnings("UseSpecificCatch")
        public static Connection doConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","at123thapa");
            
            System.out.println("connected"); 
            return conn;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
