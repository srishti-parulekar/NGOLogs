package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import soumili.ExploreNGOs;
import srishti.Login;

public class education_dashboard2 extends javax.swing.JFrame {

    public static int userId=0;

    public education_dashboard2() {
        initComponents();
        setLocationRelativeTo(null);
        init();

    }

    public education_dashboard2(int userId) {
        this.userId = userId;
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    public void init() {
        SetBG();
    }

    public void SetBG() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("educationImg.jpg"));
            Image img = icon.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
            jLabel6.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("Error in loading background");
        }
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EVD1 = new javax.swing.JButton();
        EV2 = new javax.swing.JButton();
        ED2 = new javax.swing.JButton();
        EV3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Education");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 274, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bachapanshala - Kathua");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 267, 41));

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Illuminating Futures. Committed to breaking barriers and nurturing talents in underserved areas. Our passion lies in fostering a love for learning and empowering individuals to thrive academically, ensuring no dream goes unfulfilled.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 386, 127));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EmpowerEd Education - Pune");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 350, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>EmpowerEd Foundation: Igniting Minds, Transforming Futures. Our mission is to provide quality education to underprivileged children, empowering them to break the cycle of poverty and reach their full potential. Through innovative teaching methods and community engagement, we're shaping tomorrow's leaders, one student at a time.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 386, 127));

        EVD1.setText("Donate");
        EVD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVD1ActionPerformed(evt);
            }
        });
        jPanel1.add(EVD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 87, 44));

        EV2.setBackground(new java.awt.Color(51, 51, 255));
        EV2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        EV2.setForeground(new java.awt.Color(255, 255, 255));
        EV2.setText("Volunteer");
        EV2.setToolTipText("");
        EV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EV2ActionPerformed(evt);
            }
        });
        jPanel1.add(EV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 99, 43));

        ED2.setText("Donate");
        ED2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ED2ActionPerformed(evt);
            }
        });
        jPanel1.add(ED2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 87, 43));

        EV3.setBackground(new java.awt.Color(51, 51, 255));
        EV3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        EV3.setForeground(new java.awt.Color(255, 255, 255));
        EV3.setText("Volunteer");
        EV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EV3ActionPerformed(evt);
            }
        });
        jPanel1.add(EV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 99, 44));

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EVD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVD1ActionPerformed
        // TODO add your handling code here:

        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            close();
            int ngo_id = 1424003;
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }


    }//GEN-LAST:event_EVD1ActionPerformed

    private void EV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EV3ActionPerformed
        // TODO add your handling code here:
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424003;
            close();
            Volunteer_dashboard v = new Volunteer_dashboard(ngo_id,userId);
            //v.setNgoId(ngo_id);
            v.setVisible(true);
        }

    }//GEN-LAST:event_EV3ActionPerformed

    private void EV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EV2ActionPerformed
        // TODO add your handling code here:
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424004;
            close();
            Volunteer_dashboard v = new Volunteer_dashboard(ngo_id,userId);
            v.setVisible(true);
        }
    }//GEN-LAST:event_EV2ActionPerformed

    private void ED2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ED2ActionPerformed
        // TODO add your handling code here:
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            close();
            int ngo_id = 1424004;
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);

        }

    }//GEN-LAST:event_ED2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        ExploreNGOs en = new ExploreNGOs();
        en.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new education_dashboard2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ED2;
    private javax.swing.JButton EV2;
    private javax.swing.JButton EV3;
    private javax.swing.JButton EVD1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
