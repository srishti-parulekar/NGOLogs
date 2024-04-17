package tanvi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

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
                }
                else {
                    // enter in db
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
        SkillsLabel = new javax.swing.JLabel();
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

        SkillsLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        SkillsLabel.setText("Mention at least 3 skills:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(WhyUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubmitButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvailabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MorningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AfternoonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(EveningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(SkillsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(InterestTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InterestsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SkillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SkillsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InterestTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterestsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MorningButton)
                    .addComponent(EveningButton)
                    .addComponent(AvailabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AfternoonButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WhyUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
    private javax.swing.JTextField InterestsTextField;
    private javax.swing.JRadioButton MorningButton;
    private javax.swing.JLabel SkillsLabel;
    private javax.swing.JTextField SkillsTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel VolunteerHeader;
    private javax.swing.JLabel WhyUsLabel;
    private javax.swing.JTextArea WhyUsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
