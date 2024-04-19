package tanvi;

// all swing components support <html> --> can be used to wrap text
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import java.sql.ResultSet;

public class NGODashboard extends javax.swing.JFrame {

    private boolean isUpdating = false; // a flag to check if the revenue is continously updating or not

    private boolean showRefreshButton = false;

    public NGODashboard() {
        initComponents();
        RefreshRevenueButton.setVisible(false);
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        AboutBtn = new javax.swing.JButton();
        NumberOfVolunteers1 = new javax.swing.JButton();
        RevenueBtn1 = new javax.swing.JButton();
        aboutLabel = new javax.swing.JLabel();
        VolunteersLabel = new javax.swing.JLabel();
        DonorLabel = new javax.swing.JLabel();
        RevenueGeneratedLabel = new javax.swing.JLabel();
        RefreshRevenueButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 0, 104));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tanvi/user.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 0));
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 100));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("My Profile");
        sidePanel.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 50));

        SearchBtn.setBackground(new java.awt.Color(0, 0, 0));
        SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("Search People");
        SearchBtn.setAutoscrolls(true);
        SearchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        SearchBtn.setPreferredSize(new java.awt.Dimension(140, 50));
        sidePanel.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 100, 50));

        AboutBtn.setBackground(new java.awt.Color(0, 0, 0));
        AboutBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        AboutBtn.setText("About");
        AboutBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        AboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutBtnActionPerformed(evt);
            }
        });
        sidePanel.add(AboutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 40));

        NumberOfVolunteers1.setBackground(new java.awt.Color(0, 0, 0));
        NumberOfVolunteers1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NumberOfVolunteers1.setForeground(new java.awt.Color(255, 255, 255));
        NumberOfVolunteers1.setText("<html> Number of Contributors");
        NumberOfVolunteers1.setAutoscrolls(true);
        NumberOfVolunteers1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        NumberOfVolunteers1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NumberOfVolunteers1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumberOfVolunteers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfVolunteers1ActionPerformed(evt);
            }
        });
        SearchBtn.setPreferredSize(new java.awt.Dimension(140, 50));
        sidePanel.add(NumberOfVolunteers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 50));

        RevenueBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RevenueBtn1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        RevenueBtn1.setForeground(new java.awt.Color(255, 255, 255));
        RevenueBtn1.setText("<html>Revenue Generated");
        RevenueBtn1.setAutoscrolls(true);
        RevenueBtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        RevenueBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RevenueBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RevenueBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueBtn1ActionPerformed(evt);
            }
        });
        SearchBtn.setPreferredSize(new java.awt.Dimension(140, 50));
        sidePanel.add(RevenueBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, 50));

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        aboutLabel.setBackground(new java.awt.Color(0, 0, 0));
        aboutLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mainPanel.add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 590));

        VolunteersLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mainPanel.add(VolunteersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 230, 80));

        DonorLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mainPanel.add(DonorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 336, 220, 80));

        RevenueGeneratedLabel.setBackground(new java.awt.Color(0, 0, 0));
        RevenueGeneratedLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mainPanel.add(RevenueGeneratedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 306, 320, 60));

        RefreshRevenueButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RefreshRevenueButton.setText("Refresh");
        RefreshRevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshRevenueButtonActionPerformed(evt);
            }
        });
        mainPanel.add(RefreshRevenueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SearchDashboard s = new SearchDashboard();
        s.setVisible(true);

    }//GEN-LAST:event_SearchBtnActionPerformed

    private void AboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBtnActionPerformed
        // TODO add your handling code here:
        aboutLabel.setVisible(true);
        VolunteersLabel.setVisible(false);
        DonorLabel.setVisible(false);
        RevenueGeneratedLabel.setVisible(false);

        String ngoInfo = "";
        try {
            ngoInfo = getNGOInfoFromDatabase(2024004);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NGODashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        aboutLabel.setText("<html>" + ngoInfo + "<html>");
    }//GEN-LAST:event_AboutBtnActionPerformed

    private void NumberOfVolunteers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfVolunteers1ActionPerformed
        // TODO add your handling code here:

        aboutLabel.setVisible(false);
        VolunteersLabel.setVisible(true);
        DonorLabel.setVisible(true);
        RevenueGeneratedLabel.setVisible(false);

        String numVol = "";
        String numDon = "";
        int userID = 0;

        try {
            numVol = getVolInfoFromDatabase(2024004);
            numDon = getDonInfoFromDatabase(2024004);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NGODashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        VolunteersLabel.setText("<html> Number of Volunteers: " + numVol + "<html>");
        System.out.println();
        DonorLabel.setText("<html> Number of Donors: " + numDon + "<html>");

    }//GEN-LAST:event_NumberOfVolunteers1ActionPerformed

    private void RevenueBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenueBtn1ActionPerformed
        // TODO add your handling code here:

        aboutLabel.setVisible(false);
        VolunteersLabel.setVisible(false);
        DonorLabel.setVisible(false);
        RevenueGeneratedLabel.setVisible(true);

        int userID = 0;
        int currentRevenue = getRevenueFromDatabase(2024004);
        RevenueGeneratedLabel.setText("Revenue Generated: " + currentRevenue);
        showRefreshButton = true;
        RefreshRevenueButton.setVisible(showRefreshButton);
    }//GEN-LAST:event_RevenueBtn1ActionPerformed


    private void RefreshRevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshRevenueButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("refersh button clicked");
        if (!isUpdating) {
            isUpdating = true;
            Thread updateThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTime = System.currentTimeMillis();
                    while (isUpdating) {
                        int currentRevenue = getRevenueFromDatabase(2024004);
                        int newRevenue = currentRevenue + 5;
                        updateRevenueInDatabase(2024004, newRevenue);
                        int nR = getRevenueFromDatabase(2024004);
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                RevenueGeneratedLabel.setText("Current Revenue generated: " + nR);
                            }
                        });

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (System.currentTimeMillis() - startTime >= 10000) {
                            isUpdating = false;
                            break;
                        }
                    }
                }
            });
            updateThread.start();
        } else {
            isUpdating = false;
        }
    }//GEN-LAST:event_RefreshRevenueButtonActionPerformed

    private String getNGOInfoFromDatabase(int userID) throws ClassNotFoundException {
        String ngoInfo = "";
        ResultSet rs;

        try {
            // establishing database connection and prepare statement
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");

            // prepare sql statement
            String query = "select ngo.about from ngo inner join ngologintables on ngo.ngoid = ngologintables.ngo_ID inner join person on ngologintables.user_id = person.userID where person.userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userID); // sets the value of the first parameter in the SQL query to ngoID

            rs = pstmt.executeQuery();

            if (rs.next()) {
                ngoInfo = rs.getString("about");
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngoInfo;
    }

    private String getVolInfoFromDatabase(int userID) throws ClassNotFoundException {
        String numVol = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");

            // prepare sql statement
            String query = "select ngo.num_volunteers, ngo.num_donors from ngo inner join ngologintables on ngo.ngoid = ngologintables.ngo_ID inner join person on ngologintables.user_id = person.userID where person.userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userID); // sets the value of the first parameter in the SQL query to ngoID

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                numVol = rs.getString("num_volunteers"); // pass in the column name
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return numVol;
    }

    private String getDonInfoFromDatabase(int userID) throws ClassNotFoundException {
        String numVol = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");

            // prepare sql statement
            String query = "select ngo.num_volunteers, ngo.num_donors from ngo inner join ngologintables on ngo.ngoid = ngologintables.ngo_ID inner join person on ngologintables.user_id = person.userID where person.userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userID); // sets the value of the first parameter in the SQL query to ngoID

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                numVol = rs.getString("num_volunteers"); // pass in the column name
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return numVol;
    }

    private int getRevenueFromDatabase(int userID) {
        int rev = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");

            // prepare sql statement
            String query = "select ngo.revenue_generated from ngo inner join ngologintables on ngo.ngoid = ngologintables.ngo_ID inner join person on ngologintables.user_id = person.userID where person.userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userID); // sets the value of the first parameter in the SQL query to ngoID

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                rev = rs.getInt("revenue_generated");
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rev;
    }

    private int updateRevenueInDatabase(int userID, int newRevenue) {
        int updatedRev = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");
            String query = "update ngo set revenue_generated = ? where ngoid = (select ngo_id from ngologintables where user_id = ?)";

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, newRevenue);
            pstmt.setInt(2, userID);

            int rowsAffected = pstmt.executeUpdate();

            pstmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return updatedRev;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGODashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutBtn;
    private javax.swing.JLabel DonorLabel;
    private javax.swing.JButton NumberOfVolunteers1;
    private javax.swing.JButton RefreshRevenueButton;
    private javax.swing.JButton RevenueBtn1;
    private javax.swing.JLabel RevenueGeneratedLabel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel User;
    private javax.swing.JLabel VolunteersLabel;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
