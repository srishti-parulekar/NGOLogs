package tanvi;

import dao.ConnectionProvider;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class NGOTableForUserDashboard extends javax.swing.JFrame {

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    public int userId;

    public NGOTableForUserDashboard(int userId) throws ClassNotFoundException {
        initComponents();
        this.userId = userId;
        displayNGODetails();
        setLocationRelativeTo(null);
    }

    private NGOTableForUserDashboard() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NGOTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NGOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGO", "Email", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(NGOTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 463, 443));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 455, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        new UserDashboard(userId).setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayNGODetails() throws ClassNotFoundException {
        String ngoName = "";
        String ngoEmail = "";
        String ngoCity = "";

        //Connection conn = null;
        PreparedStatement pstmt = null;
        java.sql.ResultSet rs = null;
//        try {
////            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = ConnectionProvider.getCon();

// First query for donor
        try {
            Connection conn = ConnectionProvider.getCon();
            DefaultTableModel tblModel = (DefaultTableModel) NGOTable.getModel();
            // Query for donor
            String donorQuery = "SELECT ngoname, city, email FROM ngo WHERE ngoID IN (SELECT ngo_ID FROM donor WHERE user_ID = ?)";
            PreparedStatement donorStmt = conn.prepareStatement(donorQuery);
            donorStmt.setInt(1, userId);
            ResultSet donorRs = donorStmt.executeQuery();

            // Query for volunteer
            String volunteerQuery = "SELECT ngoname, city, email FROM ngo WHERE ngoID IN (SELECT ngoID FROM volunteer WHERE user_ID = ?)";
            PreparedStatement volunteerStmt = conn.prepareStatement(volunteerQuery);
            volunteerStmt.setInt(1, userId);
            ResultSet volunteerRs = volunteerStmt.executeQuery();

            // Processing donor result set
            while (donorRs.next()) {
                String ngoName1 = donorRs.getString("ngoname");
                String ngoCity1 = donorRs.getString("city");
                String ngoEmail1 = donorRs.getString("email");

                String tbData[] = {ngoName1,ngoEmail1,ngoCity1};

                tblModel.addRow(tbData);
            }
            donorRs.close();
            donorStmt.close();

            // Processing volunteer result set
            if (volunteerRs.next()) {
                String ngoName2 = volunteerRs.getString("ngoname");
                String ngoCity2 = volunteerRs.getString("city");
                String ngoEmail2 = volunteerRs.getString("email");

                String tbData[] = {ngoName2, ngoCity2, ngoEmail2};

                tblModel.addRow(tbData);
            }
            volunteerRs.close();
            volunteerStmt.close();

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGOTableForUserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NGOTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
