/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class RegisterModel {
    String fname, lname,email,phone, Username, pass, securityque, answer;
    
    public RegisterModel(String Fname,String Lname, String Email,String Phone ,String Username,String Password, String Answer, String Security){
        this.Username= Username;
        this.email = Email;
        this.fname= Fname;
        this.lname= Lname;
        this.pass = Password;
        this.phone= Phone;
        this.securityque = Security;
        this.answer = Answer;
    }
    
    public String getfname() {
        return fname;
    }

    public void setfname(String Fname) {
        this.fname = Fname;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String Lname) {
        this.lname = Lname;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String Email) {
        this.email = Email;
    }

    public String getpass() {
        return pass;
    }

    public void setpass (String Password) {
        this.pass = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String Phone) {
        this.phone = Phone;
    }    
    
    public String getsecurityque() {
        return securityque;
    }

    public void setsecurityque(String Security){
        this.securityque = Security;
    }  
    
    public String getanswer() {
        return answer;
    }

    public void setanswer(String Answer) {
        this.answer = Answer;
    }    
}
