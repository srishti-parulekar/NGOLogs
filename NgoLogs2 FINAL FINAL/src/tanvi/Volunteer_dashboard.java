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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        VolunteerHeader.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VolunteerHeader.setForeground(new java.awt.Color(255, 255, 255));
        VolunteerHeader.setText("Volunteer Form");

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
                .addGap(21, 21, 21)
                .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 153));

        InterestTextLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        InterestTextLabel.setText("Mention at least 3 interests:");

        AvailabilityLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        AvailabilityLabel.setText("Mention your availability:");

        MorningButton.setBackground(new java.awt.Color(255, 255, 153));
        MorningButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MorningButton.setText("Morning");
        MorningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MorningButtonActionPerformed(evt);
            }
        });

        EveningButton.setBackground(new java.awt.Color(255, 255, 153));
        EveningButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EveningButton.setText("Evening");

        WhyUsLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        WhyUsLabel.setText("Why join us?");

        WhyUsTextArea.setColumns(20);
        WhyUsTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        WhyUsTextArea.setRows(5);
        WhyUsTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(WhyUsTextArea);

        AfternoonButton.setBackground(new java.awt.Color(255, 255, 153));
        AfternoonButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AfternoonButton.setText("Afternoon");
        AfternoonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfternoonButtonActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(0, 204, 0));
        SubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        SkillsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsTextFieldActionPerformed(evt);
            }
        });

        InterestsTextArea.setBackground(new java.awt.Color(255, 255, 153));
        InterestsTextArea.setColumns(20);
        InterestsTextArea.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
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

        SubmitButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SubmitButton1.setText("CLEAR");
        SubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(WhyUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(InterestTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InterestsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkillsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AvailabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MorningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AfternoonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EveningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(SubmitButton)
                .addGap(43, 43, 43)
                .addComponent(SubmitButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SkillsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InterestTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterestsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MorningButton)
                            .addComponent(AfternoonButton)
                            .addComponent(EveningButton))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WhyUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(SubmitButton1))
                .addGap(48, 48, 48))
        );

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
