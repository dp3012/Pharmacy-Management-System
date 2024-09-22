
import CRUD.CRUD;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPDF;
import dao.ConnectionProvider;
import dao.PharmacyUtils;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Selling extends javax.swing.JFrame {

    static int oi = 0;
    static int no = 0;
    static float sum = 0;
    private String username = "";

    public Selling() {
        initComponents();
    }

    public Selling(String tuser) {
        initComponents();
        username = tuser;
        setLocationRelativeTo(null);
    }

    public int getId() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("bill_number.txt"));
            String line = br.readLine();
            if (line != null) {
                no = Integer.parseInt(line);
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        no++;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("bill_number.txt"));
            bw.write(Integer.toString(no));
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return no;
    }

    private void medicine(String n) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n + "'");
            DefaultTableModel model = (DefaultTableModel) medsTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Name") + " - " + rs.getString("Power")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        closeButton = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        medInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medsTable = new javax.swing.JTable();
        medName = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        pricePerUnit = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        power = new javax.swing.JLabel();
        txtbill = new javax.swing.JTextField();
        txtpower = new javax.swing.JTextField();
        totalBill = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        quantity = new javax.swing.JLabel();
        addToCartButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        JTableHeader head = cartTable.getTableHeader();
        head.setFont(new Font("Century gothic",Font.BOLD,14));
        currency = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        purchaseButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(204, 255, 255));
        title.setText("Sell Medicine");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 40));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 2020, 10));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 10, 40, 30));

        search.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        search.setForeground(new java.awt.Color(204, 255, 255));
        search.setText("Search");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, -1));

        medInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medInputActionPerformed(evt);
            }
        });
        medInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medInputKeyReleased(evt);
            }
        });
        getContentPane().add(medInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 400, 30));

        medsTable.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        medsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Medicine"
            }
        ));
        medsTable.setShowGrid(true);
        medsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 400, 670));

        medName.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        medName.setForeground(new java.awt.Color(204, 255, 255));
        medName.setText("Medicine Name");
        getContentPane().add(medName, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, -1, -1));

        txtname.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 350, -1));

        pricePerUnit.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        pricePerUnit.setForeground(new java.awt.Color(204, 255, 255));
        pricePerUnit.setText("Price per unit");
        getContentPane().add(pricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 160, -1));

        txtprice.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 350, 30));

        power.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        power.setForeground(new java.awt.Color(204, 255, 255));
        power.setText("Power");
        getContentPane().add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 170, 122, -1));

        txtbill.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        txtbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbillActionPerformed(evt);
            }
        });
        getContentPane().add(txtbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 410, 360, -1));

        txtpower.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        txtpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpowerActionPerformed(evt);
            }
        });
        getContentPane().add(txtpower, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 210, 364, -1));

        totalBill.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        totalBill.setForeground(new java.awt.Color(204, 255, 255));
        totalBill.setText("Total Bill");
        getContentPane().add(totalBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 370, -1, -1));

        txtquantity.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });
        txtquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquantityKeyReleased(evt);
            }
        });
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 310, 364, -1));

        quantity.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        quantity.setForeground(new java.awt.Color(204, 255, 255));
        quantity.setText("Quantity");
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 270, -1, -1));

        addToCartButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        addToCartButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        addToCartButton.setText("Add To Cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addToCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, -1, 32));

        cancelButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        cancelButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signs-close-icon-png-removebg-pr.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, -1, 30));

        cartTable.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        cartTable.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Power", "Price/unit", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setShowHorizontalLines(true);
        cartTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 760, 269));

        currency.setBackground(new java.awt.Color(204, 204, 204));
        currency.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        currency.setForeground(new java.awt.Color(102, 255, 102));
        currency.setText("RS:");
        getContentPane().add(currency, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 840, -1, -1));

        totalAmount.setBackground(new java.awt.Color(204, 204, 204));
        totalAmount.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        totalAmount.setForeground(new java.awt.Color(0, 255, 51));
        totalAmount.setText("00");
        getContentPane().add(totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, -1, -1));

        purchaseButton.setBackground(new java.awt.Color(204, 255, 102));
        purchaseButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        purchaseButton.setText("Purchase & Print");
        purchaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseButtonMouseClicked(evt);
            }
        });
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(purchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 840, -1, -1));

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
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to close the application? ", "Select", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void medInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medInputActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpowerActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
        String n = txtname.getText();
        String q = txtquantity.getText();
        if (!n.equals("") && !q.equals("")) {
            String p = txtpower.getText();
            float c = Float.parseFloat(txtprice.getText());
            int s = Integer.parseInt(q);
            float t = (c * s);
            CRUD.delete(n, p, c, s);
            try {
                DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n + "' AND Power='" + p + "'");
                if (rs.next()) {
                    int a = rs.getInt("Stock");
                    if (a <= s) {
                        s = a;
                    }
                }
                model.insertRow(Selling.oi++, new Object[]{n, p, c, s, t});
                if (model.getRowCount() != 0) {
                    sum = sum + t;
                    totalAmount.setText("" + sum);
                }
                txtname.setText("");
                txtpower.setText("");
                txtprice.setText("");
                txtquantity.setText("");
                txtbill.setText("");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        // TODO add your handling code here:
        float ta = Float.parseFloat(totalAmount.getText());
        if (ta != 0) {
            int Id = getId();
            try {
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                Connection con = ConnectionProvider.getCon();
                PreparedStatement pst = con.prepareStatement("INSERT INTO bill (billId, billDate, TotalPrice, generated) VALUES (?,?,?,?) ");
                pst.setInt(1, Id);
                pst.setString(2, (f.format(cal.getTime())));
                pst.setFloat(3, ta);
                pst.setString(4, username);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Inserted Sucessfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(PharmacyUtils.billpath + "" + Id + ".pdf"));
                doc.open();
                Paragraph pharmacyName = new Paragraph("                     Pharmacy Management System");
                doc.add((Element) pharmacyName);
                Paragraph Start = new Paragraph("***********************************************************************************");
                doc.add((Element) Start);
                Paragraph details = new Paragraph("\t Bill Id : " + Id + "\n Date : " + new Date() + "\n Total Amount : " + ta);
                doc.add((Element) details);
                doc.add((Element) Start);
                PdfPTable tb1 = new PdfPTable(5);
                tb1.addCell("Medicine Name");
                tb1.addCell("Power");
                tb1.addCell("Price per unit");
                tb1.addCell("Quantity");
                tb1.addCell("Total Price");
                for (int i = 0; i < cartTable.getRowCount(); i++) {
                    String n = cartTable.getValueAt(i, 0).toString();
                    String p = cartTable.getValueAt(i, 1).toString();
                    String c = cartTable.getValueAt(i, 2).toString();
                    String q = cartTable.getValueAt(i, 3).toString();
                    String tA = cartTable.getValueAt(i, 4).toString();
                    tb1.addCell(n);
                    tb1.addCell(p);
                    tb1.addCell(c);
                    tb1.addCell(q);
                    tb1.addCell(tA);
                }
                doc.add(tb1);
                doc.add((Element) Start);
                Paragraph thank = new Paragraph("Thank you, Please visit again");
                doc.add((Element) thank);
                JOptionPane.showMessageDialog(null, "PDF IS CREATED");
                OpenPDF.openById(Id);
            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new Selling(username).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please add Some medicine to cart");
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void txtbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbillActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtpower.setText("");
        txtprice.setText("");
        txtquantity.setText("");
        txtbill.setText("");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        medicine("");
        txtname.setEditable(false);
        txtpower.setEditable(false);
        txtprice.setEditable(false);
        txtquantity.setEditable(true);
    }//GEN-LAST:event_formComponentShown

    private void medInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medInputKeyPressed
        // TODO add your handling code here:
        String n = medInput.getText();
        medicine(n);
    }//GEN-LAST:event_medInputKeyPressed

    private void medInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medInputKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_medInputKeyReleased

    private void medsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medsTableMouseClicked
        // TODO add your handling code here:
        int i = medsTable.getSelectedRow();
        TableModel model = medsTable.getModel();
        String t = model.getValueAt(i, 0).toString();
        String n[] = t.split(" - ", 0);
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n[0] + "' AND Power='" + n[1] + "'");
            while (rs.next()) {
                txtname.setText(n[0]);
                txtpower.setText(n[1]);
                txtprice.setText(rs.getString("Price"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medsTableMouseClicked

    private void txtquantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantityKeyReleased
        // TODO add your handling code here:
        String q = txtquantity.getText();
        if (!q.equals("")) {
            String t = txtprice.getText();
            float p = Float.parseFloat(t);
            float tp = Integer.parseInt(q) * p;
            txtbill.setText("" + tp);
        } else {
            txtbill.setText("");
        }
    }//GEN-LAST:event_txtquantityKeyReleased

    private void purchaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel currency;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField medInput;
    private javax.swing.JLabel medName;
    private javax.swing.JTable medsTable;
    private javax.swing.JLabel power;
    private javax.swing.JLabel pricePerUnit;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel search;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel totalBill;
    private javax.swing.JTextField txtbill;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpower;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
