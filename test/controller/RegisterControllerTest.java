/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import controller.RegisterController;
import model.RegisterModel;
import view.SignUp;
import static org.junit.Assert.*;

/**
 *
 * @author 97798
 */
public class RegisterControllerTest {
    
    public RegisterControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() throws Exception {
        // TODO review the generated test code and remove the default call to fail.
        RegisterController controller = new RegisterController(new SignUp());
        Boolean status = controller.checkUser(new RegisterModel("Ram", "Dangol", "ram@gmail.com", "9800000", "user1","123455","What is your name?","Ram"));
        assertEquals(true, status);
    }    
}
