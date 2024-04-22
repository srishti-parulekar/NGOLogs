package tanvi;

import dao.ConnectionProvider;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static tanvi.Volunteer_dashboard.userId;

public class Donator_dashboard extends javax.swing.JFrame {

    public static int ngo_id;
    public static int userId;

    public Donator_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void close()
    {
        WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
        
    public Donator_dashboard(int ngo_id, int userId) {
        this.ngo_id = ngo_id;
        this.userId = userId;
        initComponents();
        setLocationRelativeTo(null);

        PayButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                String amount = amountContributed.getText();
                if (!isNumeric(amount)) {
                    showError("Please enter a valid amount (numbers only).");
                    amountContributed.selectAll();
                } else {

                    String selectedValue = ChooseBankDropDownMenu.getSelectedItem().toString();

                    String iciciURL = "https://www.icicibank.com/";
                    String sbiURL = "https://www.onlinesbi.sbi/";
                    String hdfcURL = "https://www.hdfcbank.com/";

                    String defaultURL = "https://www.google.com/";

                    String selectedURL = defaultURL;

                    if (selectedValue.equalsIgnoreCase("ICICI")) {
                        selectedURL = iciciURL;
                    } else if (selectedValue.equalsIgnoreCase("SBI")) {
                        selectedURL = sbiURL;
                    } else if (selectedValue.equalsIgnoreCase("HDFC")) {
                        selectedURL = hdfcURL;
                    }
                    try {
                        System.out.println("yes");
                        java.awt.Desktop.getDesktop().browse(new java.net.URI(selectedURL));
                    } catch (java.io.IOException | java.net.URISyntaxException ex) {
                        //catch(Exception ex){
                        ex.printStackTrace();
                    }
                    dispose();
                }

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DonatorHeader = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ContributeLabel = new javax.swing.JLabel();
        amountContributed = new javax.swing.JTextField();
        PayButton = new javax.swing.JButton();
        ContributeLabel1 = new javax.swing.JLabel();
        ChooseBankDropDownMenu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        DonatorHeader.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        DonatorHeader.setForeground(new java.awt.Color(255, 255, 255));
        DonatorHeader.setText("Donor Form");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Go Back");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(DonatorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DonatorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContributeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ContributeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ContributeLabel.setText("Choose your bank:");
        jPanel2.add(ContributeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 186, 40));
        jPanel2.add(amountContributed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 280, 30));

        PayButton.setBackground(new java.awt.Color(153, 255, 102));
        PayButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PayButton.setText("PAY");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        jPanel2.add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        ContributeLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ContributeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ContributeLabel1.setText("<html>Enter Amount to Contribute:");
        jPanel2.add(ContributeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        ChooseBankDropDownMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICICI", "SBI", "HDFC" }));
        ChooseBankDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseBankDropDownMenuActionPerformed(evt);
            }
        });
        jPanel2.add(ChooseBankDropDownMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tanvi/educationImg.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseBankDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseBankDropDownMenuActionPerformed

    }//GEN-LAST:event_ChooseBankDropDownMenuActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConnectionProvider.getCon();

            String sql = "insert into donor (ngo_ID, user_id, amountContributed,bank) values (?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, ngo_id);
            pstm.setInt(2, userId);

            String amountStr = amountContributed.getText();
            int amount = Integer.parseInt(amountStr);

            // Validate if a bank is selected
            String selectedBank = (String) ChooseBankDropDownMenu.getSelectedItem();
            if (selectedBank == null) {
                showError("Please select a bank.");
                return; // Stop further execution
            }

            pstm.setInt(3, amount);
            pstm.setString(4, selectedBank);

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Donor added!");
            conn.close();

//        } catch (ClassNotFoundException cnfe) {
//            JOptionPane.showMessageDialog(null, "MySQL JDBC driver not found. Please check your JDBC driver configuration.");
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "An error occurred while executing the SQL query. Details: " + sqle.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Details: " + e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_PayButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        new UserDashboard(userId).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donator_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseBankDropDownMenu;
    private javax.swing.JLabel ContributeLabel;
    private javax.swing.JLabel ContributeLabel1;
    private javax.swing.JLabel DonatorHeader;
    private javax.swing.JButton PayButton;
    private javax.swing.JTextField amountContributed;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
