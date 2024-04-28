package tanvi;

import dao.ConnectionProvider;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import soumili.ExploreNGOs;
import soumili.FrontPage;
import srishti.Authenticate;

public class UserDashboard extends javax.swing.JFrame {

    public int userId;
    public String fname;
    public String lname;

    public UserDashboard(int userId) {
        this.userId = userId;
        initComponents();
        setLocationRelativeTo(null);

    
    }
    
    public UserDashboard(int userId, String fname, String lname) {
        this.userId = userId;
        this.fname=fname;
        this.lname=lname;
        initComponents();
        setLocationRelativeTo(null);
        
        jLabel2.setText(this.fname + " " + this.lname);
        jLabel2.setText("Welcome " + this.fname + " " + this.lname + " !");
        

    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public UserDashboard() {
        initComponents();
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmClosing();
            }
        });

        try {
            // TODO add your handling code here:
            displayFirstnameLastName();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        NameLabel.setVisible(false);
        LastNameLabel.setVisible(false);
        EmailLabel.setVisible(false);
        PhoneNumberLabel.setVisible(false);
        DateOfBirthLabel.setVisible(false);
        AddressLabe.setVisible(false);
        UsernameLabel.setVisible(false);
        PasswordLabel.setVisible(false);

        NameTextField1.setVisible(false);
        LastnameTextField.setVisible(false);
        EmailTextField.setVisible(false);
        PhoneNumberTextFIeld.setVisible(false);
        DOBTextField.setVisible(false);
        AddressTextField.setVisible(false);
        UsernameTextField.setVisible(false);
        //PasswordTextField.setVisible(false);
        PasswordField.setVisible(false);
        EditButton.setVisible(false);
        Submitbutton.setVisible(false);

        BirthDateChooser.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DeleteAccountButton = new javax.swing.JButton();
        ViewProfileButton = new javax.swing.JButton();
        MyNGOsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MyDetailsLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        DateOfBirthLabel = new javax.swing.JLabel();
        AddressLabe = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        NameTextField1 = new javax.swing.JFormattedTextField();
        LastnameTextField = new javax.swing.JFormattedTextField();
        EmailTextField = new javax.swing.JFormattedTextField();
        PhoneNumberTextFIeld = new javax.swing.JFormattedTextField();
        DOBTextField = new javax.swing.JFormattedTextField();
        AddressTextField = new javax.swing.JFormattedTextField();
        UsernameTextField = new javax.swing.JFormattedTextField();
        EditButton = new javax.swing.JButton();
        Submitbutton = new javax.swing.JButton();
        BirthDateChooser = new com.toedter.calendar.JDateChooser();
        changePasswordButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(153, 153, 153)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 0, 104));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tanvi/user.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(2.0F);
        jLabel1.setAlignmentY(-5.0F);
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("My Profile");
        sidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        DeleteAccountButton.setBackground(new java.awt.Color(153, 0, 0));
        DeleteAccountButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        DeleteAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccountButton.setText("Delete Account");
        DeleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountButtonActionPerformed(evt);
            }
        });
        sidePanel.add(DeleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        ViewProfileButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewProfileButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ViewProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewProfileButton.setText("View Profile");
        ViewProfileButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(51, 51, 51)));
        ViewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfileButtonActionPerformed(evt);
            }
        });
        sidePanel.add(ViewProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 40));

        MyNGOsButton.setBackground(new java.awt.Color(0, 0, 0));
        MyNGOsButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        MyNGOsButton.setForeground(new java.awt.Color(255, 255, 255));
        MyNGOsButton.setText("My NGOs");
        MyNGOsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(51, 51, 51)));
        MyNGOsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyNGOsButtonActionPerformed(evt);
            }
        });
        sidePanel.add(MyNGOsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Explore NGOs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 590));

        MyDetailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mainPanel.add(MyDetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 130, 30));

        NameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NameLabel.setText("Name");
        mainPanel.add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, -1));

        LastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LastNameLabel.setText("Last Name");
        mainPanel.add(LastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, -1));

        EmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailLabel.setText("Email");
        mainPanel.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 50, -1));

        PhoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PhoneNumberLabel.setText("Phone Number");
        mainPanel.add(PhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 100, -1));

        DateOfBirthLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DateOfBirthLabel.setText("Date of Birth");
        mainPanel.add(DateOfBirthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 100, -1));

        AddressLabe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddressLabe.setText("Address");
        mainPanel.add(AddressLabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 50, -1));

        UsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UsernameLabel.setText("Username");
        mainPanel.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 70, -1));

        PasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PasswordLabel.setText("Password");
        mainPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 80, -1));

        NameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextField1ActionPerformed(evt);
            }
        });
        mainPanel.add(NameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, 30));

        LastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(LastnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 200, 30));

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 200, 30));

        PhoneNumberTextFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextFIeldActionPerformed(evt);
            }
        });
        mainPanel.add(PhoneNumberTextFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 200, 30));

        DOBTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(DOBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 200, 30));

        AddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 200, 30));

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 200, 30));

        EditButton.setBackground(new java.awt.Color(0, 51, 255));
        EditButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        mainPanel.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        Submitbutton.setBackground(new java.awt.Color(0, 204, 51));
        Submitbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Submitbutton.setText("Submit");
        Submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbuttonActionPerformed(evt);
            }
        });
        mainPanel.add(Submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));
        mainPanel.add(BirthDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 200, 30));

        changePasswordButton.setBackground(new java.awt.Color(255, 255, 102));
        changePasswordButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        mainPanel.add(changePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        PasswordField.setText("jPasswordField1");
        mainPanel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 412, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfileButtonActionPerformed

        MyDetailsLabel.setText("My Details");
        NameLabel.setVisible(true);
        LastNameLabel.setVisible(true);
        EmailLabel.setVisible(true);
        PhoneNumberLabel.setVisible(true);
        DateOfBirthLabel.setVisible(true);
        AddressLabe.setVisible(true);
        UsernameLabel.setVisible(true);
        PasswordLabel.setVisible(true);

        NameTextField1.setVisible(true);
        LastnameTextField.setVisible(true);
        EmailTextField.setVisible(true);
        PhoneNumberTextFIeld.setVisible(true);
        DOBTextField.setVisible(true);
        AddressTextField.setVisible(true);
        UsernameTextField.setVisible(true);
        //PasswordTextField.setVisible(true);
        PasswordField.setVisible(true);
        BirthDateChooser.setVisible(false);

        NameTextField1.setEditable(false);
        LastnameTextField.setEditable(false);
        EmailTextField.setEditable(false);
        PhoneNumberTextFIeld.setEditable(false);
        DOBTextField.setEditable(false);
        AddressTextField.setEditable(false);
        UsernameTextField.setEditable(false);
        //PasswordTextField.setEditable(false);
        PasswordField.setEditable(false);
        BirthDateChooser.setEnabled(false);

        EditButton.setVisible(true);

//        int userID = 2024004;
        String firstName = "";
        String lastName = "";
        String email = "";
        String phoneNumber = "";
        String dateOfBirth = "";
        String address = "";
        String username = "";
        String password = "";

        ResultSet rs;

        try {
//            try {
////                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
//            }
            Connection conn = ConnectionProvider.getCon();
            String query = "select fname, lname, email, phone, dob, address, username, userpassword from person where userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                firstName = rs.getString("fname");
                lastName = rs.getString("lname");
                email = rs.getString("email");
                phoneNumber = rs.getString("phone");
                dateOfBirth = rs.getString("dob");
                address = rs.getString("address");
                username = rs.getString("username");
                password = rs.getString("userpassword");

            }

            
//            rs.close();
//            pstmt.close();
//            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        NameTextField1.setText(firstName);
        LastnameTextField.setText(lastName);
        EmailTextField.setText(email);
        PhoneNumberTextFIeld.setText(phoneNumber);
        DOBTextField.setText(dateOfBirth);
        AddressTextField.setText(address);
        UsernameTextField.setText(username);
        //PasswordTextField.setText(password);
        PasswordField.setText(password);


    }//GEN-LAST:event_ViewProfileButtonActionPerformed

    private void NameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextField1ActionPerformed

    private void LastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PhoneNumberTextFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextFIeldActionPerformed

    private void DOBTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextFieldActionPerformed

    private void AddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextFieldActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        NameTextField1.setEditable(true);
        LastnameTextField.setEditable(true);
        EmailTextField.setEditable(true);
        PhoneNumberTextFIeld.setEditable(true);
        BirthDateChooser.setEnabled(true);
        BirthDateChooser.setVisible(true);
        DOBTextField.setEditable(false);
        DOBTextField.setVisible(false);
        AddressTextField.setEditable(true);
        UsernameTextField.setEditable(true);
        //PasswordTextField.setEditable(true);

        Submitbutton.setVisible(true);


    }//GEN-LAST:event_EditButtonActionPerformed

    private void SubmitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbuttonActionPerformed
        // TODO add your handling code here:
        submitButtonFunction();

//        NameLabel.setText(NameTextField1.getText());
//        LastNameLabel.setText(LastnameTextField.getText());

    }//GEN-LAST:event_SubmitbuttonActionPerformed

    private void MyNGOsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyNGOsButtonActionPerformed
        close();
        try {
            // TODO add your handling code here:
            NGOTableForUserDashboard n = new NGOTableForUserDashboard(userId);
            n.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_MyNGOsButtonActionPerformed

    private void DeleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountButtonActionPerformed
        // TODO add your handling code here:

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete your account?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            deleteButtonFunction();
            JOptionPane.showMessageDialog(this, "Your account has been deleted.", "Account Deleted", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new FrontPage().setVisible(true);
        }

    }//GEN-LAST:event_DeleteAccountButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        new ExploreNGOs(userId).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
        new FrontPage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed

        try {
            // Initialize variables
            String username = null;

            // Get database connection
            Connection conn = ConnectionProvider.getCon();

            // Prepare SQL query
            String query = "SELECT username FROM person WHERE userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            // Set the user ID parameter
            pstmt.setInt(1, userId);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            // If the result set has a row, get the username
            if (rs.next()) {
                username = rs.getString("username");
            }

            // Close the result set and statement
            rs.close();
            pstmt.close();

            // Open the Authenticate frame with the retrieved username
            close();
            new Authenticate(username).setVisible(true);

        } catch (SQLException ex) {
            // Handle any SQL exceptions
            ex.printStackTrace();
        }


    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void displayFirstnameLastName() throws ClassNotFoundException {
        String firstName = "";
        String lastName = "";

        ResultSet rs;

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectionProvider.getCon();

            String query = "select fname, lname from person where userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userId);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                firstName = rs.getString("fname");
                lastName = rs.getString("lname");
            }
//            rs.close();
//            pstmt.close();
//            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        FnameLabel.setText("Welcome " + firstName);
//        LnameLabel.setText(lastName);
    }

    private void submitButtonFunction() {

        String firstName = NameTextField1.getText();
        String lastName = LastnameTextField.getText();
        String email = EmailTextField.getText();
        String phoneNumber = PhoneNumberTextFIeld.getText();
        String dateOfBirth = DOBTextField.getText();
        String address = AddressTextField.getText();
        String username = UsernameTextField.getText();
        //String password = PasswordTextField.getText();
        String password = PasswordField.getText();

        if (isNumeric(firstName) || firstName == null) {
            showError("Please enter a valid name.");
        }
        if (isNumeric(lastName) || lastName == null) {
            showError("Please enter a valid last name.");
            return;
        }
        if (!isNumeric(phoneNumber) || phoneNumber == null || phoneNumber.length() != 10) {
            showError("Please enter a valid phone number.");
            return;
        }

        if (!isValidEmail(email) || email == null) {
            showError("Please enter a valid email id");
            return;
        }

        if (!isValidPassword(password) || password == null) {
            showError("Please enter a valid password");
            return;
        }

        if (!isValidUsername(username) || username == null) {
            showError("Please enter a valid username. It must not start with numbers or special characters.");
            return;

        }

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectionProvider.getCon();
            String query = "update person set fname = ?, lname = ?, email = ?, phone = ?, dob = ?, address = ?, username = ?, userpassword = ? where userID = ?";

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, email);
            pstmt.setString(4, phoneNumber);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            //String date = sdf.format(BirthDateChooser.getDate());
            //pstmt.setString(5, date);
            pstmt.setString(5, dateOfBirth);
            pstmt.setString(6, address);
            pstmt.setString(7, username);
            pstmt.setString(8, password);
            pstmt.setInt(9, userId);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("User details updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user details.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Failed to update user details.");
            }

//            pstmt.close();
//            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        if (password.length() > 10) {
            showError("Password must be 10 characters long and includes alphabets and special characters");
            return false;
        }

        // Regex pattern to enforce at least one letter, one number, one special character
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!_])[A-Za-z\\d@#$%^&+=!_]{1,10}$";

        if (!password.matches(regex)) {
            showError("Password must contain at least one letter, one number, and one special character (@#$%^&+=!_).");
            return false;
        }

        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private boolean isValidUsername(String username) {
        // Regex pattern to enforce username starting with a letter (uppercase or lowercase) and can include numbers and special characters
        String regex = "^[a-zA-Z][a-zA-Z0-9@#$%^&*()-_=+\\\\|;:'\",.<>/?]*$";
        return username.matches(regex);
    }

    public void deleteButtonFunction() {
        try {
            Connection conn = ConnectionProvider.getCon();

            // Delete from donor table first
            String query3 = "DELETE FROM donor WHERE user_ID = ?";
            PreparedStatement pstmt3 = conn.prepareStatement(query3);
            pstmt3.setInt(1, userId);
            int rowsAffected3 = pstmt3.executeUpdate();
            pstmt3.close();

            // Then delete from volunteer table
            String query2 = "DELETE FROM volunteer WHERE user_Id = ?";
            PreparedStatement pstmt2 = conn.prepareStatement(query2);
            pstmt2.setInt(1, userId);
            int rowsAffected2 = pstmt2.executeUpdate();
            pstmt2.close();

            // Finally, delete from person table
            String query = "DELETE FROM person WHERE userID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userId);
            int rowsAffected1 = pstmt.executeUpdate();
            pstmt.close();

            if (rowsAffected1 > 0 || rowsAffected2 > 0 || rowsAffected3 > 0) {
                JOptionPane.showMessageDialog(this, "Your account has been deleted.", "Account Deleted", JOptionPane.INFORMATION_MESSAGE);
                this.dispose(); // Close the UserDashboard window after successful deletion
            } else {
                JOptionPane.showMessageDialog(this, "Error in deleting account.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

//            pstmt.close();
//            conn.close();
    private void confirmClosing() {
        boolean changesMade = checkForChanges();

        if (changesMade) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save changes before closing?", "Save Changes", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                Submitbutton.doClick();
            } else if (option == JOptionPane.NO_OPTION) {
                dispose();
            }
        } else {
            dispose();
        }
    }

    // compare with original values
    private boolean checkForChanges() {

        // Get the original values from the database
        String originalFirstName = NameTextField1.getText();
        String originalLastName = LastnameTextField.getText();
        String originalEmail = EmailTextField.getText();
        String originalPhoneNumber = PhoneNumberTextFIeld.getText();
        String originalDateOfBirth = DOBTextField.getText();
        String originalAddress = AddressTextField.getText();
        String originalUsername = UsernameTextField.getText();
        //String originalPassword = PasswordTextField.getText();
        String originalPassword = PasswordField.getText();

        // Get the current values from the text fields
        String currentFirstName = NameTextField1.getText();
        String currentLastName = LastnameTextField.getText();
        String currentEmail = EmailTextField.getText();
        String currentPhoneNumber = PhoneNumberTextFIeld.getText();
        String currentDateOfBirth = DOBTextField.getText();
        String currentAddress = AddressTextField.getText();
        String currentUsername = UsernameTextField.getText();
        // String currentPassword = PasswordTextField.getText();

        if (!originalFirstName.equals(currentFirstName)
                || !originalLastName.equals(currentLastName)
                || !originalEmail.equals(currentEmail)
                || !originalPhoneNumber.equals(currentPhoneNumber)
                || !originalDateOfBirth.equals(currentDateOfBirth)
                || !originalAddress.equals(currentAddress)
                || !originalUsername.equals(currentUsername)) {
            // Changes detected
            return true;
        }

        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabe;
    private javax.swing.JFormattedTextField AddressTextField;
    private com.toedter.calendar.JDateChooser BirthDateChooser;
    private javax.swing.JFormattedTextField DOBTextField;
    private javax.swing.JLabel DateOfBirthLabel;
    private javax.swing.JButton DeleteAccountButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JFormattedTextField EmailTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JFormattedTextField LastnameTextField;
    private javax.swing.JLabel MyDetailsLabel;
    private javax.swing.JButton MyNGOsButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JFormattedTextField NameTextField1;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JFormattedTextField PhoneNumberTextFIeld;
    private javax.swing.JButton Submitbutton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JFormattedTextField UsernameTextField;
    private javax.swing.JButton ViewProfileButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
