/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.FastFoodsModel;
import view.FastFoods;

/**
 *
 * @author User
 */
public class FastFoodsController {
    FastFoodsModel model;
    FastFoods view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    public FastFoodsController(FastFoods view, ActionListener Save){
        this.view = view;
        view.saveFastFoodsListner(Save);
    }
    
    public void addButtonClicked(String itemNo, String itemName, String quantity, String price, JTable fastfoods) {
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
                
                DefaultTableModel tableModel = (DefaultTableModel) view.fastfoods.getModel();
                tableModel.addRow(new Object[]{itemNo, itemName, quantity, price});
                fastfoods = view.fastfoods;

                try {
               

                JOptionPane.showMessageDialog(view, "Stock added successfully!");
            } catch (Exception e) {
              }
        }
             catch(Exception ex) {
                
                
            }
    
}
}
            
            
        
        

    

