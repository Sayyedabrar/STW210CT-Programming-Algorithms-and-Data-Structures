/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class HomeWindowJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeWindowJFrame
     */
    private static String uname;
    private static String pass;
    MySQLConnect MySqlConn;
    public HomeWindowJFrame(String username, String password) {
        initComponents();
        MySqlConn =  new MySQLConnect();
        HomeWindowJFrame.uname = username;
        HomeWindowJFrame.pass = password;
        loadAdminData();
        setLocationRelativeTo(null);  // *** center appearance of the app ***
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonAddQuestion = new javax.swing.JButton();
        jButtonAddadmin = new javax.swing.JButton();
        jButtonUpdateExaminee = new javax.swing.JButton();
        jButtonAddexaminee = new javax.swing.JButton();
        jButtonUpdateadmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAdmin = new javax.swing.JTable();
        jButtonRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Question");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButtonAddQuestion.setBackground(new java.awt.Color(44, 62, 80));
        jButtonAddQuestion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAddQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddQuestion.setText("Add Quizz Questions");
        jButtonAddQuestion.setActionCommand("Update Admin");
        jButtonAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuestionActionPerformed(evt);
            }
        });

        jButtonAddadmin.setBackground(new java.awt.Color(44, 62, 80));
        jButtonAddadmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAddadmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddadmin.setText("Add Admin");
        jButtonAddadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddadminActionPerformed(evt);
            }
        });

        jButtonUpdateExaminee.setBackground(new java.awt.Color(44, 62, 80));
        jButtonUpdateExaminee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUpdateExaminee.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateExaminee.setText("Update Examinee");
        jButtonUpdateExaminee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateExamineeActionPerformed(evt);
            }
        });

        jButtonAddexaminee.setBackground(new java.awt.Color(44, 62, 80));
        jButtonAddexaminee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAddexaminee.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddexaminee.setText("Add Examinee");
        jButtonAddexaminee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddexamineeActionPerformed(evt);
            }
        });

        jButtonUpdateadmin.setBackground(new java.awt.Color(44, 62, 80));
        jButtonUpdateadmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUpdateadmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateadmin.setText("UpdateAdmin");
        jButtonUpdateadmin.setActionCommand("Update Admin");
        jButtonUpdateadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateadminActionPerformed(evt);
            }
        });

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Contact", "Gender"
            }
        ));
        jScrollPane2.setViewportView(tableAdmin);

        jButtonRegister1.setBackground(new java.awt.Color(44, 62, 80));
        jButtonRegister1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/undo2.png"))); // NOI18N
        jButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddexaminee, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdateExaminee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButtonUpdateadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButtonAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddexaminee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUpdateExaminee, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUpdateadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Boolean loadAdminData() {
        try {
           
           String query = "select name, email, contact, gender from admin  ORDER BY `admin`.`id` DESC";
           
           ResultSet resultset;
           resultset = MySqlConn.retrieveData(query);
           DefaultTableModel model = (DefaultTableModel) tableAdmin.getModel();
           if (resultset.next()){
                while(resultset.next()) {
                    
                    model.addRow(new Object[]{resultset.getString("name"), resultset.getString("email"), resultset.getString("contact"),resultset.getString("gender")});
                }
                return true;
            }
 
       } catch (SQLException ex) {
           System.out.println("Error in loading admin details in table homewindowJframe :" + ex );
       }
        return false;
    }
    
    
    private void jButtonUpdateadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateadminActionPerformed
        UpdateAdminJFrame updateAdmin = new UpdateAdminJFrame();
        updateAdmin.loadData(uname, pass);
        updateAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonUpdateadminActionPerformed

    private void jButtonUpdateExamineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateExamineeActionPerformed
        UpdateExamineeJFrame updateExaminee =  new UpdateExamineeJFrame();
        updateExaminee.setVisible(true);
        updateExaminee.loadExamineeData();
        dispose();
    }//GEN-LAST:event_jButtonUpdateExamineeActionPerformed

    private void jButtonAddadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddadminActionPerformed
        AdminRegisterJFrame newAdmin = new AdminRegisterJFrame();
        newAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAddadminActionPerformed

    private void jButtonAddexamineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddexamineeActionPerformed
        RegisterExamineeJFrame newExaminee =  new RegisterExamineeJFrame();
        newExaminee.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAddexamineeActionPerformed

    private void jButtonAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuestionActionPerformed
        NewQuestionJFrame newQ =  new NewQuestionJFrame();
        newQ.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAddQuestionActionPerformed

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegister1ActionPerformed

        AdminOrExamineeJFrame navigator = new AdminOrExamineeJFrame();
        navigator.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegister1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindowJFrame(uname, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddQuestion;
    private javax.swing.JButton jButtonAddadmin;
    private javax.swing.JButton jButtonAddexaminee;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JButton jButtonUpdateExaminee;
    private javax.swing.JButton jButtonUpdateadmin;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAdmin;
    // End of variables declaration//GEN-END:variables

    
   
}
