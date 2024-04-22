package tanvi;

import dao.ConnectionProvider;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import java.sql.*;

public class Volunteer_dashboard extends javax.swing.JFrame {

    String skills;
    String interests;
    boolean morning;
    public static int ngo_id;
    public static int userId;
//    String skills;
//    String interests;
//    boolean morning;
//    String text;
//    String interest;

    public void close()
    {
        WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    public Volunteer_dashboard() {
        initComponents();
        addRadioButtonsGroup();
        setLocationRelativeTo(null);
    }

    public Volunteer_dashboard(int ngo_id, int userId) {
        initComponents();
        addRadioButtonsGroup();
        this.ngo_id = ngo_id;
        this.userId = userId;
        setLocationRelativeTo(null);

        SubmitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = SkillsTextField.getText();

                    if (isNumeric(text) || text == null) {
                        showError("Please enter letters or cannot be left empty.");
                        SkillsTextField.selectAll();
                    }
                    if (!MorningButton.isSelected() && !AfternoonButton.isSelected() && !EveningButton.isSelected()) {
                        showError("Please select an option.");
                    }

                    String interest = InterestsTextField.getText();
                    if (interest == null || isNumeric(interest)) {
                        showError("Please enter letters and cannot be left empty.");
                    }

                    String why = WhyUsTextArea.getText();
                    if (why == null || isNumeric(why)) {
                        showError("Please enter letters and cannot be left empty.");
                    } else {
                        // enter in db
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

//    public void setNgoId(int ngo_id) {
//        this.ngo_id = ngo_id;
//    }
    private void addRadioButtonsGroup() {
        ButtonGroup availabilityGroup = new ButtonGroup();
        availabilityGroup.add(MorningButton);
        availabilityGroup.add(AfternoonButton);
        availabilityGroup.add(EveningButton);
    }

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        VolunteerHeader = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        InterestTextLabel = new javax.swing.JLabel();
        AvailabilityLabel = new javax.swing.JLabel();
        MorningButton = new javax.swing.JRadioButton();
        EveningButton = new javax.swing.JRadioButton();
        WhyUsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WhyUsTextArea = new javax.swing.JTextArea();
        AfternoonButton = new javax.swing.JRadioButton();
        SubmitButton = new javax.swing.JButton();
        InterestsTextField = new javax.swing.JTextField();
        SkillsTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        InterestsTextArea = new javax.swing.JTextArea();
        SubmitButton1 = new javax.swing.JButton();
        backgroundImg = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        VolunteerHeader.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VolunteerHeader.setForeground(new java.awt.Color(255, 255, 255));
        VolunteerHeader.setText("Volunteer Form");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(74, 74, 74)
                .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InterestTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InterestTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        InterestTextLabel.setText("<html>Mention at least 3 interests:");
        jPanel2.add(InterestTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 158, 164, 40));

        AvailabilityLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AvailabilityLabel.setForeground(new java.awt.Color(255, 255, 255));
        AvailabilityLabel.setText("<html>Mention your availability:");
        jPanel2.add(AvailabilityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 242, 174, 57));

        MorningButton.setBackground(new java.awt.Color(0, 0, 0));
        MorningButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MorningButton.setForeground(new java.awt.Color(255, 255, 255));
        MorningButton.setText("Morning");
        MorningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MorningButtonActionPerformed(evt);
            }
        });
        jPanel2.add(MorningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 265, 98, -1));

        EveningButton.setBackground(new java.awt.Color(0, 0, 0));
        EveningButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EveningButton.setForeground(new java.awt.Color(255, 255, 255));
        EveningButton.setText("Evening");
        jPanel2.add(EveningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 265, 98, -1));

        WhyUsLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        WhyUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        WhyUsLabel.setText("<html>Why join us?");
        jPanel2.add(WhyUsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 333, 140, 40));

        WhyUsTextArea.setColumns(20);
        WhyUsTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        WhyUsTextArea.setRows(5);
        WhyUsTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(WhyUsTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 280, 50));

        AfternoonButton.setBackground(new java.awt.Color(0, 0, 0));
        AfternoonButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AfternoonButton.setForeground(new java.awt.Color(255, 255, 255));
        AfternoonButton.setText("Afternoon");
        AfternoonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfternoonButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AfternoonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 265, 98, -1));

        SubmitButton.setBackground(new java.awt.Color(0, 204, 0));
        SubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));
        jPanel2.add(InterestsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 167, 270, 50));

        SkillsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(SkillsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 54, 270, 50));

        InterestsTextArea.setBackground(new java.awt.Color(0, 0, 0));
        InterestsTextArea.setColumns(20);
        InterestsTextArea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InterestsTextArea.setForeground(new java.awt.Color(255, 255, 255));
        InterestsTextArea.setRows(5);
        InterestsTextArea.setText("Mention 3 interests separated by commas");
        jScrollPane2.setViewportView(InterestsTextArea);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        InterestsTextArea.setWrapStyleWord(true);

        InterestsTextArea.setLineWrap(true);
        InterestsTextArea.setEditable(false);
        InterestsTextArea.setFocusable(false);
        InterestsTextArea.setBorder(null);
        InterestsTextArea.updateUI();

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 54, 190, 60));

        SubmitButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SubmitButton1.setText("CLEAR");
        SubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(SubmitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tanvi/educationImg.jpg"))); // NOI18N
        jPanel2.add(backgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 470));

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
                        .addGap(0, 2, Short.MAX_VALUE)))
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

    private void MorningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MorningButtonActionPerformed

    }//GEN-LAST:event_MorningButtonActionPerformed

    private void AfternoonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfternoonButtonActionPerformed

    }//GEN-LAST:event_AfternoonButtonActionPerformed

    private void SkillsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkillsTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_SkillsTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConnectionProvider.getCon();

            String sql = "insert into Volunteer (user_id,ngoID,skills,interests,availability) values (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            //int vol_id = 2;
//            int user_id = 2024001;
            //int ngoid = 3;
            //pstm.setInt(1, vol_id);
            pstm.setInt(1, userId);
            pstm.setInt(2, ngo_id);
            pstm.setString(3, SkillsTextField.getText());
            pstm.setString(4, InterestsTextField.getText());
            //radio button 
            String availability = null;
            if (MorningButton.isSelected()) {
                availability = MorningButton.getText();
            }

            if (AfternoonButton.isSelected()) {
                availability = AfternoonButton.getText();
            }

            if (EveningButton.isSelected()) {
                availability = EveningButton.getText();
            }
            pstm.setString(5, availability);

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Volunteer added!");
            conn.close();

//        } catch (ClassNotFoundException cnfe) {
//            JOptionPane.showMessageDialog(null, "MySQL JDBC driver not found. Please check your JDBC driver configuration.");
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "An error occurred while executing the SQL query. Details: " + sqle.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Details: " + e.getMessage());
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void SubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        new UserDashboard(userId).setVisible(true);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        // Create a new instance of Volunteer_dashboard
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //int ngo_id = 1424003;
                new Volunteer_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AfternoonButton;
    private javax.swing.JLabel AvailabilityLabel;
    private javax.swing.JRadioButton EveningButton;
    private javax.swing.JLabel InterestTextLabel;
    private javax.swing.JTextArea InterestsTextArea;
    private javax.swing.JTextField InterestsTextField;
    private javax.swing.JRadioButton MorningButton;
    private javax.swing.JTextField SkillsTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton1;
    private javax.swing.JLabel VolunteerHeader;
    private javax.swing.JLabel WhyUsLabel;
    private javax.swing.JTextArea WhyUsTextArea;
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
