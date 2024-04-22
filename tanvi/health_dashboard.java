package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import soumili.ExploreNGOs;
import srishti.Login;

public class health_dashboard extends javax.swing.JFrame {

    public static int userId;
    public health_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    
     public health_dashboard(int userId) {
         this.userId=userId;
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    public void init() {
        SetBG();
    }

    public void SetBG() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("healthCare.jpg"));
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
        HV1 = new javax.swing.JButton();
        HD1 = new javax.swing.JButton();
        HD2 = new javax.swing.JButton();
        HV2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Healthcare");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, 274, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Wellness Initiative - Pune");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 343, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> The Wellness Initiativeaims to uplift communities through holistic healthcare services. Our holistic approach encompasses physical, mental, and emotional well-being, ensuring a balanced and thriving society.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 450, 127));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Narayan Foundation - Hyderabad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 342, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 386, 127));

        HV1.setBackground(new java.awt.Color(51, 51, 255));
        HV1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HV1.setForeground(new java.awt.Color(255, 255, 255));
        HV1.setText("Volunteer");
        HV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HV1ActionPerformed(evt);
            }
        });
        jPanel1.add(HV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 120, 44));

        HD1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HD1.setText("<html>Donate");
        HD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HD1ActionPerformed(evt);
            }
        });
        jPanel1.add(HD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 87, 44));

        HD2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HD2.setText("<html>Donate");
        HD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HD2ActionPerformed(evt);
            }
        });
        jPanel1.add(HD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 87, 43));

        HV2.setBackground(new java.awt.Color(51, 51, 255));
        HV2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HV2.setForeground(new java.awt.Color(255, 255, 255));
        HV2.setText("<html>Volunteer");
        HV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HV2ActionPerformed(evt);
            }
        });
        jPanel1.add(HV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 120, 44));

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

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

    private void HV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HV1ActionPerformed

        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {

            close();
            int ngo_id = 1424009;
            Volunteer_dashboard v = new Volunteer_dashboard(ngo_id,userId);
            v.setVisible(true);
        }
    }//GEN-LAST:event_HV1ActionPerformed

    private void HD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HD1ActionPerformed

        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424009;
            close();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_HD1ActionPerformed

    private void HV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HV2ActionPerformed
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            close();
            int ngo_id = 1424010;
            Volunteer_dashboard v = new Volunteer_dashboard(ngo_id,userId);
            v.setVisible(true);
        }
    }//GEN-LAST:event_HV2ActionPerformed

    private void HD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HD2ActionPerformed
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {

            int ngo_id = 1424010;
            close();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_HD2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        ExploreNGOs en = new ExploreNGOs();
        en.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new health_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HD1;
    private javax.swing.JButton HD2;
    private javax.swing.JButton HV1;
    private javax.swing.JButton HV2;
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
