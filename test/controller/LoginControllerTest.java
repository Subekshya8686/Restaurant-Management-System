/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import model.LoginModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.*;
import controller.*;
import model.*;
public class LoginControllerTest {
    LoginRMS lview = new LoginRMS();
    LoginController lcon = new LoginController(lview);
    LoginModel lmod = new LoginModel("admin", "admin");
    public LoginControllerTest() {
    }
    

    
    @Test
    public void testactionpeformed() throws Exception {
        System.out.println("checkUser1");
        LoginController lcon = new LoginController(lview);
//        lview.txtuser.setText("admin");
//        lview.txtpwd.setText("admin");
//        lview.btnlogin.doClick();
        Boolean check = lcon.checkUser1(new LoginModel("admin","admin"));
        assertEquals(true, check);
        
    }
    
}
