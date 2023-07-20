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
import model.SoupsModel;
import view.Soups;

/**
 *
 * @author User
 */
public class SoupsController {
    SoupsModel model;
    Soups view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    public SoupsController(Soups view, ActionListener Save, ActionListener Delete, ActionListener Update, ActionListener Show){
        this.view = view;
        view.saveSoupsListner(Save);
        view.deleteSoupsListner(Delete);
        view.updateSoupsListner(Update);
        view.showSoupsListener(Show);
    }
    
    
    
//    public void actionPerformed(Soups view, ActionListener Save) {
//        this.view = view;
//        view.saveSoupsListner(Save);
//    }
//    
//    
//    public void actionPerformed(Soups view, ActionListener Delete) {
//        this.view = view;
//        view.deleteSoupsListner(Delete);
//       }
    
    
    public void addButtonClicked(String itemNo, String itemName, String quantity, String price, JTable soup) {
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
                
                DefaultTableModel tableModel = (DefaultTableModel) view.souptbl.getModel();
                tableModel.addRow(new Object[]{itemNo, itemName, quantity, price});
                soup = view.souptbl;

                try {
               

                JOptionPane.showMessageDialog(view, "Stock added successfully!");
            } catch (Exception e) {
              }
        }
             catch(Exception ex) {
                
                
            }
    
}
    
    
    public void deleteRow(JTable souptbl) {
        DefaultTableModel Model = (DefaultTableModel) souptbl.getModel();

        if (souptbl.getSelectedRowCount() == 1) {
            int selectedRow = souptbl.getSelectedRow();
            String itemNoToDelete = souptbl.getValueAt(selectedRow, 0).toString(); // Assuming itemNo is in the first column

            Model.removeRow(selectedRow);
            
            JOptionPane.showMessageDialog(view, "Data Deleted", "Authentic Nepali", JOptionPane.INFORMATION_MESSAGE);           
              view.myreset();
        }else {
            JOptionPane.showMessageDialog(view, "Please select a single row for deletion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void updateRow(String itemNoValue, String itemNameValue, String quantityValue, String priceValue) {
        DefaultTableModel Model = (DefaultTableModel) view.souptbl.getModel();
        int selectedRow = view.souptbl.getSelectedRow();

        if (selectedRow == -1) {
            if (view.souptbl.getRowCount() == 0) {
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
        DefaultTableModel Model = (DefaultTableModel) view.souptbl.getModel();
        Model.setRowCount(0);

        }
}
            
            
        
        

    

