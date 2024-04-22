package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import soumili.ExploreNGOs;
import srishti.Login;


public class poverty_dashboard extends javax.swing.JFrame {

    public static int userId;
    public poverty_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    
    public poverty_dashboard(int userId) {
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
            ImageIcon icon = new ImageIcon(getClass().getResource("poverty.jpg"));
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PV1 = new javax.swing.JButton();
        PD1 = new javax.swing.JButton();
        PD2 = new javax.swing.JButton();
        PV2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Poverty");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 274, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aayushman Foundation - Chennai");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 306, 376, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> The Aayushman Foundation is committed to child and maternal health, focusing on reducing mortality rates. Specializing in pediatric healthcare, they provide vital medical aid and preventive care. Additionally, they address educational disparities by offering resources and scholarships to support mothers, ensuring a brighter future for families in need.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 353, 386, 151));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aaradhya Foundation - Mumbai");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 115, 342, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, 386, 127));

        PV1.setBackground(new java.awt.Color(51, 51, 255));
        PV1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        PV1.setForeground(new java.awt.Color(255, 255, 255));
        PV1.setText("Volunteer");
        PV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PV1ActionPerformed(evt);
            }
        });
        jPanel1.add(PV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 198, 99, 44));

        PD1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        PD1.setText("Donate");
        PD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PD1ActionPerformed(evt);
            }
        });
        jPanel1.add(PD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 198, 87, 44));

        PD2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        PD2.setText("Donate");
        PD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PD2ActionPerformed(evt);
            }
        });
        jPanel1.add(PD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 370, 87, 43));

        PV2.setBackground(new java.awt.Color(51, 51, 255));
        PV2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        PV2.setForeground(new java.awt.Color(255, 255, 255));
        PV2.setText("Volunteer");
        PV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PV2ActionPerformed(evt);
            }
        });
        jPanel1.add(PV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 370, 99, 44));

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

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

    private void PD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PD1ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424001;
            this.dispose();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_PD1ActionPerformed

    private void PV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PV2ActionPerformed
        // TODO add your handling code here:
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424002;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }

    }//GEN-LAST:event_PV2ActionPerformed

    private void PD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PD2ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424002;
            this.dispose();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_PD2ActionPerformed

    private void PV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PV1ActionPerformed
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424001;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_PV1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        ExploreNGOs en = new ExploreNGOs();
        en.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new poverty_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PD1;
    private javax.swing.JButton PD2;
    private javax.swing.JButton PV1;
    private javax.swing.JButton PV2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
