/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;
import view.Drinks;
/**
 *
 * @author User
 */
public class DrinksController {
    DrinksModel model;
    Drinks view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    public DrinksController(Drinks view, ActionListener Save){
        this.view = view;
        view.saveDrinksListner(Save);
    }
    
    public void addButtonClicked(String itemNo, String itemName, String quantity, String price, JTable AuthenticNepalistock) {
            try{
                model = view.getData();
                
                if (itemNo.isEmpty() || itemName.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
                    JOptionPane.showMessageDialog(view,"Please enter all stocks");
            
                }else{
                    model.setItemNo(itemNo);
                    model.setItemName(itemName);
                    model.setQuantity(quantity);
                    model.setPrice(price);

                    }
                
                DefaultTableModel tableModel = (DefaultTableModel) view.Drinks.getModel();
                tableModel.addRow(new Object[]{itemNo, itemName, quantity, price});
                AuthenticNepalistock = view.Drinks;

                try {
               

                JOptionPane.showMessageDialog(view, "Stock added successfully!");
            } catch (Exception e) {
              }
        }
             catch(Exception ex) {
                
                
            }
    
}
}