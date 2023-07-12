
package view;


import java.awt.Image;
import java.awt.print.PrinterException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.*;



public class NewDashboard extends javax.swing.JFrame {
    
    DashboardModel model;
    /**
     * Creates new form NewDashboard
     */
    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;
    
    public NewDashboard() {
        initComponents();   
        currentDate();
        
      
    }
    
     public void currentDate()
    {
        Calendar cal=new GregorianCalendar();
        int month= cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day= cal.get(Calendar.DAY_OF_MONTH);
        date_txt.setText(year+"/"+(month+1)+"/"+day);
    }
    public void init(){
        setImage();
    }
    
    
    
    
 public void reset(){
        jSpinnermomoqty.setValue(0);
            jSpinnerpizza.setValue(0);
            jSpinnerburger.setValue(0);
            jSpinnerthakali.setValue(0);
            jSpinnerchowmein.setValue(0);
            jSpinnersoup.setValue(0);
            jSpinnerdrinks.setValue(0);
            jSpinnercoffee.setValue(0);
            jSpinnericecream.setValue(0);
            txtTax.setText("0.0");
            txtAmount.setText("0.0");
            txtTotal.setText("0.0"); 
            momoCheck.setSelected(false);
            pizzaCheck.setSelected(false);
            burgerCheck.setSelected(false);
            thakaliCheck.setSelected(false);
            chowmeinCheck.setSelected(false);
            soupCheck.setSelected(false);
            drinksCheck.setSelected(false);
            coffeeCheck.setSelected(false);
            icecreamCheck.setSelected(false);
            jTextAreaBill.setText("*********************CODER'S CAFE*********************");
            btnTotal.setEnabled(true);
    }
 
 
  public void coderscafe(){
        
        jTextAreaBill.setText("*********************CODER'S CAFE*********************"+
                "\n"+ "                               Date:"+date_txt.getText());
        
    
  }
  public void qty(){
      
  }
  
   public void setImage() {
    
    ImageIcon icon = new ImageIcon(getClass().getResource("\\Restaurant-Management-System\\src\\view\\icons"));
    Image img = icon.getImage().getScaledInstance(imagemomo.getWidth(), imagemomo.getHeight(), Image.SCALE_SMOOTH);
    imagemomo.setIcon(new ImageIcon(img));
}
   
    public void dudate(){
        System.out.println(getTax(tax));
        double taxAmount = getTax(tax);  
        String formattedTax = String.format("%.0f", taxAmount);  
        System.out.println(formattedTax);  // Output: 12 (without decimal value)
        txtTax.setText(String.valueOf(formattedTax));
        txtAmount.setText(String.valueOf(total));
        txtTotal.setText(String.valueOf(total+getTax(tax)));
    }
    
    public double getTax(double t){
        double taxrate = 0.13;
        return total*taxrate;
    } 
    
    public DashboardModel getTotal(){
        double t=Double.parseDouble(txtTax.getText());
        double amt = Double.parseDouble(txtAmount.getText());
        double tot = Double.parseDouble(txtTotal.getText());
        model = new DashboardModel(t,tot,amt);
        return model;
        }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelmomo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpricemomo = new javax.swing.JLabel();
        jSpinnermomoqty = new javax.swing.JSpinner();
        momoCheck = new javax.swing.JCheckBox();
        imagemomo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelpizza = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpricepizza = new javax.swing.JLabel();
        jSpinnerpizza = new javax.swing.JSpinner();
        pizzaCheck = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabelburger = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpriceburger = new javax.swing.JLabel();
        jSpinnerburger = new javax.swing.JSpinner();
        burgerCheck = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabelthakali = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jpricethalaki = new javax.swing.JLabel();
        jSpinnerthakali = new javax.swing.JSpinner();
        thakaliCheck = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabelchowmein = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jpricechowmein = new javax.swing.JLabel();
        jSpinnerchowmein = new javax.swing.JSpinner();
        chowmeinCheck = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabelsoup = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jpricesoup = new javax.swing.JLabel();
        jSpinnersoup = new javax.swing.JSpinner();
        soupCheck = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabelcolddrinks = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jpricedrinks = new javax.swing.JLabel();
        jSpinnerdrinks = new javax.swing.JSpinner();
        drinksCheck = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabelcoffee = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jpricecoffee = new javax.swing.JLabel();
        jSpinnercoffee = new javax.swing.JSpinner();
        coffeeCheck = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabelicecream = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jpriceicecream = new javax.swing.JLabel();
        jSpinnericecream = new javax.swing.JSpinner();
        icecreamCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBill = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabelmomo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelmomo.setText("Momo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Quantity:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Purchase:");

        jpricemomo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricemomo.setText("120");

        jSpinnermomoqty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jSpinnermomoqty.setRequestFocusEnabled(false);
        jSpinnermomoqty.setVerifyInputWhenFocusTarget(false);

        momoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momoCheckActionPerformed(evt);
            }
        });

        imagemomo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemomo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\view\\icons"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpricemomo)
                            .addComponent(momoCheck))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSpinnermomoqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabelmomo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemomo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemomo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelmomo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jpricemomo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinnermomoqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(momoCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelpizza.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelpizza.setText("Pizza");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Price:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Quantity:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Purchase:");

        jpricepizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricepizza.setText("350");

        jSpinnerpizza.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        pizzaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelpizza))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpricepizza)
                            .addComponent(jSpinnerpizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pizzaCheck))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelpizza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jpricepizza, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpinnerpizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pizzaCheck, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jLabelburger.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelburger.setText("Burger");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Price:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Quantity:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Purchase:");

        jpriceburger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpriceburger.setText("160");

        jSpinnerburger.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        burgerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpriceburger, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinnerburger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelburger)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelburger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jpriceburger, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jSpinnerburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(burgerCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelthakali.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelthakali.setText("Thakali khana set");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Price:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Quantity:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Purchase:");

        jpricethalaki.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricethalaki.setText("600");

        jSpinnerthakali.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        thakaliCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thakaliCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpricethalaki)
                            .addComponent(thakaliCheck))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerthakali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabelthakali)
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelthakali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jpricethalaki, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jSpinnerthakali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(thakaliCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelchowmein.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelchowmein.setText("Chowmein");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Price:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Quantity:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Purchase:");

        jpricechowmein.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricechowmein.setText("100");

        jSpinnerchowmein.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        chowmeinCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chowmeinCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpricechowmein)
                            .addComponent(chowmeinCheck)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerchowmein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelchowmein, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabelchowmein)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpricechowmein, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jSpinnerchowmein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(chowmeinCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelsoup.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelsoup.setText("Veg. Soup");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Price:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Quantity:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Purchase:");

        jpricesoup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricesoup.setText("80");

        jSpinnersoup.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        soupCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soupCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpricesoup)
                            .addComponent(jSpinnersoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soupCheck)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelsoup)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelsoup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jpricesoup, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jSpinnersoup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soupCheck)
                        .addContainerGap())))
        );

        jLabelcolddrinks.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelcolddrinks.setText("Cold drinks");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Price:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Quantity:");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Purchase:");

        jpricedrinks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricedrinks.setText("40");

        jSpinnerdrinks.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        drinksCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerdrinks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpricedrinks, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drinksCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelcolddrinks)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelcolddrinks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jpricedrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jSpinnerdrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(drinksCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelcoffee.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelcoffee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelcoffee.setText(" Cappuccino");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Price:");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Quantity:");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Purchase:");

        jpricecoffee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpricecoffee.setText("180");

        jSpinnercoffee.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        coffeeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffeeCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnercoffee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffeeCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpricecoffee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelcoffee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelcoffee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jpricecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jSpinnercoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel42))
                    .addComponent(coffeeCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelicecream.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelicecream.setText("Ice-cream ");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Price:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Quantity:");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("Purchase:");

        jpriceicecream.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpriceicecream.setText("100");

        jSpinnericecream.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        icecreamCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icecreamCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelicecream)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpriceicecream))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icecreamCheck))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnericecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabelicecream, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jpriceicecream, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jSpinnericecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel47)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icecreamCheck)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Coder's Cafe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel49.setText("Bill");

        date_txt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        date_txt.setForeground(new java.awt.Color(255, 255, 255));
        date_txt.setText("Date");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1:30PM ");

        jTextAreaBill.setColumns(20);
        jTextAreaBill.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBill);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel50.setText("Tax:");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel51.setText("Amount:");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel52.setText("Total amount:");

        txtTax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnTotal.setBackground(new java.awt.Color(51, 153, 0));
        btnTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 153, 0));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReceipt.setBackground(new java.awt.Color(51, 153, 0));
        btnReceipt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 153, 0));
        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Confirm Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnTotal)
                            .addGap(94, 94, 94)
                            .addComponent(btnReceipt)
                            .addGap(163, 163, 163)
                            .addComponent(btnExit))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(jLabel49))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel51)
                                            .addComponent(jLabel50))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(90, 90, 90)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnReset)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel49)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_txt)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotal)
                    .addComponent(btnReceipt)
                    .addComponent(btnExit))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1982, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //      qtyIsZero();

    if(momoCheck.isSelected()){
    int qty = Integer.parseInt(jSpinnermomoqty.getValue().toString());
        boolean isQtyZero = false;
            //
            //
    if (qty != 0) {
    x++;
    if (x == 1){
        coderscafe();
    }
                //
    double price = qty * 120.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelmomo.getText() +"\n"+"  Price:"+"\t" + price +
                    "\n"+"  Quantity:"+"\t"+jSpinnermomoqty.getValue()+"\n");
    dudate();
    }else{

        momoCheck.setSelected(true);
    }}

 //     qtyIsZero2();
    if(pizzaCheck.isSelected()){
    int qty = Integer.parseInt(jSpinnerpizza.getValue().toString());
     boolean isQtyZero = false;

                //qtyIsZero2(); // Call the method with void return type

    if (qty != 0) {
         x++;
    if (x == 1) {
        coderscafe();
}
    double price = qty * 350.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelpizza.getText() +"\n"+"  Price:"+"\t" + price+
                        "\n"+"  Quantity:"+"\t"+jSpinnerpizza.getValue()+"\n");
    dudate();
    }else{
    pizzaCheck.setSelected(false);
}}

 //        qtyIsZero3();
    if(burgerCheck.isSelected()){
    int qty3 = Integer.parseInt(jSpinnerburger.getValue().toString());
    boolean isQtyZero = false;

    if (qty3 != 0) {
    x++;
    if (x == 1) {
        coderscafe();
 }
    double price = qty3 * 140.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelburger.getText() +"\n"+"  Price:"+"\t" + price+
                            "\n"+"  Quantity:"+"\t"+jSpinnerburger.getValue()+"\n");
    dudate();
}else{
       burgerCheck.setSelected(false);
}}


    //    qtyIsZero4();
    if(thakaliCheck.isSelected()){
    int qty4 = Integer.parseInt(jSpinnerthakali.getValue().toString());
                        //boolean isQtyZero = false;

    if (qty4 != 0 ) {
     x++;
    if (x == 1) {
        coderscafe();
}

    double price = qty4 * 600.0;
    total +=price;
     getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelthakali.getText() +"\n"+"  Price:"+"\t" + price+
                                "\n"+"  Quantity:"+"\t"+jSpinnerthakali.getValue()+"\n");
    dudate();
}else{
    thakaliCheck.setSelected(false);
    }}


    //        qtyIsZero5();
    if(chowmeinCheck.isSelected()){
    int qty5 = Integer.parseInt(jSpinnerchowmein.getValue().toString());
                            //boolean isQtyZero = false;

    if (qty5 != 0) {
     x++;
    if (x == 1) {
        coderscafe();
}

    double price = qty5 * 100.0;
    total +=price;
    getTax((double) total);
     jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelchowmein.getText() +"\n"+"  Price:"+"\t" + price+
                                    "\n"+"  Quantity:"+"\t"+jSpinnerchowmein.getValue()+"\n");
    dudate();
}else{
    chowmeinCheck.setSelected(false);
}}

    //    qtyIsZero6();
    if(soupCheck.isSelected()){
    int qty6 = Integer.parseInt(jSpinnersoup.getValue().toString());
        //boolean isQtyZero = false;

    if (qty6 != 0) {
        x++;
    if (x == 1) {
}
    coderscafe();
    double price = qty6 * 80.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelsoup.getText() +"\n"+"  Price:"+"\t" + price+
                                        "\n"+"  Quantity:"+"\t"+jSpinnersoup.getValue()+"\n");
    dudate();
}else{
        soupCheck.setSelected(false);
}   }

    
 //    qtyIsZero7();
    if(drinksCheck.isSelected()){
    int qty7 = Integer.parseInt(jSpinnerdrinks.getValue().toString());
                                    //boolean isQtyZero = false;

     if (qty7 != 0 ) {
     x++;
    if (x == 1) {
    }
    coderscafe();
    double price = qty7 * 40.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelcolddrinks.getText() +"\n"+"  Price:"+"\t" + price+
                       "\n"+"  Quantity:"+"\t"+jSpinnerdrinks.getValue()+"\n");
        dudate();
     }else{                                        
         drinksCheck.setSelected(false);
}}

 //     qtyIsZero8();
    if(coffeeCheck.isSelected()){
    int qty8 = Integer.parseInt(jSpinnercoffee.getValue().toString());
                                        //boolean isQtyZero = false;

    if (qty8 != 0) {
        x++;
        if (x == 1) {
            coderscafe();
}

    double price = qty8 * 180.0;
    total +=price;
    getTax((double) total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelcoffee.getText() +"\n"+"  Price:"+"\t" + price+
                                                "\n"+"  Quantity:"+"\t"+jSpinnerdrinks.getValue()+"\n");
    dudate();
}else{
        coffeeCheck.setSelected(false);
}}

  //      qtyIsZero9();
    if(icecreamCheck.isSelected()){
    int qty9 = Integer.parseInt(jSpinnericecream.getValue().toString());
                                            //boolean isQtyZero = false;
    if (qty9 != 0) {
        x++;
    if (x == 1) {
        coderscafe();
}

    double price = qty9 * 100.0;
    total +=price;
    getTax((double)total);
    jTextAreaBill.append("\n"+x + "\n"+"  Item Name: "+"\t" + jLabelicecream.getText() +"\n"+"  Price:"+"\t" + price+
                                                   "\n"+"  Quantity:"+"\t"+jSpinnericecream.getValue()+"\n");
    dudate();
}else{
    icecreamCheck.setSelected(false);
}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        try{
            jTextAreaBill.print();
        }catch(PrinterException ex){

        }
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        if(total==0.0){
            JOptionPane.showMessageDialog(null,"You havenot selected and time");
        }else{
            jTextAreaBill.setText(jTextAreaBill.getText()
                +"Tax:          \t\t"+txtTax.getText()+"\n"
                +"Amount:       \t\t"+txtAmount.getText()+"\n"
                +"Total Amount:\t\t"+txtTotal.getText()+"\n"
            );
            btnTotal.setEnabled(false);
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTaxActionPerformed

    private void icecreamCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icecreamCheckActionPerformed

    }//GEN-LAST:event_icecreamCheckActionPerformed

    private void coffeeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffeeCheckActionPerformed

    }//GEN-LAST:event_coffeeCheckActionPerformed

    private void drinksCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksCheckActionPerformed

    }//GEN-LAST:event_drinksCheckActionPerformed

    private void soupCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soupCheckActionPerformed

    }//GEN-LAST:event_soupCheckActionPerformed

    private void chowmeinCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chowmeinCheckActionPerformed

    }//GEN-LAST:event_chowmeinCheckActionPerformed

    private void thakaliCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thakaliCheckActionPerformed

    }//GEN-LAST:event_thakaliCheckActionPerformed

    private void burgerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerCheckActionPerformed

    }//GEN-LAST:event_burgerCheckActionPerformed

    private void pizzaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaCheckActionPerformed

    }//GEN-LAST:event_pizzaCheckActionPerformed

    private void momoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momoCheckActionPerformed

    }//GEN-LAST:event_momoCheckActionPerformed

           
    
    
    
    
    
      
           
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
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewDashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox burgerCheck;
    private javax.swing.JCheckBox chowmeinCheck;
    private javax.swing.JCheckBox coffeeCheck;
    private javax.swing.JLabel date_txt;
    private javax.swing.JCheckBox drinksCheck;
    private javax.swing.JCheckBox icecreamCheck;
    private javax.swing.JLabel imagemomo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelburger;
    private javax.swing.JLabel jLabelchowmein;
    private javax.swing.JLabel jLabelcoffee;
    private javax.swing.JLabel jLabelcolddrinks;
    private javax.swing.JLabel jLabelicecream;
    private javax.swing.JLabel jLabelmomo;
    private javax.swing.JLabel jLabelpizza;
    private javax.swing.JLabel jLabelsoup;
    private javax.swing.JLabel jLabelthakali;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerburger;
    private javax.swing.JSpinner jSpinnerchowmein;
    private javax.swing.JSpinner jSpinnercoffee;
    private javax.swing.JSpinner jSpinnerdrinks;
    private javax.swing.JSpinner jSpinnericecream;
    private javax.swing.JSpinner jSpinnermomoqty;
    private javax.swing.JSpinner jSpinnerpizza;
    private javax.swing.JSpinner jSpinnersoup;
    private javax.swing.JSpinner jSpinnerthakali;
    private javax.swing.JTextArea jTextAreaBill;
    private javax.swing.JLabel jpriceburger;
    private javax.swing.JLabel jpricechowmein;
    private javax.swing.JLabel jpricecoffee;
    private javax.swing.JLabel jpricedrinks;
    private javax.swing.JLabel jpriceicecream;
    private javax.swing.JLabel jpricemomo;
    private javax.swing.JLabel jpricepizza;
    private javax.swing.JLabel jpricesoup;
    private javax.swing.JLabel jpricethalaki;
    private javax.swing.JCheckBox momoCheck;
    private javax.swing.JCheckBox pizzaCheck;
    private javax.swing.JCheckBox soupCheck;
    private javax.swing.JCheckBox thakaliCheck;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
