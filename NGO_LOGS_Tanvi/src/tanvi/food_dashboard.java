package tanvi;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class food_dashboard extends javax.swing.JFrame {

    public food_dashboard() {
        initComponents();
        init();
    }

    public void init() {
        SetBG();
    }

    public void SetBG() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("food.jpg"));
            Image img = icon.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
            jLabel7.setIcon(new ImageIcon(img));
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
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Food");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 22, 274, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Annamrita Foundation - Pune");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 386, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Annamrita Foundation cultivates a more equitable and sustainable food system. We support small-scale farmers practicing sustainable agriculture, providing them with resources and market access. We also educate consumers about the importance of local food systems and empower them to make informed choices about the food they eat.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 420, 160));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sevadeep - Pune");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 342, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> Sevadeep is on a mission to eliminate food insecurity by rescuing surplus food and redistributing it to those in need. Our efforts not only reduce food waste but also nourish individuals and families, fostering healthier and more resilient communities.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, 386, 127));

        FV1.setBackground(new java.awt.Color(51, 51, 255));
        FV1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FV1.setForeground(new java.awt.Color(255, 255, 255));
        FV1.setText("Volunteer");
        FV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FV1ActionPerformed(evt);
            }
        });
        jPanel1.add(FV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 198, 99, 44));

        FD1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FD1.setText("Donate");
        FD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD1ActionPerformed(evt);
            }
        });
        jPanel1.add(FD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 198, 87, 44));

        FD2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FD2.setText("Donate");
        FD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD2ActionPerformed(evt);
            }
        });
        jPanel1.add(FD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 374, 87, 43));

        FV2.setBackground(new java.awt.Color(51, 51, 255));
        FV2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FV2.setForeground(new java.awt.Color(255, 255, 255));
        FV2.setText("Volunteer");
        FV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FV2ActionPerformed(evt);
            }
        });
        jPanel1.add(FV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 374, 99, 44));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

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
        this.dispose();
        Volunteer_dashboard d = new Volunteer_dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_FV1ActionPerformed

    private void FD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD1ActionPerformed
        // TODO add your handling code here:
        // close();
        this.dispose();
        Donator_dashboard d = new Donator_dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_FD1ActionPerformed

    private void FV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FV2ActionPerformed
        // TODO add your handling code here:
        // close();
        this.dispose();
        Volunteer_dashboard d = new Volunteer_dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_FV2ActionPerformed

    private void FD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD2ActionPerformed
        // TODO add your handling code here:
        // close();
        this.dispose();
        Donator_dashboard d = new Donator_dashboard();
        d.setVisible(true);

    }//GEN-LAST:event_FD2ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
