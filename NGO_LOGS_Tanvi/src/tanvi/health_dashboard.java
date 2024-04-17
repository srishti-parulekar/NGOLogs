package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class health_dashboard extends javax.swing.JFrame {

    public health_dashboard() {
        initComponents();
        init();
    }

    public void init() {
        SetBG();
    }

    public void SetBG() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("healthCare.jpg"));
            Image img = icon.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(img));
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
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Healthcare");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 22, 274, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Wellness Initiative - Pune");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 306, 343, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("<html> The Wellness Initiativeaims to uplift communities through holistic healthcare services. Our holistic approach encompasses physical, mental, and emotional well-being, ensuring a balanced and thriving society.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 353, 386, 127));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Narayan Foundation - Hyderabad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 342, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("<html>The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, 386, 127));

        HV1.setBackground(new java.awt.Color(51, 51, 255));
        HV1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        HV1.setForeground(new java.awt.Color(255, 255, 255));
        HV1.setText("Volunteer");
        HV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HV1ActionPerformed(evt);
            }
        });
        jPanel1.add(HV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 198, 99, 44));

        HD1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        HD1.setText("Donate");
        HD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HD1ActionPerformed(evt);
            }
        });
        jPanel1.add(HD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 198, 87, 44));

        HD2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        HD2.setText("Donate");
        HD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HD2ActionPerformed(evt);
            }
        });
        jPanel1.add(HD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 374, 87, 43));

        HV2.setBackground(new java.awt.Color(51, 51, 255));
        HV2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        HV2.setForeground(new java.awt.Color(255, 255, 255));
        HV2.setText("Volunteer");
        HV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HV2ActionPerformed(evt);
            }
        });
        jPanel1.add(HV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 374, 99, 44));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HV1ActionPerformed
        // close();
        Volunteer_dashboard v = new Volunteer_dashboard();
        v.setVisible(true);
    }//GEN-LAST:event_HV1ActionPerformed

    private void HD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HD1ActionPerformed
        // close();
        Donator_dashboard d = new Donator_dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_HD1ActionPerformed

    private void HV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HV2ActionPerformed
        // close();
        Volunteer_dashboard v = new Volunteer_dashboard();
        v.setVisible(true);
    }//GEN-LAST:event_HV2ActionPerformed

    private void HD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HD2ActionPerformed
        // close();
        Donator_dashboard d = new Donator_dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_HD2ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
