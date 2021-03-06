/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class DashboardJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form DashboardJFrame
     */
    MySQLConnect mySqlConn;
    int setid;
    private static String uname, pass ;
    public DashboardJFrame(String username, String password) {
        initComponents();
        setLocationRelativeTo(null);  // *** center appearance of the app ***
        DashboardJFrame.uname = username;
        DashboardJFrame.pass = password;
        mySqlConn = new MySQLConnect();
        loadComboBox();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExaminee = new javax.swing.JTable();
        jButtonUpdateExaminee = new javax.swing.JButton();
        jButtonPlayQuizz = new javax.swing.JButton();
        jComboBoxSetname = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonNavigator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jTableExaminee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Contact", "Gender"
            }
        ));
        jTableExaminee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExamineeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableExaminee);

        jButtonUpdateExaminee.setBackground(new java.awt.Color(44, 62, 80));
        jButtonUpdateExaminee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUpdateExaminee.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateExaminee.setText("Update Examinee");
        jButtonUpdateExaminee.setActionCommand("Update Admin");
        jButtonUpdateExaminee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateExamineeActionPerformed(evt);
            }
        });

        jButtonPlayQuizz.setBackground(new java.awt.Color(44, 62, 80));
        jButtonPlayQuizz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPlayQuizz.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlayQuizz.setText("Play Quizz");
        jButtonPlayQuizz.setActionCommand("Update Admin");
        jButtonPlayQuizz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayQuizzActionPerformed(evt);
            }
        });

        jComboBoxSetname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Select any one question set:");

        jButtonNavigator.setBackground(new java.awt.Color(44, 62, 80));
        jButtonNavigator.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNavigator.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNavigator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/undo2.png"))); // NOI18N
        jButtonNavigator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNavigatorActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSetname, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButtonPlayQuizz, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jButtonUpdateExaminee, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSetname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlayQuizz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdateExaminee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    
    public int getsetId(String setname){
        var qsetid = -1;
        try{
            String query = "select id from questionset where setname = '" + setname + "'";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
                qsetid = resultset.getInt("id");
            }
        } catch(SQLException ex){
            System.out.println("Error in getting setid in getsetName method: " + ex);
        }
        return qsetid;
    }
    
    public int getexamineeId(String username, String password){
        int examineeid = -1;
        try{
            String query = "select id from examinee where username = '" + username + "' and password = '" + password + "'";
         
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
                examineeid = resultset.getInt("id");
            }
        } catch(SQLException ex){
            System.out.println( "Error in getting setid in getsetName method: " + ex);
        }
        return examineeid;
    }
    
    
    public Boolean loadTable() {
        var eid = getexamineeId(uname, pass);
        try {
        	
            String query = "SELECT * FROM `examinee` where id = "+ eid;
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            DefaultTableModel model = (DefaultTableModel) jTableExaminee.getModel();
            while(resultset.next()) {

                model.addRow(new Object[]{resultset.getString("name"), resultset.getString("email"), resultset.getString("contact"), resultset.getString("gender")});
            }
            return true;
     
        } catch (SQLException ex) {
           System.out.println("Error in datbase connection while loading examinee data in table: " + ex );
        }
        return false;
    }
    
    public Boolean loadComboBox() {
    
        try {  
            
            String query = "select * from questionset";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()) {
                
                while (resultset.next()) {  
                jComboBoxSetname.addItem(resultset.getString("setname"));  
                }
                //jComboBoxSetname.addItem(resultset.getString("setname"));
                return true;
            }
            
        } catch (SQLException e) {  
            JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.WARNING_MESSAGE);  
            System.exit(0);  
        } 
        return false;
    }
    
    public boolean isSetAttempted(){
    	
        String setname = jComboBoxSetname.getSelectedItem().toString();
        System.out.println(setname);

        var eid = getexamineeId(uname, pass);

        String query = "select * from result where examineeid = "+ eid +" and setname = '"+ setname +"'";
        ResultSet resultset;
        resultset = mySqlConn.retrieveData(query);
        try {
            if (resultset.next()) {
                JOptionPane.showMessageDialog(null, "You have already attempted this please try other!!");
                return true;
                
            } else {
                
                return false;
            }
        } catch (SQLException e) {
                System.out.println("There is no such set or examinee does not exist!!");
        } 

        return false;
    }
    
    
    
    @SuppressWarnings("deprecation")
	private void jButtonNavigatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNavigatorActionPerformed

        AdminOrExamineeJFrame navigator = new AdminOrExamineeJFrame();
        navigator.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNavigatorActionPerformed

    private void jTableExamineeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExamineeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableExamineeMouseClicked

    private void jButtonPlayQuizzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayQuizzActionPerformed
        if (!isSetAttempted()){
            String setname = jComboBoxSetname.getSelectedItem().toString();
            var sid = getsetId(setname);
            var eid = getexamineeId(uname, pass);
            QuizzJFrame quiz = new QuizzJFrame(sid,eid);
            quiz.setVisible(true);
            dispose();
        } 
        
    }//GEN-LAST:event_jButtonPlayQuizzActionPerformed

    private void jButtonUpdateExamineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateExamineeActionPerformed
        
        UpdateExamineeJFrame updateExaminee = new UpdateExamineeJFrame();
        updateExaminee.loadData(uname, pass);
        updateExaminee.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonUpdateExamineeActionPerformed

    
   
    
    
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
            java.util.logging.Logger.getLogger(DashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardJFrame(uname, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNavigator;
    private javax.swing.JButton jButtonPlayQuizz;
    private javax.swing.JButton jButtonUpdateExaminee;
    private javax.swing.JComboBox<String> jComboBoxSetname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableExaminee;
    // End of variables declaration//GEN-END:variables
}
