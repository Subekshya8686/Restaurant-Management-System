/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Drinks extends javax.swing.JFrame {
    PreparedStatement pst = null;

    
     
    DefaultTableModel model = null;

    /**
     * Creates new form Drinks
     */
    public Drinks() {
        initComponents();
        
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fastfoods = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        fastfoods1 = new javax.swing.JTable();
        Show1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Drinks = new javax.swing.JTable();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        itemNo = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        savedata = new javax.swing.JButton();
        Show2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        fastfoods.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        fastfoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item Name", "Quantity", "Price"
            }
        ));
        fastfoods.setColumnSelectionAllowed(true);
        fastfoods.setGridColor(new java.awt.Color(216, 246, 210));
        fastfoods.setOpaque(false);
        jScrollPane1.setViewportView(fastfoods);

        fastfoods1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        fastfoods1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item Name", "Quantity", "Price"
            }
        ));
        fastfoods1.setColumnSelectionAllowed(true);
        fastfoods1.setGridColor(new java.awt.Color(216, 246, 210));
        fastfoods1.setOpaque(false);
        jScrollPane2.setViewportView(fastfoods1);

        Show1.setText("Show Stocks");
        Show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 190, 169));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks Stock", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Times New Roman", 3, 24))); // NOI18N

        Drinks.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Drinks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Item Name", "Quantity", "Price"
            }
        ));
        Drinks.setColumnSelectionAllowed(true);
        Drinks.setGridColor(new java.awt.Color(216, 246, 210));
        Drinks.setOpaque(false);
        jScrollPane3.setViewportView(Drinks);

        price.setBackground(new java.awt.Color(221, 190, 169));
        price.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        price.setAutoscrolls(false);
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(131, 197, 190));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        quantity.setBackground(new java.awt.Color(221, 190, 169));
        quantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quantity.setAutoscrolls(false);
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        itemName.setBackground(new java.awt.Color(221, 190, 169));
        itemName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemName.setAutoscrolls(false);
        itemName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Item No.");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        itemNo.setBackground(new java.awt.Color(221, 190, 169));
        itemNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemNo.setAutoscrolls(false);
        itemNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        itemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNoActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(16, 101, 82));
        update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update.setText("Update");
        update.setContentAreaFilled(false);
        update.setDefaultCapable(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        savedata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        savedata.setText("Save Data");
        savedata.setBorderPainted(false);
        savedata.setContentAreaFilled(false);
        savedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedataActionPerformed(evt);
            }
        });

        Show2.setText("Show Stocks");
        Show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show2ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savedata)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Show2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete)
                            .addComponent(update)
                            .addComponent(savedata)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(Show2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(itemNo.getText().equals("") || itemName.getText().equals("") || quantity.getText().equals("") || price.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter all stocks");
        }else{
            String data[] = {itemNo.getText(),itemName.getText(),quantity.getText(),price.getText()};
            DefaultTableModel model = (DefaultTableModel) Drinks.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(this, "Stock added auccessfully!!");
        }

        itemNo.setText("");
        itemName.setText("");
        quantity.setText("");
        price.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void itemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Drinks.getModel();

        if(Drinks.getSelectedRowCount() ==1){
            model.removeRow(Drinks.getSelectedRow());
        }else{
            if(Drinks.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Stock is empty!!");
            }else{
                JOptionPane.showMessageDialog(this, "Please select Single row for deletion");
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) Drinks.getModel();
        if(Drinks.getSelectedRowCount()==1){
            String ItemNo = itemNo.getText();
            String ItemName = itemName.getText();
            String Quantity = quantity.getText();
            String Price = price.getText();

            model.setValueAt(ItemNo,Drinks.getSelectedRow(),0);
            model.setValueAt(ItemName,Drinks.getSelectedRow(),1);
            model.setValueAt(Quantity,Drinks.getSelectedRow(),2);
            model.setValueAt(Price,Drinks.getSelectedRow(),3);

            JOptionPane.showMessageDialog(this, "Update Successfully!!");
        }else{
            if(Drinks.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Sotck is empty!!");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single row for update!!");
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void savedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Drinks.getModel();
        //        String name, position, email, phone;

        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Stock is Empty");
        }else{
            try{
                String ItemNo, ItemName, Quantity, Price;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","asdfgzxcv123");
                for(int i = 0; i<model.getRowCount();i++){
                    ItemNo = model.getValueAt(i,0).toString();
                    ItemName = model.getValueAt(i,1).toString();
                    Quantity = model.getValueAt(i,2).toString();
                    Price = model.getValueAt(i,3).toString();

                    String sql = "insert into drinks(itemNo,itemName,quantity,price) values (?,?,?,?)";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,ItemNo);
                    pst.setString(2,ItemName);
                    pst.setString(3,Quantity);
                    pst.setString(4,Price);

                    pst.execute();

                }

                JOptionPane.showMessageDialog(this,"Stocks insert successfully!!");
                model.setRowCount(0);
            }catch(Exception e){
            }
        }

        //        tableStaffs.setTableHeader("*******Staffs*******"+
            //                "\n\n");
        //
        //
        //        tableStaffs.setText(tableStaffs.getTableHeader()+"\n\n"+
            //                "Name: " + name.getText()+"\n\n"+
            //                "Position: " + position.getText()+"\n\n"+
            //                "Email: " + email.getText()+"\n\n" +
            //                "Phone Number: " + phone.getText()+"\n\n");
        //
        //
        //        txtPrint.setText(txtPrint.getText());
    }//GEN-LAST:event_savedataActionPerformed

    private void Show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show1ActionPerformed
        // TODO add your handling code here:
        setDrinksStock();
    
    }
    
    public void setDrinksStock(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","asdfgzxcv123");
            PreparedStatement pst = con.prepareStatement("select * from drinks");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String itemNo = rs.getString("itemN0");
                String itemName = rs.getString("itemName");
                String price = rs.getString("price");
                String quantity = rs.getString("Quantity");
                
                Object[] obj = {itemNo, itemName, quantity, price};
                
                model = (DefaultTableModel)Drinks.getModel();
                model.addRow(obj);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_Show1ActionPerformed

    private void Show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show2ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_Show2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Inventory().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Drinks;
    private javax.swing.JButton Show1;
    private javax.swing.JButton Show2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    public javax.swing.JTable fastfoods;
    public javax.swing.JTable fastfoods1;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton savedata;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
