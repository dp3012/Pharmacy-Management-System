
import CRUD.CRUD;
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class UpdateMedicine extends javax.swing.JFrame {

    public UpdateMedicine() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        power1 = new javax.swing.JLabel();
        searchButton1 = new javax.swing.JButton();
        medName1 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        addQuantity1 = new javax.swing.JLabel();
        txtmedicine = new javax.swing.JTextField();
        quantity1 = new javax.swing.JLabel();
        txtaddquantity = new javax.swing.JTextField();
        pricePerUnit1 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        updateButton1 = new javax.swing.JButton();
        txtpower = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(204, 255, 255));
        title.setText("Update Medicine");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 7, -1, -1));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, 1986, 10));

        backButton.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (3)_1.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1887, 7, 37, -1));

        power1.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        power1.setForeground(new java.awt.Color(204, 255, 255));
        power1.setText("Power");
        getContentPane().add(power1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        searchButton1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/output-onlinepngtools (1)_1.png"))); // NOI18N
        searchButton1.setText("Search");
        searchButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButton1MouseClicked(evt);
            }
        });
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 200, -1, 40));

        medName1.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        medName1.setForeground(new java.awt.Color(204, 255, 255));
        medName1.setText("Medicine Name");
        getContentPane().add(medName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, 40));

        txtquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 390, 40));

        addQuantity1.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        addQuantity1.setForeground(new java.awt.Color(204, 255, 255));
        addQuantity1.setText("Add Quantity");
        getContentPane().add(addQuantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, -1, 40));

        txtmedicine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicineActionPerformed(evt);
            }
        });
        getContentPane().add(txtmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 360, 40));

        quantity1.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        quantity1.setForeground(new java.awt.Color(204, 255, 255));
        quantity1.setText("Quantity");
        getContentPane().add(quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        txtaddquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtaddquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddquantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 130, 40));

        pricePerUnit1.setFont(new java.awt.Font("Century Gothic", 1, 27)); // NOI18N
        pricePerUnit1.setForeground(new java.awt.Color(204, 255, 255));
        pricePerUnit1.setText("Price per Unit");
        getContentPane().add(pricePerUnit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, -1, -1));

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 400, 40));

        updateButton1.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        updateButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled_design__1_-removebg-pre.png"))); // NOI18N
        updateButton1.setText("Update");
        updateButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButton1MouseClicked(evt);
            }
        });
        getContentPane().add(updateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 530, -1, -1));

        txtpower.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpowerActionPerformed(evt);
            }
        });
        getContentPane().add(txtpower, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 390, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the application", "Select", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void txtmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicineActionPerformed

    private void txtaddquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddquantityActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void txtpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpowerActionPerformed

    private void updateButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButton1MouseClicked
        // TODO add your handling code here:
        String n = txtmedicine.getText();
        String p = txtpower.getText();
        float c = Float.parseFloat(txtprice.getText());
        int b = Integer.parseInt(txtaddquantity.getText());
        CRUD.update(n, p, c, b);
        txtmedicine.setText("");
        txtpower.setText("");
        txtprice.setText("");
        txtaddquantity.setText("");
        txtquantity.setText("");
    }//GEN-LAST:event_updateButton1MouseClicked

    private void searchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton1MouseClicked
        // TODO add your handling code here:
        String n = txtmedicine.getText();
        String p = txtpower.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n + "' AND Power='" + p + "'");
            if (rs.next()) {
                int s = rs.getInt("Stock");
                float c = rs.getFloat("Price");
                txtmedicine.setText(n);
                txtpower.setText(p);
                txtquantity.setText("" + s);
                txtprice.setText("" + c);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchButton1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addQuantity1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel medName1;
    private javax.swing.JLabel power1;
    private javax.swing.JLabel pricePerUnit1;
    private javax.swing.JLabel quantity1;
    private javax.swing.JButton searchButton1;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtaddquantity;
    private javax.swing.JTextField txtmedicine;
    private javax.swing.JTextField txtpower;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
