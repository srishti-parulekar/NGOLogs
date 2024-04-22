package tanvi;

import dao.ConnectionProvider;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.*;

public class SearchDashboard extends javax.swing.JFrame {

    public static int userId;
    //public static int ngoId;

    public SearchDashboard(int userId) {
        this.userId=userId;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    public SearchDashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setSearchFieldPlaceholder();

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ids = searchBar.getText();
                int id=Integer.parseInt(ids);
                //String ngoid = searchBar.getText();
                //String ngoid = "1424001";
                if (!isNumeric(ids)) {
                    showError("Please enter a valid ID");
                    searchBar.selectAll();
                } else {
                    //int userId = Integer.parseInt(id);
                    filter(id); // automatically pass in the ngoid from backend
                }
            }
        });
    }

    private void setSearchFieldPlaceholder() {
        searchBar.setText("Search by User ID");

        searchBar.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if (searchBar.getText().equals("Search by User ID")) {
                    searchBar.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchBar.getText().isEmpty()) {
                    searchBar.setText("Search by User ID");
                }

            }
        });
    }

    private void filter(int uid) {
//        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            Connection conn = ConnectionProvider.getCon();

            //String query = "select * from personView where userID = ?";
            //String query = "SELECT * FROM person WHERE userId = ? AND EXISTS (SELECT * FROM donor WHERE userID = ?) AND EXISTS (SELECT * FROM volunteer WHERE userID = ?)";

            String query = "SELECT person.*, donor.amountContributed, volunteer.skills, volunteer.availability, volunteer.interests " +
               "FROM person " +
               "JOIN donor ON person.userId = donor.user_ID " +
               "JOIN volunteer ON person.userId = volunteer.user_ID " +
               "WHERE person.userId = ?";

            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, uid);
//            pstmt.setInt(2, uid);
//            pstmt.setInt(3,uid);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                //int userId2 = rs.getInt("userId");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String email = rs.getString("email");
                long phoneNumber = rs.getLong("phone");
                String date = rs.getString("dob");
                String address = rs.getString("address");
                String skills = rs.getString("skills");
                String interests = rs.getString("interests");
                String availability = rs.getString("availability");

                StringBuilder sb = new StringBuilder();
                //sb.append("User ID: ").append(userid).append(" \n\n");
                sb.append("First Name: ").append(fname).append(" \n\n");
                sb.append("Last Name: ").append(lname).append(" \n\n");
                sb.append("Email: ").append(email).append(" \n\n");
                sb.append("Phone Number: ").append(phoneNumber).append(" \n\n");
                sb.append("Date of Birth: ").append(date).append(" \n\n");
                sb.append("Address: ").append(address).append(" \n\n");
                sb.append("Skills: ").append(skills).append(" \n\n");
                sb.append("Interests: ").append(interests).append(" \n\n");
                sb.append("Availability: ").append(availability).append(" \n\n");

                resultArea.setText(sb.toString());
            } else {
                resultArea.setText("No contributor found with ID: " + userId);
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search Contributors based on ID");

        searchBar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultArea.setRows(5);
        resultArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                resultAreaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(resultArea);

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
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(searchButton)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
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

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchBarActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchButtonActionPerformed

    private void resultAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_resultAreaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_resultAreaAncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        new NGODashboard(userId).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
