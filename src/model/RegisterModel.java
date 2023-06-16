/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class RegisterModel {
    String Fname, Lname,Email,Phone, Username, Password;
    
    public RegisterModel(String Fname,String Lname, String Email,String Phone ,String Username,String Password){
        this.Username= Username;
        this.Email = Email;
        this.Fname= Fname;
        this.Lname= Lname;
        this.Password=Password;
        this.Phone= Phone;
    }
    
    public String getFName() {
        return Fname;
    }

    public void setFName(String FName) {
        this.Fname = FName;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }    
}
