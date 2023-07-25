/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
//import static java.awt.AWTEventMulticaster.add;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;
import view.AuthenticNepali;
/**
 *
 * @author User
 */
public class AuthenticNepaliController {
    AuthenticNepaliModel model;
    AuthenticNepali view;
    ResultSet rs;
    PreparedStatement pst =null;
    
    
    public AuthenticNepaliController(AuthenticNepali view, ActionListener Save, ActionListener Delete, ActionListener Update, ActionListener Show){
        this.view = view;
        this.model = model;
        view.saveAuthenticNepaliListner(Save);
        view.deleteAuthenticNepaliListner(Delete);
        view.updateAuthenticNepaliListner(Update);
        view.showAuthenticNepaliListner(Show);
        
    }
    
   
       

    
//    class a implements ActionListener{
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
                
                DefaultTableModel tableModel = (DefaultTableModel) view.AuthenticNepalitbl.getModel();
                tableModel.addRow(new Object[]{itemNo, itemName, quantity, price});
                AuthenticNepalistock = view.AuthenticNepalitbl;

                try {
               

                JOptionPane.showMessageDialog(view, "Stock added successfully!");
            } catch (Exception e) {
              }
        }
             catch(Exception ex) {
                
                
            }
    
}
    
    
    public void deleteRow(JTable AuthenticNepalitbl) {
        DefaultTableModel Model = (DefaultTableModel) AuthenticNepalitbl.getModel();

        if (AuthenticNepalitbl.getSelectedRowCount() == 1) {
            int selectedRow = AuthenticNepalitbl.getSelectedRow();
            String itemNoToDelete = AuthenticNepalitbl.getValueAt(selectedRow, 0).toString(); // Assuming itemNo is in the first column

            Model.removeRow(selectedRow);
            
            JOptionPane.showMessageDialog(view, "Data Deleted", "Authentic Nepali", JOptionPane.INFORMATION_MESSAGE);           
              view.myreset();
        }else {
            JOptionPane.showMessageDialog(view, "Please select a single row for deletion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void updateRow(String itemNoValue, String itemNameValue, String quantityValue, String priceValue) {
        DefaultTableModel Model = (DefaultTableModel) view.AuthenticNepalitbl.getModel();
        int selectedRow = view.AuthenticNepalitbl.getSelectedRow();

        if (selectedRow == -1) {
            if (view.AuthenticNepalitbl.getRowCount() == 0) {
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
        setAuthenticNepaliStock();
    }

    // Method to set drinks stock in the JTable
    public void setAuthenticNepaliStock() {
        // Clear existing data in the JTable
        DefaultTableModel Model = (DefaultTableModel) view.AuthenticNepalitbl.getModel();
        Model.setRowCount(0);

        }
    }
    
//}

    
    
    


            
        
        

    

