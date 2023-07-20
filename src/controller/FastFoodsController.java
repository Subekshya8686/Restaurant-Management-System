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
    
    public FastFoodsController(FastFoods view, ActionListener Save, ActionListener Delete, ActionListener Update, ActionListener Show){
        this.view = view;
        this.model = model;
        view.saveFastFoodsListner(Save);
        view.deleteFastFoodsListener(Delete);
        view.updateFastFoodsListener(Update);
        view.showFastFoodsListener(Show);
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
                
                DefaultTableModel tableModel = (DefaultTableModel) view.fastfoodstbl.getModel();
                tableModel.addRow(new Object[]{itemNo, itemName, quantity, price});
                fastfoods = view.fastfoodstbl;

                try {
               

                JOptionPane.showMessageDialog(view, "Stock added successfully!");
            } catch (Exception e) {
              }
        }
             catch(Exception ex) {
                
                
            }
    
}
    
    
    public void deleteRow(JTable fastfoodstbl) {
        DefaultTableModel Model = (DefaultTableModel) fastfoodstbl.getModel();

        if (fastfoodstbl.getSelectedRowCount() == 1) {
            int selectedRow = fastfoodstbl.getSelectedRow();
            String itemNoToDelete = fastfoodstbl.getValueAt(selectedRow, 0).toString(); // Assuming itemNo is in the first column

            Model.removeRow(selectedRow);
            
            JOptionPane.showMessageDialog(view, "Data Deleted", "Authentic Nepali", JOptionPane.INFORMATION_MESSAGE);           
              view.myreset();
        }else {
            JOptionPane.showMessageDialog(view, "Please select a single row for deletion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void updateRow(String itemNoValue, String itemNameValue, String quantityValue, String priceValue) {
        DefaultTableModel Model = (DefaultTableModel) view.fastfoodstbl.getModel();
        int selectedRow = view.fastfoodstbl.getSelectedRow();

        if (selectedRow == -1) {
            if (view.fastfoodstbl.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Stock is empty!!");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to update!!");
            }
        } else {
            Model.setValueAt(itemNoValue, selectedRow, 0);
            Model.setValueAt(itemNameValue, selectedRow, 1);
            Model.setValueAt(quantityValue, selectedRow, 2);
            Model.setValueAt(priceValue, selectedRow, 3);

            JOptionPane.showMessageDialog(null, "Update Successful!!");
        }
    }
    
    
    
    
    public void showButtonClicked() {
        setFastFoodsStock();
    }

    // Method to set drinks stock in the JTable
    public void setFastFoodsStock() {
        // Clear existing data in the JTable
        DefaultTableModel Model = (DefaultTableModel) view.fastfoodstbl.getModel();
        Model.setRowCount(0);

        }
}
            
            
        
        

    

