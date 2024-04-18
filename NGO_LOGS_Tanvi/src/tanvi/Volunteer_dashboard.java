package tanvi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;


public class Volunteer_dashboard extends javax.swing.JFrame {

    String skills;
    String interests;
    boolean morning;

    public Volunteer_dashboard() {
        initComponents();
        addRadioButtonsGroup();

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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        VolunteerHeader.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        VolunteerHeader.setForeground(new java.awt.Color(255, 255, 255));
        VolunteerHeader.setText("Volunteer Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(VolunteerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
        MorningButton.setText("Mornings");
        MorningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MorningButtonActionPerformed(evt);
            }
        });

        EveningButton.setBackground(new java.awt.Color(255, 255, 153));
        EveningButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EveningButton.setText("Evenings");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AvailabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MorningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AfternoonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EveningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(WhyUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(SubmitButton)
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(InterestTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InterestsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkillsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(25, 25, 25))
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

    private void EveningButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String errorMessage = "";
        int numCorrectFields = 0;
        final int NUM_FIELDS = 4;

        if (SkillsTextField.getText().isEmpty()) {
            errorMessage = errorMessage.concat("Cannot be empty");
        } else {
            if (SkillsTextField.getText().matches(".*\\d+.*")) {
                errorMessage = errorMessage.concat("Skills field cannot contain numbers\n");
            } else {
                numCorrectFields++;
                skills = SkillsTextField.getText();
            }
        }

        if (MorningButton.isSelected() || AfternoonButton.isSelected() || EveningButton.isSelected()) {
            numCorrectFields++;
            morning = MorningButton.isSelected();
        } else {
            errorMessage = errorMessage.concat("cannot be empty");
        }
        if (InterestsTextField.getText().isEmpty()) {
            errorMessage = errorMessage.concat("Interests field cannot be empty\n");
        } else {
            if (InterestsTextField.getText().matches(".*\\d+.*")) {
                errorMessage = errorMessage.concat("Interests field cannot contain numbers\n");
            } else {
                numCorrectFields++;
            }
        }
        if (WhyUsTextArea.getText().isEmpty()) {
            errorMessage = errorMessage.concat("field cannot be empty");
        } else {
            numCorrectFields++;
        }

        if (numCorrectFields == NUM_FIELDS) {
            // add submission to database here
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, errorMessage, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
    private javax.swing.JLabel VolunteerHeader;
    private javax.swing.JLabel WhyUsLabel;
    private javax.swing.JTextArea WhyUsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
