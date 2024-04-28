package tanvi;

// all swing components support <html> --> can be used to wrap text
import dao.ConnectionProvider;
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

    //private boolean isUpdating = false; // a flag to check if the revenue is continously updating or not
    private boolean showRefreshButton = false;
    String fname;
    String lname;
    public int userId;

    public NGODashboard(int userId) {
        initComponents();
        RefreshRevenueButton.setVisible(false);
        setLocationRelativeTo(null);
    }

    public NGODashboard() {
        initComponents();
        RefreshRevenueButton.setVisible(false);
        setLocationRelativeTo(null);
    }

    public NGODashboard(int userId, String fname, String lname) {
        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        initComponents();
        RefreshRevenueButton.setVisible(false);
        setLocationRelativeTo(null);

        

        User.setText(this.fname + " " + this.lname);
        User.setText("Welcome " + this.fname + " " + this.lname + " !");

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
        SearchBtn = new javax.swing.JButton();
        User = new javax.swing.JLabel();
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

        sidePanel.setBackground(new java.awt.Color(0, 0, 104));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tanvi/user.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(0, 0));
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 110, 110));

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
        sidePanel.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 50));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("My Profile");
        sidePanel.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

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
        sidePanel.add(AboutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 40));

        NumberOfVolunteers1.setBackground(new java.awt.Color(0, 0, 0));
        NumberOfVolunteers1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NumberOfVolunteers1.setForeground(new java.awt.Color(255, 255, 255));
        NumberOfVolunteers1.setText("<html><center>Number of<br>Contributors</center></html>");
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
        sidePanel.add(NumberOfVolunteers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 50));

        RevenueBtn1.setBackground(new java.awt.Color(0, 0, 0));
        RevenueBtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RevenueBtn1.setForeground(new java.awt.Color(255, 255, 255));
        RevenueBtn1.setText("<html><center>Revenue<br>Generated</center></html>");
        RevenueBtn1.setActionCommand("<html><center>Revenue<br>Generated</center></html>");
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
        sidePanel.add(RevenueBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 50));

        aboutLabel.setBackground(new java.awt.Color(0, 0, 0));
        aboutLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        VolunteersLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        DonorLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        RevenueGeneratedLabel.setBackground(new java.awt.Color(0, 0, 0));
        RevenueGeneratedLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        RefreshRevenueButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RefreshRevenueButton.setText("Refresh");
        RefreshRevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshRevenueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(RefreshRevenueButton))
                    .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(VolunteersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RevenueGeneratedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(RefreshRevenueButton))
                    .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(DonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(VolunteersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(RevenueGeneratedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        SearchDashboard s = new SearchDashboard(userId, fname, lname);
        s.setVisible(true);

    }//GEN-LAST:event_SearchBtnActionPerformed

    private void AboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBtnActionPerformed
        // TODO add your handling code here:

        VolunteersLabel.setVisible(false);
        DonorLabel.setVisible(false);
        RefreshRevenueButton.setVisible(false);
        showRefreshButton = false; // Reset the flag
        RevenueGeneratedLabel.setVisible(false);

        String ngoInfo = "";
        try {
            ngoInfo = getNGOInfoFromDatabase();
            aboutLabel.setVisible(true);

            aboutLabel.setText("<html>" + ngoInfo + "<html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NGODashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
//        aboutLabel.setVisible(true);
//
//        aboutLabel.setText("<html>" + ngoInfo + "<html>");
    }//GEN-LAST:event_AboutBtnActionPerformed

    private void NumberOfVolunteers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfVolunteers1ActionPerformed
        // TODO add your handling code here:

        aboutLabel.setVisible(false);
        VolunteersLabel.setVisible(true);
        DonorLabel.setVisible(true);
        showRefreshButton = false; // Reset the flag
        RevenueGeneratedLabel.setVisible(false);
        RefreshRevenueButton.setVisible(false);

        String numVol = "";
        String numDon = "";
        //int userID = 0;

        try {
            numVol = getVolInfoFromDatabase();
            numDon = getDonInfoFromDatabase();
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

        //int userID = 0;
        int currentRevenue = getRevenueFromDatabase();
        RevenueGeneratedLabel.setText("Revenue Generated: " + currentRevenue);
        showRefreshButton = true;
        RefreshRevenueButton.setVisible(showRefreshButton);
    }//GEN-LAST:event_RevenueBtn1ActionPerformed


    private void RefreshRevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshRevenueButtonActionPerformed
        // TODO add your handling code here:
//        System.out.println("Refresh button clicked");
//        if (!isUpdating) {
//            isUpdating = true;
//            Thread updateThread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    long startTime = System.currentTimeMillis();
//                    while (isUpdating) {
//                        int currentRevenue = getRevenueFromDatabase(userId);
//                        int newRevenue = currentRevenue + 5;
//                        updateRevenueInDatabase(userId, newRevenue);
//                        int nR = getRevenueFromDatabase(userId);
//                        SwingUtilities.invokeLater(new Runnable() {
//                            @Override
//                            public void run() {
//                                RevenueGeneratedLabel.setText("Current Revenue generated: " + nR);
//                            }
//                        });
//
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        if (System.currentTimeMillis() - startTime >= 10000) {
//                            isUpdating = false;
//                            break;
//                        }
//                    }
//                }
//            });
//            updateThread.start();
//        } else {
        //isUpdating = false;
        // }

        System.out.println("Refresh button clicked");
        //int id = 0;
        int nr = getRevenueFromDatabase();// pass the userId from the backend
        RevenueGeneratedLabel.setText("Current Revenue generated: " + nr);


    }//GEN-LAST:event_RefreshRevenueButtonActionPerformed

    private String getNGOInfoFromDatabase() throws ClassNotFoundException {
        String ngoInfo = "";
        try {
            Connection conn = ConnectionProvider.getCon();
            String query = "{CALL ngo_about(?,?)}";
            CallableStatement stmt = conn.prepareCall(query);

            stmt.setInt(1, userId); // sets the value of the first parameter in the SQL query to ngoID
            stmt.registerOutParameter(2, Types.VARCHAR); // Register the output parameter
            stmt.execute();
            ngoInfo = stmt.getString(2);
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ngoInfo;
    }

    private String getVolInfoFromDatabase() throws ClassNotFoundException {
        int numVol = 0;

        try {
            Connection conn = ConnectionProvider.getCon();

            String query = "{CALL count_volunteers(?,?)}";
            CallableStatement stmt = conn.prepareCall(query);

            stmt.setInt(1, userId); // sets the value of the first parameter in the SQL query to ngoID
            stmt.registerOutParameter(2, Types.INTEGER); // Register the output parameter
            stmt.execute();
            numVol = stmt.getInt(2);
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String numVolStr = String.valueOf(numVol);
        return numVolStr;
    }

    private String getDonInfoFromDatabase() throws ClassNotFoundException {
        int numDonor = 0;

        try {
            Connection conn = ConnectionProvider.getCon();
            String query = "{CALL count_donors(?,?)}";
            CallableStatement stmt = conn.prepareCall(query);

            stmt.setInt(1, userId); // sets the value of the first parameter in the SQL query to ngoID
            stmt.registerOutParameter(2, Types.INTEGER); // Register the output parameter
            stmt.execute();
            numDonor = stmt.getInt(2);
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String numDonorStr = String.valueOf(numDonor);

        return numDonorStr;
    }

    private int getRevenueFromDatabase() {
        int rev = 0;

        try {
            Connection conn = ConnectionProvider.getCon();
            CallableStatement cstmt = conn.prepareCall("{CALL ngo_revenue (?, ?)}");
            cstmt.setInt(1, userId); // Set the input parameter
            cstmt.registerOutParameter(2, Types.INTEGER); // Register the output parameter
            cstmt.execute();

            rev = cstmt.getInt(2);
            cstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rev;
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
