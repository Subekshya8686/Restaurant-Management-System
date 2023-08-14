///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import model.*;
//import view.*;
////import model.staffModel;
//
///**
// *
// * @author dell
// */
//public class staffController {
//    staffModel model;
//    staff view;
//    ResultSet rs;
//    Connection connection;
//    PreparedStatement statement;
//    List<staffModel> staffList;
//    
//    
//    public staffController(staffModel model, List<staffModel> staffList, staff view){
//        this.view=view;
//        this.model=model;
//        this.staffList = staffList;
////       new AddStaff().addStaff();
//    
//    }
//    
//    
////    class AddStaff{
//    public void addStaff(String name, String position, String email, String phone){
//        String query = "INSERT INTO staff1 (name, position, email, phone) VALUES (?, ?, ?, ?)";
//        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
//            statement = connection.prepareStatement(query);
//            
//            
//            // Get the auto-generated ID of the newly inserted row
//            int generatedId = 0;
//            try(ResultSet generatedKeys = statement.getGeneratedKeys()){
//                if (generatedKeys.next()){
//                    generatedId = generatedKeys.getInt(0);
//                }
//            }
//            staffModel newStaff=new staffModel(name,position,email,phone);
//            
//            // Add the new staff to the staffList (if applicable)
//            staffList.add(newStaff);
//            
//            // Add the new staff to the view's table
//            view.addRowToTable(name, position, email, phone);
//            
//            JOptionPane.showMessageDialog(null, "Staff1 added successfully!");
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error: Failed to add staff");
//            e.printStackTrace();
//
//            Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, e);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            closeResources();
//        }
//    }
////}
//
//   /* public void addstaff(String name, String position, String email, String phone) {
//        String query = "INSERT INTO staff (name, position, email, phone) VALUES (?, ?, ?, ?)";
//        try {           
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
////            String query = "INSERT INTO staff (name, position, email, phone_number) VALUES (?, ?, ?, ?)";
//            statement = connection.prepareStatement(query);
//            
//            statement.setString(1, name);
//            statement.setString(2, position);
//            statement.setString(3, email);
//            statement.setString(4, phone);
//            statement.executeUpdate();
//           
//            
////            model.setName(name);
////            model.setPosition(position);
////            model.setEmail(email);
////            model.setPhone(phone);
//            
//             // Create a new staffModel object without the ID
//            staffModel newStaff = new staffModel(name, position, email, phone);  
//            staffList.add(newStaff);
//        
//            
//                                    
//            
//            view.addRowToTable(name,position ,email,phone);
//            
////            staffModel staff = new staffModel(name, position, email, phone);
////            staffModel.addstaffModel(staff);
////            
//            JOptionPane.showMessageDialog(null,"Staff added successfully!");
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error:Failed to add staff");
//            e.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            closeResources();
//        }
//    }*/
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
////    public void addRowToTable(staffModel staff) {
////    // Retrieve the necessary information from the staffModel object
////    String name = staff.getName();
////    String position = staff.getPosition();
////    String email = staff.getEmail();
////    String phone = staff.getPhone();
////
////    // Add the retrieved information to the table
////    DefaultTableModel tablemodel = (DefaultTableModel) view.gettableStaffs().getModel();
////    model.addRow(new Object[]{name, position, email, phone});
////}
////    
//    
//    
//    public void updateStaff(String name, String position, String email, String phone) {
//        int selectedRow=view.gettableStaffs().getSelectedRow();
//        
//        if(selectedRow!=-1){
//            staffModel selectedStaff =retrieveStaffModelFromSelectedRow(selectedRow);
//            if (selectedStaff != null){
//                
// 
//                int id=selectedStaff.getId();// Retrieve the ID of the selected staff
//                
//                
//               // SQL query to update staff information 
//               String query = "UPDATE staff1 SET name = ?, position = ?, email = ?, phone = ? WHERE id = ?";
//               
//                try {
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
//                    statement = connection.prepareStatement(query);
//                    
//                    // Set the parameter values
//                    statement.setString(1, name);
//                    statement.setString(2, position);
//                    statement.setString(3, email);
//                    statement.setString(4, phone);
//                    statement.setInt(5, id);
//                    
//                    // Execute the update query
//                    statement.executeUpdate();
//                    
//                    selectedStaff.setName(name); // Update the name in the selected staff model
//                    selectedStaff.getPosition();
//                    selectedStaff.setEmail(email);
//                    selectedStaff.getPhone();
//                    
//                    
//                    
//                    // Update the row in the view's table with the updated staff information
//                    view.updateRowInTable(selectedRow, name, position, email, phone);
////                    view.clearFields(); // Clear the fields in the view
//
//
//                    JOptionPane.showMessageDialog(null, "Staff information updated successfully!");
//                } catch (ClassNotFoundException ex) {
//                    JOptionPane.showMessageDialog(null, "Error: Failed to update staff");
//                    Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SQLException ex) {
//                    Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//                }finally{
//                    closeResources();
//                }
//
//            }else{
//                System.out.println("Failed to retrieve staff model for the selected row.");
//            }
//
//        }else{
//            System.out.println("No row selected in the table.");
//        }
//        
//    }
//
//    private staffModel retrieveStaffModelFromSelectedRow(int selectedRow) {
//    if (selectedRow >= 0 && selectedRow < staffList.size()) {
//        return staffList.get(selectedRow);
//    }
//    return null;
//}
//    
//    
//    
//    
//    public void deleteSelectedStaff() {
//    int selectedRow = view.gettableStaffs().getSelectedRow();
//    if (selectedRow != -1) {
//        staffModel selectedStaff = retrieveStaffModelFromSelectedRow(selectedRow);
//        if (selectedStaff != null) {
//            int id = selectedStaff.getId(); // Retrieve the ID of the selected staff
//            
//            String query = "DELETE FROM staff1 WHERE id = ?";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
//                statement = connection.prepareStatement(query);
//                
//                // Remove the selected staff from the staffList (if applicable)
//                staffList.remove(selectedStaff);
//                
//                // Remove the selected staff from the view's table
//                view.removeRowFromTable(selectedRow);
//                
//                JOptionPane.showMessageDialog(null, "Staff deleted successfully!");
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, "Error: Failed to delete staff");
//                e.printStackTrace();
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                closeResources();
//            }
//        } else {
//            System.out.println("Failed to retrieve staff model for the selected row.");
//        }
//    } else {
//        System.out.println("No row selected in the table.");
//    }
//}
////    public void deleteStaff(staffModel staff) {
////             
////        
////        String query = "DELETE FROM staff WHERE id = ?";
////
////        try{
////            PreparedStatement statement = connection.prepareStatement(query);
////            statement.setInt(1, staff.getId());
////            statement.executeUpdate();
////
////            staffModel.removeStaff(staff);    
////        } catch (SQLException ex) {
////            Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
////        }
////    
//    
//    /*public void deleteStaff(int rowIndex){
//        if (rowIndex >= 0){
////            String name=model.getName();
//            DefaultTableModel tableModel = (DefaultTableModel) view.gettableStaffs().getModel();
//            tableModel.removeRow(rowIndex);
//            System.out.println(rowIndex);
//            
//            String query = "DELETE FROM staff WHERE id = ?";
//            try{
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
////                establishConnection();
//                statement = connection.prepareStatement(query);
//                statement.setInt(1, rowIndex+1);
////                statement.setString(1, name);
//                statement.executeUpdate();
//                
//                view.clearFields();
//                JOptionPane.showMessageDialog(null, "Staff deleted successfully!");
//            }catch(SQLException e){
//                JOptionPane.showConfirmDialog(null, "Failed to delete staff");
//            
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(staffController.class.getName()).log(Level.SEVERE, null, ex);
//            }finally{
//                closeResources();
//            }
//                
//                
//    }else{
//            JOptionPane.showMessageDialog(null, "Please select a staff to delete");
//        } 
//    }
//    */
//
//    
//    
//    
//    
//    public void showButtonActionPerformed() {
//    try {
//        establishConnection();
//        
//        // Create a SQL query+
//        String query = "SELECT * FROM staff1";
//        PreparedStatement statement = connection.prepareStatement(query);
//        
//        // Execute the query
//        ResultSet resultSet = statement.executeQuery();
//        
//        // Clear the table model
//        DefaultTableModel tableModel = (DefaultTableModel) view.gettableStaffs().getModel();
//        tableModel.setRowCount(0);
//        
//        // Add data from the result set to the table model
//        while (resultSet.next()) {
//            String name = resultSet.getString("name");
//            String position = resultSet.getString("position");
//            String email = resultSet.getString("email");
//            String phone = resultSet.getString("phone");
//            
//            tableModel.addRow(new Object[]{name, position, email, phone});
//        }
//        
//        // Close the result set and statement
//        resultSet.close();
//        statement.close();
//        
//        // Clear the fields
//        view.clearFields();
//        
//        JOptionPane.showMessageDialog(null, "Staff details loaded successfully!");
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Error: Failed to load staff details");
//        e.printStackTrace();
//    } finally {
//        closeResources();
//    }
//}
//    
//    
//    public void establishConnection() throws SQLException{
//        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
//    }
//    private void closeResources(){
//        
//        try{
//            if (statement!=null){
//            statement.close();
//            }
//            if(connection!=null){
//            connection.close();
//            }
//        }catch(SQLException e){
//            e.printStackTrace();    
//        }
//    }
//
//   
//
//    
//    
//    
//    
//}
//        
