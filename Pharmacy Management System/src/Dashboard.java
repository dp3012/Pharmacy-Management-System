
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    private static String username;

    public Dashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public Dashboard(String user) {
        initComponents();
        username = user;
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addMedicineButton = new javax.swing.JButton();
        viewMedicineButton = new javax.swing.JButton();
        updateMedicineButton = new javax.swing.JButton();
        sellMedicineButton = new javax.swing.JButton();
        checkRecordButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        closeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("DASHBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 37, -1, -1));

        addMedicineButton.setBackground(new java.awt.Color(204, 255, 255));
        addMedicineButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        addMedicineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngfind.com-healthy-icon-png-682.png"))); // NOI18N
        addMedicineButton.setText("Add Medicine");
        addMedicineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedicineButtonMouseClicked(evt);
            }
        });
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 430, -1));

        viewMedicineButton.setBackground(new java.awt.Color(204, 255, 255));
        viewMedicineButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        viewMedicineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/output-onlinepngtools (1).png"))); // NOI18N
        viewMedicineButton.setText("View Medicine");
        viewMedicineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMedicineButtonMouseClicked(evt);
            }
        });
        viewMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicineButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 430, -1));

        updateMedicineButton.setBackground(new java.awt.Color(204, 255, 255));
        updateMedicineButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        updateMedicineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled_design__1_-removebg-preview.png"))); // NOI18N
        updateMedicineButton.setText("Update Medicine");
        updateMedicineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMedicineButtonMouseClicked(evt);
            }
        });
        getContentPane().add(updateMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, 430, -1));

        sellMedicineButton.setBackground(new java.awt.Color(204, 255, 255));
        sellMedicineButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        sellMedicineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled_design__2_-removebg-preview.png"))); // NOI18N
        sellMedicineButton.setText("Sell Medicine");
        sellMedicineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellMedicineButtonMouseClicked(evt);
            }
        });
        getContentPane().add(sellMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 430, -1));

        checkRecordButton.setBackground(new java.awt.Color(204, 255, 255));
        checkRecordButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        checkRecordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (3).png"))); // NOI18N
        checkRecordButton.setText("Check Records");
        checkRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRecordButtonMouseClicked(evt);
            }
        });
        getContentPane().add(checkRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, 430, -1));

        logoutButton.setBackground(new java.awt.Color(204, 255, 255));
        logoutButton.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (4).png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, 430, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1976, 10));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 10, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the application", "Select", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void addMedicineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicineButtonMouseClicked
        // TODO add your handling code here:
        new AddMed().setVisible(true);
        dispose();
    }//GEN-LAST:event_addMedicineButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void viewMedicineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicineButtonMouseClicked
        // TODO add your handling code here:
        new ViewMedicine().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_viewMedicineButtonMouseClicked

    private void sellMedicineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellMedicineButtonMouseClicked
        // TODO add your handling code here:
        new Selling(username).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sellMedicineButtonMouseClicked

    private void checkRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRecordButtonMouseClicked
        // TODO add your handling code here:
        new Record().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_checkRecordButtonMouseClicked

    private void viewMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewMedicineButtonActionPerformed

    private void updateMedicineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicineButtonMouseClicked
        // TODO add your handling code here:
        try {
            new UpdateMedicine().setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateMedicineButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JButton checkRecordButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton sellMedicineButton;
    private javax.swing.JButton updateMedicineButton;
    private javax.swing.JButton viewMedicineButton;
    // End of variables declaration//GEN-END:variables
}
