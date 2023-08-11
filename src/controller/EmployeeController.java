/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmployeeModel;
import view.EmployeeInfo;
import java.sql.SQLIntegrityConstraintViolationException; 

public class EmployeeController {
    EmployeeModel model;
    EmployeeInfo view;
    ResultSet rs;
    PreparedStatement pst = null;
    Connection conn = null;
    int nextId; // Variable to hold the next available id value

    public EmployeeController(EmployeeInfo view) {
        this.view = view;
        view.addloginlistner(new SaveListener());
        view.addShowListener(new ShowListener());
        view.addUpdateListener(new UpdateListener() );
        view.addDeleteListener(new DeleteListener());


        try {
            // Initialize the database connection here
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");

            // Initialize nextId when the controller is created
            nextId = getMaxIdFromDatabase() + 1;
        } catch (Exception e) {
            // Properly handle any exceptions during database connection setup
            JOptionPane.showMessageDialog(view, "Error connecting to the database: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getUser();
                boolean success = checkUser(model);
            if (success) {
                view.setMessage("Data inserted successfully");
            } else {
                view.setMessage("Data already saved or error occurred");
            }
            view.clearTextFields();
            } catch (Exception e1) {
                // Properly handle the exception
                JOptionPane.showMessageDialog(view, "Error saving data: " + e1.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                e1.printStackTrace();
            }
        }
    }

    public boolean checkUser(EmployeeModel user) throws Exception {
        try {
            String sql = "insert into employee1 (id, Fname, Lname, Position, email, Phone) values (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            // Set the retrieved nextId as the id for the new row
            pst.setInt(1, nextId);
            pst.setString(2, user.getFirstName());
            pst.setString(3, user.getLastName());
            pst.setString(4, user.getPosition());
            pst.setString(5, user.getEmail());
            pst.setString(6, user.getPhoneNumber());
            pst.executeUpdate();

            // Increment nextId for the next insertion
            nextId++;
            
            return true; // Data inserted successfully
        } catch (SQLIntegrityConstraintViolationException e) {
        if (e.getMessage().contains("Duplicate entry")) {
            // Properly handle the duplicate entry error
            return false;
        } else {
            // Handle other errors
            JOptionPane.showMessageDialog(view, "Error inserting data: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }        
        } catch (Exception e2) {
            // Properly handle the exception
            JOptionPane.showMessageDialog(view, "Error inserting data: " + e2.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e2.printStackTrace();
            return false;
        }
    }

    private int getMaxIdFromDatabase() {
        int maxId = 0;
        try {
            String sql = "SELECT MAX(id) AS max_id FROM employee1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                maxId = rs.getInt("max_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return maxId;
    }

    private void closeResources() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException en) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, en);
        }
    }
    
    
    
   

class ShowListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Check if the connection is closed and reestablish the connection if needed
            if (conn.isClosed()) {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "at123thapa");
            }
            
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID");
            tableModel.addColumn("First Name");
            tableModel.addColumn("Last Name");
            tableModel.addColumn("Position");
            tableModel.addColumn("email");
            tableModel.addColumn("Phone");

            String sql = "SELECT * FROM employee1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                int id =rs.getInt("id");
//                String id = rs.getString("id");
                String firstName = rs.getString("Fname");
                String lastName = rs.getString("Lname");
                String position = rs.getString("Position");
                String email = rs.getString("Email");
                String phone = rs.getString("Phone");
                tableModel.addRow(new Object[] { id, firstName, lastName, position, email, phone });
            }

            view.setTableModel(tableModel);
        } catch (SQLException e3) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, e3);
        }
    }
    }
    

      class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Your update code here...
            // For example:
            int selectedRowIndex = view.getSelectedRowIndex();
            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(view, "Please select a row to update.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

//            int id = Integer.parseInt((String) view.getValueAt(selectedRowIndex, 0));
            int id = (int) view.getValueAt(selectedRowIndex, 0);

            EmployeeModel updatedModel = view.getUserFromView(selectedRowIndex);
            if (updateUser(id, updatedModel)) {
                JOptionPane.showMessageDialog(view, "Data updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                // If the update is successful, you can also refresh the table to reflect the changes
//                view.updateRowInTable(id, updatedModel);
                view.updateRowInTable(id, updatedModel,view.getYourTable());
                refreshTable();
                view.clearTextFields();

            } else {
                JOptionPane.showMessageDialog(view, "Error updating data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void refreshTable() {
    try {
        String sql = "SELECT id, Fname, Lname, Position, Email, Phone FROM employee1";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Position");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone");

        while (rs.next()) {
            int id = rs.getInt("id");
            String firstName = rs.getString("Fname");
            String lastName = rs.getString("Lname");
            String position = rs.getString("Position");
            String email = rs.getString("Email");
            String phone = rs.getString("Phone");

            // Add the data as a new row in the default table
            tableModel.addRow(new Object[]{id, firstName, lastName, position, email, phone});
        }

        // Set the updated tableModel to the view
        view.setTableModel(tableModel);

    } catch (Exception e4) {
        // Properly handle the exception
        JOptionPane.showMessageDialog(view, "Error refreshing table: " + e4.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        e4.printStackTrace();
    } finally {
        closeResources();
    }
}

    public boolean updateUser(int id, EmployeeModel updatedModel) {
        try {
            String sql = "UPDATE employee1 SET Fname=?, Lname=?, Position=?, Email=?, Phone=? WHERE id=?";
            pst = conn.prepareStatement(sql);

            pst.setString(1, updatedModel.getFirstName());
            pst.setString(2, updatedModel.getLastName());
            pst.setString(3, updatedModel.getPosition());
            pst.setString(4, updatedModel.getEmail());
            pst.setString(5, updatedModel.getPhoneNumber());
            pst.setInt(6, id);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }
        } catch (Exception e5) {
            // Properly handle the exception
            JOptionPane.showMessageDialog(view, "Error updating data: " + e5.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e5.printStackTrace();
        }//finally{
//        closeResources();
//        }
        return false;
    }
    
    class DeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRowIndex = view.getSelectedRowIndex();
            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(view, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int id = (int) view.getValueAt(selectedRowIndex, 0);
            if (deleteUser(id)) {
                JOptionPane.showMessageDialog(view, "Data deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                // If the delete is successful, refresh the table to reflect the changes
                RefreshTable();
                view.clearTextFields();
//                view.clearSelection();
            } else {
                JOptionPane.showMessageDialog(view, "Error deleting data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public boolean deleteUser(int id) {
    try {
        // Delete the row with the specified id from the database
        String deleteSql = "DELETE FROM employee1 WHERE id=?";
        try (PreparedStatement pst = conn.prepareStatement(deleteSql)) {
            pst.setInt(1, id);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                // If the row was deleted successfully, update the remaining rows' ids
                String updateSql = "UPDATE employee1 SET id = id - 1 WHERE id > ?";
                try (PreparedStatement updatePst = conn.prepareStatement(updateSql)) {
                    updatePst.setInt(1, id);
                    updatePst.executeUpdate();
                }
                return true;
            }
        }
    } catch (Exception e6) {
        // Properly handle the exception
        JOptionPane.showMessageDialog(view, "Error deleting data: " + e6.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e6.printStackTrace();
        return false;
    }
    return false;
}
    public void RefreshTable() {
        // Similar to the ShowListener, fetch data from the database and update the table
        DefaultTableModel tableModel = new DefaultTableModel();
        // ... fetch data from the database ...
        view.setTableModel(tableModel);
    }

}







