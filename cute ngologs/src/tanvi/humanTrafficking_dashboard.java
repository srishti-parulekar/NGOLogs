package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import soumili.ExploreNGOs;
import srishti.Login;


public class humanTrafficking_dashboard extends javax.swing.JFrame {

    public static int userId;

    public humanTrafficking_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        init();

    }

    public humanTrafficking_dashboard(int userId) {
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
            ImageIcon icon = new ImageIcon(getClass().getResource("humanTraffick.jpg"));
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
        EV1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Human Trafficking");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, -1, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("International Justice Mission - Mumbai");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 306, 460, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> The International Justice Mission is a grassroots movement dedicated to raising awareness about human trafficking and advocating for stronger legislation to combat this modern-day slavery. We educate communities, empower survivors, and work with policymakers to create a world free from exploitation.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 353, 386, 127));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Polaris Project - Pune");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 300, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> The Polaris Project is committed to combating human trafficking, offering hope to victims through rescue and rehabilitation. Through partnerships with law enforcement and community outreach, we work to raise awareness, prevent trafficking, and prosecute perpetrators. Our goal: a world free from exploitation and oppression");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 168, 386, 120));

        EVD1.setText("Donate");
        EVD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVD1ActionPerformed(evt);
            }
        });
        jPanel1.add(EVD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 192, 87, 44));

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
        jPanel1.add(EV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 374, 99, 43));

        ED2.setText("Donate");
        ED2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ED2ActionPerformed(evt);
            }
        });
        jPanel1.add(ED2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 87, 43));

        EV1.setBackground(new java.awt.Color(51, 51, 255));
        EV1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        EV1.setForeground(new java.awt.Color(255, 255, 255));
        EV1.setText("Volunteer");
        EV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EV1ActionPerformed(evt);
            }
        });
        jPanel1.add(EV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 192, 99, 44));

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
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

    private void EVD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVD1ActionPerformed

        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            // close();
            int ngo_id = 1424007;
            this.dispose();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }

    }//GEN-LAST:event_EVD1ActionPerformed

    private void EV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EV1ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424007;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_EV1ActionPerformed

    private void EV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EV2ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424008;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_EV2ActionPerformed

    private void ED2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ED2ActionPerformed

        // TODO add your handling code here:
        //close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424007;
            this.dispose();
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
                new humanTrafficking_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ED2;
    private javax.swing.JButton EV1;
    private javax.swing.JButton EV2;
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
