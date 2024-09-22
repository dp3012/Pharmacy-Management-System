
import CRUD.CRUD;
import javax.swing.*;

public class AddMed extends javax.swing.JFrame {

    public AddMed() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtmedicine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpower = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Medicine");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 350, 58));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 10, 40, 40));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 1990, 9));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Medicine");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 130, 40));

        txtmedicine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicineActionPerformed(evt);
            }
        });
        getContentPane().add(txtmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 390, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, 40));

        txtquantity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 390, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Power");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 120, 40));

        txtpower.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpowerActionPerformed(evt);
            }
        });
        getContentPane().add(txtpower, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 290, 400, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("price per unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 180, 41));

        txtprice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 450, 400, 40));

        btnsubmit.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));
        btnsubmit.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsubmit.setForeground(java.awt.SystemColor.controlHighlight);
        btnsubmit.setText("Submit");
        btnsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsubmitMouseClicked(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 140, 50));

        btncancel.setBackground(new java.awt.Color(255, 0, 0));
        btncancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 600, 120, 50));

        backButton.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (3)_1.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setContentAreaFilled(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1920, 1180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the application", "Select", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void txtmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicineActionPerformed

    private void txtpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpowerActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        // TODO add your handling code here:
        txtmedicine.setText("");
        txtquantity.setText("");
        txtpower.setText("");
        txtprice.setText("");
    }//GEN-LAST:event_btncancelMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnsubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMouseClicked
        // TODO add your handling code here:
        String n = txtmedicine.getText();
        String p = txtpower.getText();
        float c = Float.parseFloat(txtprice.getText());
        int s = Integer.parseInt(txtquantity.getText());
        CRUD.insert(n, p, c, s);
        txtmedicine.setText("");
        txtquantity.setText("");
        txtpower.setText("");
        txtprice.setText("");
//        CRUD.delete(n,p,c,s);
    }//GEN-LAST:event_btnsubmitMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtmedicine;
    private javax.swing.JTextField txtpower;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
