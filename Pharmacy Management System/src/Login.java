
import dao.ConnectionProvider;
import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame {
//    private final static String[] validUsernames = {"bhavya", "kirtan", "vyom", "darsh", "vishrut"};
//    private final static String[] validPasswords = {"020405", "123455", "123456", "234567", "567891"};

    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 440, -1, -1));

        Username.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 390, 300, -1));

        Password.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 440, 300, -1));

        Login.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 0, 102));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/113-log-sign-in (1).png"))); // NOI18N
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 500, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 0, 40, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PHARMACY MANAGEMENT SYSTEMt (4).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the application", "Select", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String username = Username.getText().trim();
        String password = new String(Password.getPassword());
        int t = 0;

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM appuser WHERE username ='" + username + "' AND password ='" + password + "'");
            while (rs.next()) {
                t = 1;
                if (rs.getString("username").equals(username)) {
                    new Dashboard(username).setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password entered");
                }
            }
            if (t == 0) {
                JOptionPane.showMessageDialog(Login.this, "Login failed.Invalid username or password entered");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        if (Username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Login.this, "Enter your name : ");
            Username.grabFocus();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        String password = new String(Password.getPassword());
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(Login.this, "Enter your password : ");
            Password.grabFocus();
        }
    }//GEN-LAST:event_PasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
