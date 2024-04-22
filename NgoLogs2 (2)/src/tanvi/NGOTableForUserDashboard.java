package tanvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class NGOTableForUserDashboard extends javax.swing.JFrame {

    public NGOTableForUserDashboard(int userID) throws ClassNotFoundException {
        initComponents();
        displayNGODetails(userID);
        setLocationRelativeTo(null);
    }

    private NGOTableForUserDashboard() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NGOTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NGOTable.setBackground(new java.awt.Color(204, 255, 204));
        NGOTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NGOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGO", "Email", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(NGOTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void displayNGODetails(int userID) throws ClassNotFoundException {
        String ngoName = "";
        String ngoEmail = "";
        String ngoCity = "";

        Connection conn = null;
        PreparedStatement pstmt = null;
        java.sql.ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngologs", "root", "ar@10Qg");
            String query = "select ngo.ngoname, ngo.city, ngo.email from ngo inner join ngologintables on ngologintables.ngo_id = ngo.ngoid inner join person on ngologintables.user_id = person.userid where person.userid = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 2024004);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                ngoName = rs.getString("ngoName");
                ngoCity = rs.getString("city");
                ngoEmail = rs.getString("email");
                
                String tbData[] = {ngoName, ngoCity, ngoEmail};
                DefaultTableModel tblModel = (DefaultTableModel)NGOTable.getModel();
                
                tblModel.addRow(tbData);
            }
            rs.close();
            pstmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGOTableForUserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NGOTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
