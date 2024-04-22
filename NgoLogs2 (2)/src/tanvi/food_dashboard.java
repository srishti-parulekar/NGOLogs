package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import soumili.ExploreNGOs;
import srishti.Login;


public class food_dashboard extends javax.swing.JFrame {
public static int userId;
    public food_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

     public food_dashboard(int userId) {
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
            ImageIcon icon = new ImageIcon(getClass().getResource("food.jpg"));
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
        FV1 = new javax.swing.JButton();
        FD1 = new javax.swing.JButton();
        FD2 = new javax.swing.JButton();
        FV2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hunger");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, 274, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Annamrita Foundation - Pune");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 386, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Annamrita Foundation cultivates a more equitable and sustainable food system. We support small-scale farmers practicing sustainable agriculture, providing them with resources and market access. We also educate consumers about the importance of local food systems and empower them to make informed choices about the food they eat.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 490, 160));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sevadeep - Pune");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 342, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> Sevadeep is on a mission to eliminate food insecurity by rescuing surplus food and redistributing it to those in need. Our efforts not only reduce food waste but also nourish individuals and families, fostering healthier and more resilient communities.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, 480, 127));

        FV1.setBackground(new java.awt.Color(51, 51, 255));
        FV1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FV1.setForeground(new java.awt.Color(255, 255, 255));
        FV1.setText("<html>Volunteer");
        FV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FV1ActionPerformed(evt);
            }
        });
        jPanel1.add(FV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 110, 44));

        FD1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FD1.setText("<html>Donate");
        FD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD1ActionPerformed(evt);
            }
        });
        jPanel1.add(FD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 87, 44));

        FD2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FD2.setText("<html>Donate");
        FD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD2ActionPerformed(evt);
            }
        });
        jPanel1.add(FD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 87, 43));

        FV2.setBackground(new java.awt.Color(51, 51, 255));
        FV2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FV2.setForeground(new java.awt.Color(255, 255, 255));
        FV2.setText("<html>Volunteer");
        FV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FV2ActionPerformed(evt);
            }
        });
        jPanel1.add(FV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 110, 44));

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

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

    private void FV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FV1ActionPerformed
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424005;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_FV1ActionPerformed

    private void FD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD1ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424005;
            this.dispose();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_FD1ActionPerformed

    private void FV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FV2ActionPerformed

        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424006;
            this.dispose();
            Volunteer_dashboard d = new Volunteer_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_FV2ActionPerformed

    private void FD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD2ActionPerformed
        // TODO add your handling code here:
        // close();
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "You are not registered! ");
            close();
            new Login().setVisible(true);
        } else {
            int ngo_id = 1424006;
            this.dispose();
            Donator_dashboard d = new Donator_dashboard(ngo_id,userId);
            d.setVisible(true);
        }
    }//GEN-LAST:event_FD2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        ExploreNGOs en = new ExploreNGOs();
        en.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new food_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FD1;
    private javax.swing.JButton FD2;
    private javax.swing.JButton FV1;
    private javax.swing.JButton FV2;
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
