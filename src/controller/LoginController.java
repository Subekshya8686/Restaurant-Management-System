/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import view.*;
import model.*;
import java.sql.*;

public class LoginController {
    LoginModel model;
    LoginRMS view;
    ResultSet rs;
    Statement stmt;

//           
    public LoginController(LoginRMS view){
        this.view = view;
//        view.addLoginListner(new LoginListener());
          new LoginListener().actionPerformed(); 
    }
    
        class LoginListener{
                       
            public void actionPerformed(){      
                try{
                    model = view.getUser();
                    if(checkUser1(model)){

                    NewDashboard d = new NewDashboard();
                    d.setVisible(true);
                              
                    }
                    else{
                        view.setMessage("Invalid username or password");
                    }
                }
                
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        
        

//        private void dispose() {
//            }
    }
        public boolean checkUser1(LoginModel user) throws Exception {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","subekshya");
            String sql = "select * from register where Username='"+user.getUsername()+"' AND Password= '"+user.getPassword()+"' ";
            try{
                stmt =conn.createStatement();
                rs= stmt.executeQuery(sql);
                if(rs.next()){
                    return (true);
                }
                conn.close();
            }
            
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            
            return false;
        }
}

    

