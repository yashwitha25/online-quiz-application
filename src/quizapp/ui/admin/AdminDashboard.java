/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp.ui.admin;

/**
 *
 * @author x
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        viewResult = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        addQuestion = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 360));
        setMinimumSize(new java.awt.Dimension(480, 360));

        jPanel1.setMaximumSize(new java.awt.Dimension(480, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 360));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.WHITE);
        jLabel2.setText("Admin Dashboard");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 30, 230, 40);

        viewResult.setBackground(new java.awt.Color(51, 153, 255));
        viewResult.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        viewResult.setForeground(java.awt.Color.CYAN);
        viewResult.setText("View Result");
        viewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultActionPerformed(evt);
            }
        });
        jPanel1.add(viewResult);
        viewResult.setBounds(160, 230, 160, 50);

        addStudent.setBackground(new java.awt.Color(51, 153, 255));
        addStudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addStudent.setForeground(java.awt.Color.CYAN);
        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        jPanel1.add(addStudent);
        addStudent.setBounds(40, 130, 160, 50);

        addQuestion.setBackground(new java.awt.Color(51, 153, 255));
        addQuestion.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        addQuestion.setForeground(java.awt.Color.CYAN);
        addQuestion.setText("Add Question");
        addQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionActionPerformed(evt);
            }
        });
        jPanel1.add(addQuestion);
        addQuestion.setBounds(270, 130, 160, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ui/admin/psychedelic-paper-shapes-with-copy-space.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(480, 360));
        background.setMinimumSize(new java.awt.Dimension(480, 360));
        background.setPreferredSize(new java.awt.Dimension(480, 360));
        jPanel1.add(background);
        background.setBounds(-750, -60, 1410, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        this.dispose();
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_addStudentActionPerformed

    private void addQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionActionPerformed
        this.dispose();
        new AddQuestion().setVisible(true);
    }//GEN-LAST:event_addQuestionActionPerformed

    private void viewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultActionPerformed
        this.dispose();
        new ViewResult().setVisible(true);
    }//GEN-LAST:event_viewResultActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQuestion;
    private javax.swing.JButton addStudent;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewResult;
    // End of variables declaration//GEN-END:variables
}
