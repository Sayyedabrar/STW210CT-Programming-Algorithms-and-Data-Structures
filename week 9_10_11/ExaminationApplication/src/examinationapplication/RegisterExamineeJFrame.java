/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;

import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class RegisterExamineeJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form RegisterExamineeJFrame
     */
    javax.swing.ButtonGroup buttonGroup;
    MySQLConnect MySqlConn;
    public RegisterExamineeJFrame() {
        initComponents();
        setLocationRelativeTo(null);  // *** center appearance of the app ***
        MySqlConn =  new MySQLConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegisterAdmin = new javax.swing.JButton();
        cnfmpswdPasswordField = new javax.swing.JPasswordField();
        pswdPasswordField = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        genderTxtField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Full Name:");

        nameTxtField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        nameTxtField.setName("nameTxtField"); // NOI18N

        emailTxtField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        emailTxtField.setName("emailTxtField"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Email Id:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Gender:");

        contactTxtField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        contactTxtField.setName("contactTxtField"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Contact:");

        usernameTxtField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        usernameTxtField.setName("usernameTxtField"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Confirm Password:");

        btnRegisterAdmin.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnRegisterAdmin.setText("Register");
        btnRegisterAdmin.setName("btnRegisterAdmin"); // NOI18N
        btnRegisterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAdminActionPerformed(evt);
            }
        });

        cnfmpswdPasswordField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cnfmpswdPasswordField.setName("cnfmpswdPasswordField"); // NOI18N

        pswdPasswordField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pswdPasswordField.setName("pswdPasswordField"); // NOI18N

        btnReset.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        genderTxtField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        genderTxtField.setName("emailTxtField"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register New Examinee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );

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
                .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cnfmpswdPasswordField)
                                .addComponent(pswdPasswordField)
                                .addComponent(usernameTxtField)
                                .addComponent(contactTxtField)
                                .addComponent(emailTxtField)
                                .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnRegisterAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(375, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnfmpswdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnRegisterAdmin))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void clearControls() {
        nameTxtField.setText("");
        emailTxtField.setText("");
        contactTxtField.setText("");
        usernameTxtField.setText("");
        pswdPasswordField.setText("");
        cnfmpswdPasswordField.setText("");
        genderTxtField.setText("");
    }
    
    
    
    public Boolean isPresent(String username){
        try{
        	
            String query = "select * from examinee where username = '" + username + "'";
            ResultSet resultSet;
            resultSet= MySqlConn.retrieveData(query);
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, username + " is already taken!!");
                usernameTxtField.setText("");
                usernameTxtField.grabFocus();
                return true;
            }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error in database retrieval at isPresent method: " + ex);
        }
        return false;
    }
    
    public Boolean isFieldEmpty(String name, String username, String password, String confirmPassword, String email, String contact, String gender){
        
        if(name.trim().equals("") ||
           email.trim().equals("")||
           contact.trim().equals("")||
           username.trim().equals("")||
           password.trim().equals("")||
           confirmPassword.trim().equals("")||
           gender.trim().contentEquals("")
            )
        {
        	
            JOptionPane.showMessageDialog(null, "All fields must be filled!!");
            return true;
        }
        return false;
    }   
    
    
    
    public Boolean addExaminee(String Jframename, String Jframeusername, String Jframepassword, String JframeconfirmPassword, String Jframeemail, String Jframecontact, String Jframegender) {
        String name = Jframename;
        String username = Jframeusername;
        String contact = Jframecontact;
        String email = Jframeemail;
        String password = Jframepassword;
        String confirmPassword = JframeconfirmPassword;
        String findgender = Jframegender;
        String gender;
        switch (findgender) {
        case "Male":
        case "male":
            gender = "Male";
            break;
        case "Female":
        case "female":
            gender = "Female";
            break;
        case "Other":
        case "other":
            gender = "Other";
            break;
        default:
            JOptionPane.showMessageDialog(null, "Gender can be 'Male' or 'Female' or 'Other' ");
            genderTxtField.setText("");
            genderTxtField.grabFocus();
            return false;
          
        }    
        if (pswdPasswordField.getText().equals(cnfmpswdPasswordField.getText())) {
            password = pswdPasswordField.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Password did not matched!!");
            pswdPasswordField.setText("");
            cnfmpswdPasswordField.setText("");
            pswdPasswordField.grabFocus();
        } 
        Boolean isEmpty = isFieldEmpty(name, username, password, confirmPassword, email, contact, gender);
 
        
        if (!isEmpty){
            if (!isPresent(username)){
        
                String query = "insert into examinee (name, username, password, gender, contact, email) values ('"+ name +"','"+ username +"','"+ password +"', '"+ gender +"','"+ contact +"','"+ email+"')";
                System.out.println(query);
                MySqlConn.executeSQLQuery(query, "Congratulation Dear. " + name + ". You have been qualified for the quizz. Your login Token for appaearing quizz are: username: ====>> " + username + " and password: ===>> "+ password + ". Best of luck!");

                    return true;
            } else {
                System.out.println("Data didnot validated!!!");
                return false;
            }
        } 
        return false;
    }
    
    
    
    @SuppressWarnings("deprecation")
	private void btnRegisterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAdminActionPerformed
    	
    	String name = nameTxtField.getText();
        String username = usernameTxtField.getText();
        String contact = contactTxtField.getText();
        String email = emailTxtField.getText();
        String password = pswdPasswordField.getText();
        String confirmPassword = cnfmpswdPasswordField.getText();
        String gender = genderTxtField.getText();
    	Boolean examinee = addExaminee(name, username, password, confirmPassword, email, contact, gender);
        if (examinee){
            clearControls();
            ExamineeLoginJFrame login = new ExamineeLoginJFrame();
            login.show();
            dispose();
        }

    }//GEN-LAST:event_btnRegisterAdminActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearControls();
    }//GEN-LAST:event_btnResetActionPerformed

    @SuppressWarnings("deprecation")
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
            java.util.logging.Logger.getLogger(RegisterExamineeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterExamineeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterAdmin;
    private javax.swing.JButton btnReset;
    private javax.swing.JPasswordField cnfmpswdPasswordField;
    private javax.swing.JTextField contactTxtField;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JPasswordField pswdPasswordField;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
