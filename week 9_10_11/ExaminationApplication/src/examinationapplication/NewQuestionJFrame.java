/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sayyed Abrar Akhtar
 */
public class NewQuestionJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewQuestionJFrame
     */
    int operation =0, row=0,  qid ;
    MySQLConnect mySqlConn;
    public NewQuestionJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        mySqlConn =  new MySQLConnect();
        loadComboBox();
        loadTable();
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
        jButtonRegister1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQ = new javax.swing.JTable();
        jTextFieldQuest = new javax.swing.JTextField();
        jTextFieldO1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldO3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldO5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldO2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldO4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSetname = new javax.swing.JComboBox<>();
        jTextFieldCrctAns = new javax.swing.JTextField();
        jButtonUpdateQuest = new javax.swing.JButton();
        jButtonAddNewQuest = new javax.swing.JButton();
        jButtonNewSet = new javax.swing.JButton();
        jButtonDelQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Question");

        jButtonRegister1.setBackground(new java.awt.Color(44, 62, 80));
        jButtonRegister1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/undo2.png"))); // NOI18N
        jButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTableQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Question", "Opt 1", "Opt 2", "Opt 3", "Opt 4", "Opt 5", "Answer", "Setname"
            }
        ));
        jTableQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQ);

        jTextFieldQuest.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTextFieldO1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Option 1:");

        jTextFieldO3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Option 3:");

        jTextFieldO5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Option 5:");

        jTextFieldO2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Option 2:");

        jTextFieldO4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Option 4:");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Question:");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Correct Answer:");

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setText("Set Name:");

        jComboBoxSetname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTextFieldCrctAns.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jButtonUpdateQuest.setBackground(new java.awt.Color(44, 62, 80));
        jButtonUpdateQuest.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButtonUpdateQuest.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateQuest.setText("Update Question");
        jButtonUpdateQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateQuestActionPerformed(evt);
            }
        });

        jButtonAddNewQuest.setBackground(new java.awt.Color(44, 62, 80));
        jButtonAddNewQuest.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButtonAddNewQuest.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddNewQuest.setText("Add New Question");
        jButtonAddNewQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewQuestActionPerformed(evt);
            }
        });

        jButtonNewSet.setBackground(new java.awt.Color(44, 62, 80));
        jButtonNewSet.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButtonNewSet.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNewSet.setText("Add New Set");
        jButtonNewSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewSetActionPerformed(evt);
            }
        });

        jButtonDelQuestion.setBackground(new java.awt.Color(44, 62, 80));
        jButtonDelQuestion.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButtonDelQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelQuestion.setText("Delete Question");
        jButtonDelQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelQuestionActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldO3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldO5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldO1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAddNewQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jButtonUpdateQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCrctAns, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxSetname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldO4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButtonDelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNewSet, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldO2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(jTextFieldQuest)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldCrctAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jComboBoxSetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdateQuest)
                    .addComponent(jButtonNewSet)
                    .addComponent(jButtonAddNewQuest)
                    .addComponent(jButtonDelQuestion))
                .addGap(31, 31, 31))
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

    private void jButtonAddNewQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewQuestActionPerformed
        

    	String question = jTextFieldQuest.getText();
    	String a = jTextFieldO1.getText();
    	String b = jTextFieldO2.getText();
    	String c = jTextFieldO3.getText();
    	String d = jTextFieldO4.getText();
    	String e = jTextFieldO5.getText();
    	String correctans = jTextFieldCrctAns.getText();
    	String setname = jComboBoxSetname.getSelectedItem().toString();
    	int setid =getsetId(setname);
        addQuestion(question, a, b, c, d, e, correctans, setid);
        clearControls();  
        loadTable();
    }//GEN-LAST:event_jButtonAddNewQuestActionPerformed

    private void jTableQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQMouseClicked
        
        
        operation=1;
        row = jTableQ.getSelectedRow();
        qid = (int) jTableQ.getModel().getValueAt(row,0);
        String value = jTableQ.getModel().getValueAt(row,1).toString();
        jTextFieldQuest.setText(value);
        value = jTableQ.getModel().getValueAt(row,2).toString();
        jTextFieldO1.setText(value);
        value = jTableQ.getModel().getValueAt(row,3).toString();
        jTextFieldO2.setText(value);
        value = jTableQ.getModel().getValueAt(row,4).toString();
        jTextFieldO3.setText(value);
        value = jTableQ.getModel().getValueAt(row,5).toString();
        jTextFieldO4.setText(value);
        value = jTableQ.getModel().getValueAt(row,6).toString();
        jTextFieldO5.setText(value);
        value = jTableQ.getModel().getValueAt(row,7).toString();
        jTextFieldCrctAns.setText(value);
        int id = (int) jTableQ.getModel().getValueAt(row,7);
        String setname = getsetName(id);
        jComboBoxSetname.setSelectedItem(setname);
        
    }//GEN-LAST:event_jTableQMouseClicked

    private void jButtonUpdateQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateQuestActionPerformed
       
    	String question = jTextFieldQuest.getText();
    	String a = jTextFieldO1.getText();
    	String b = jTextFieldO2.getText();
    	String c = jTextFieldO3.getText();
    	String d = jTextFieldO4.getText();
    	String e = jTextFieldO5.getText();
    	String correctans = jTextFieldCrctAns.getText();
    	String setname = jComboBoxSetname.getSelectedItem().toString();
    	int setid =getsetId(setname);
        updateQuestion(question, a, b, c, d, e, correctans, setid, qid);
        loadTable();
    }//GEN-LAST:event_jButtonUpdateQuestActionPerformed

    private void jButtonDelQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelQuestionActionPerformed
    	

    	int quesid = getquesId(jTextFieldQuest.getText());
        deleteQuestion(quesid);
        loadTable();
        
    }//GEN-LAST:event_jButtonDelQuestionActionPerformed

    public int getquesId(String ques) {
    	int quesid=0;
    	try{
            String query = "select id from questions where question = '" + ques + "'";
            System.out.println(query);
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
            	quesid = resultset.getInt("id");
            }
        } catch(SQLException ex){
            System.out.println("Error in getting setid in getsetName method: " + ex);
        }
    	return quesid;
    }
    
    
    private void jButtonNewSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewSetActionPerformed
        NewQuestionSetJFrame newset = new NewQuestionSetJFrame();
        newset.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNewSetActionPerformed

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegister1ActionPerformed

        AdminOrExamineeJFrame navigator = new AdminOrExamineeJFrame();
        navigator.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegister1ActionPerformed

    
   
    private void clearControls() {
        jTextFieldQuest.setText("");
        jTextFieldO1.setText("");
        jTextFieldO2.setText("");
        jTextFieldO3.setText("");
        jTextFieldO4.setText("");
        jTextFieldO5.setText("");
        jTextFieldCrctAns.setText("");
    }
    public Boolean loadTable() {
    
        try {
            String query = "SELECT * FROM `questions` ORDER BY `questions`.`id` Desc ";

            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            DefaultTableModel model = (DefaultTableModel) jTableQ.getModel();
            if (resultset.next()){
                while(resultset.next()) {
           
                model.addRow(new Object[]{resultset.getInt("id"),resultset.getString("question"), resultset.getString("a"), resultset.getString("b"), resultset.getString("c"), resultset.getString("d"), resultset.getString("e"), resultset.getString("correctanswer"),resultset.getInt("setid")});
               
                }
                return true;
            }
  
        } catch (SQLException ex) {
            System.out.println("Error in loading question details in table newQuestionJframe :" + ex );
        }
        return false;
    }
    
    
    public Boolean loadComboBox() {
    
        try {  
            
            String query = "select * from questionset";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
                while (resultset.next()) {  
                    jComboBoxSetname.addItem(resultset.getString("setname"));  
                }
                return true;
            }
            } catch (SQLException e) {  
                System.out.println("Failed to Connect to Database, Error Connection");  
                System.exit(0);  
            } 
        return false;
    }
    
    public int getsetId(String setname){
        int setid = -1;
        try{
            String query = "select id from questionset where setname = '" + setname + "'";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
                setid = resultset.getInt("id");
            }
        } catch(SQLException ex){
            System.out.println("Error in getting setid in getsetId method: " + ex);
        }
        return setid;
    }
    
    
    public String getsetName(int id){
        String setname = "";
        try{
            String query = "select setname from questionset where id = " + id ;
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()){
                setname = resultset.getString("setname");
            }
        } catch(SQLException ex){
            System.out.println("Error in getting setname in getsetName method: " + ex);
        }
        return setname;
    }
    
    public Boolean addQuestion(String question, String a, String b, String c, String d, String e, String correctans, int setid){
        

        
        if(question.trim().equals("")||
                a.trim().equals("")||
                b.trim().equals("") ||
                correctans.trim().equals("")||
                e.trim().equals("")||
                d.trim().equals("")||
                c.trim().equals("")
            ) {
            JOptionPane.showMessageDialog(null, "All fields must be filled!!");
        } 
        
        try{
            
            String query = "select * from questions where question = '" + question +"'";
            ResultSet resultset;
            resultset = mySqlConn.retrieveData(query);
            if (resultset.next()) {
                JOptionPane.showMessageDialog(null, "This question is already added! Please add another.");
                jTextFieldQuest.setText("");
                jTextFieldQuest.grabFocus();
            } else {
        
                query = "Insert into questions (question, a, b, c, d, e, correctanswer, setid)values('" +question+ "', '" +a+ "', '" +b+ "', '" +c+ "', '" +d+ "', '" +e+ "', '" +correctans+ "', " +setid+ ")";
                return mySqlConn.executeSQLQuery(query, "New Question Added Successfully!");
            }
        } catch(HeadlessException | SQLException ex) {
            System.out.println("Error in inserting question at line 345: " + ex);
        }
        return false;
    }
    
   
    
    
    public Boolean updateQuestion(String question, String a, String b, String c, String d, String e, String correctans, int setid, int questionid){
        


        try {
            String query = "update questions set question = '" + question + "', a = '" + a + "', b = '" + b + "', c = '" + c + "', d = '" + d + "', e = '" + e + "', correctanswer = '" + correctans + "', setid = " + setid + " where id = "+ questionid;
            System.out.println(query);
            return mySqlConn.executeSQLQuery(query, "Question updated successfully!");

        } catch (Exception ex) {
            System.out.println("Question update error at updatequestion method: " + ex);
        }
        return false;
    }
    
    public Boolean deleteQuestion(int quesid) {
        
        try{
        
            String query = "delete from questions where id = " + quesid;
            return mySqlConn.executeSQLQuery(query, "Deleted Successfully");

        } catch (HeadlessException ex) {
            System.out.println("Question delete error at deleteQuestion method: " + ex);
        }
        return false;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(NewQuestionJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewQuestionJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewQuest;
    private javax.swing.JButton jButtonDelQuestion;
    private javax.swing.JButton jButtonNewSet;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JButton jButtonUpdateQuest;
    private javax.swing.JComboBox<String> jComboBoxSetname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQ;
    private javax.swing.JTextField jTextFieldCrctAns;
    private javax.swing.JTextField jTextFieldO1;
    private javax.swing.JTextField jTextFieldO2;
    private javax.swing.JTextField jTextFieldO3;
    private javax.swing.JTextField jTextFieldO4;
    private javax.swing.JTextField jTextFieldO5;
    private javax.swing.JTextField jTextFieldQuest;
    // End of variables declaration//GEN-END:variables

    
}