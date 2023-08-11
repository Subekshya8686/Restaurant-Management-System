/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.NewDashboard;
import model.DashboardModel;

public class DashboardController {
    NewDashboard view;
    DashboardModel model;

   public DashboardController(NewDashboard view){
       this.view = view;
       
   }
//    
//   public void totalbutton(DashboardModel model, NewDashboard view ){
//       double tax = model.getTax();
//       double total = model.getTotal();
//       try{
//           model = view.getTotal(); 
////           System.out.println(getTax(tax));
//        double taxAmount = view.getTax(tax);  
////        double Total = view.gettxt();
//        String formattedTax = String.format("%.0f", taxAmount);  
//        System.out.println(formattedTax);  // Output: 12 (without decimal value)
//        txtTax.setText(String.valueOf(formattedTax));
//        txtAmount.setText(String.valueOf(total));
//        txtTotal.setText(String.valueOf(total+ taxAmount));
//    
//       }
//       catch(){
//           
//       }
   }
   
