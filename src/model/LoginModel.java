/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class LoginModel {
    String username, password;
    public LoginModel(String username, String password){
        this.username= username;
        this.password= password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
     @Test
    public void testGetData() {
        // Arrange
        model.LoginModel model = new model.LoginModel(username, password);
        model.setUsername(username);
        model.setPassword(password);

        // Act
        String user = model.getUsername();
        String pass = model.getPassword();

        // Assert
        assertEquals(username, user);
        assertEquals(password, pass);
    }

    @Test
    public void testSetData() {
        // Arrange
        model.LoginModel model = new model.LoginModel(username, password);

        // Act
        model.setUsername(username);
        model.setPassword(password);
        

        // Assert
        assertEquals(username, model.getUsername());
        assertEquals(password, model.getPassword());
    }
}


