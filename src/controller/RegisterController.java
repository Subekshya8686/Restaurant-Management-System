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
import view.SignUp;

public class RegisterController {
    RegisterModel model;
    SignUp view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    
    
    public RegisterController(SignUp view) {
        this.view= view;
        view.addLoginListener(new RegisterListener());
}
    
    class RegisterListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                model= view.getUser();
                if(checkUser(model)){
//                    view.setMessage("Registered Successfully");
                        NewDashboard d = new NewDashboard();          
                        d.setVisible(true);
                }
            else{
                    view.setMessage("Invalid username or password");
                    }
            } 
            catch(Exception e1){
                
            }
            
        }
        
    }
    public boolean checkUser(RegisterModel user) throws Exception{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","subekshya");
                String sql = "insert into signup(fname, lname, email, phone, Username, pass, securityque, answer) values(?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, user.getfname());
                pst.setString(2, user.getlname());
                pst.setString(3, user.getemail());
                pst.setString(4, user.getphone());
                pst.setString(5, user.getUsername());
                pst.setString(6, user.getpass());
                pst.setString(7,user.getsecurityque());
                pst.setString(8,user.getanswer());
                
                pst.executeUpdate();
                System.out.println("Data Inserted");
                JOptionPane.showConfirmDialog(null, "Registered Successfully");
                return true;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return false;
        }
}
