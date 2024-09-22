package CRUD;

import dao.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CRUD {

    public static void insert(String n, String p, float c, int s) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement pst = con.prepareStatement("INSERT INTO pharmacy1 (Name, Power, Price, Stock) VALUES (?,?,?,?) ");
            pst.setString(1, n);
            pst.setString(2, p);
            pst.setFloat(3, c);
            pst.setInt(4, s);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Inserted Sucessfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void delete(String n, String p, float c, int f) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n + "' AND Power='" + p + "'");
            if (rs.next()) {
                int a = rs.getInt("Stock");
                if (a <= f) {
                    int option = JOptionPane.showConfirmDialog(null, "Stock is not enough,you want to buy all medicine ?", "Select", JOptionPane.YES_NO_OPTION);
                    if (option == 0) {
                        st.executeUpdate("DELETE FROM pharmacy1 WHERE Name='" + n + "' AND Power='" + p + "';");
                        PreparedStatement pst = con.prepareStatement("INSERT INTO record (Name, Power, Price, Stock, TotalPrice) VALUES (?,?,?,?,?) ");
                        pst.setString(1, n);
                        pst.setString(2, p);
                        pst.setFloat(3, c);
                        pst.setInt(4, a);
                        pst.setFloat(5, (a * c));
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Inserted into Record Sucessfully");
                    } else {

                    }
                } else {
                    int d = a - f;
                    st.executeUpdate("UPDATE pharmacy1 SET Stock= '" + d + "' WHERE Name='" + n + "' AND Power='" + p + "';");
                    PreparedStatement pst = con.prepareStatement("INSERT INTO record (Name, Power, Price, Stock, TotalPrice) VALUES (?,?,?,?,?) ");
                    pst.setString(1, n);
                    pst.setString(2, p);
                    pst.setFloat(3, c);
                    pst.setInt(4, f);
                    pst.setFloat(5, (f * c));
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Inserted into Record Sucessfully");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No record found for " + n + "and power" + p + ".", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(String n, String p, float c, int b) {
        try {
            int f;
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pharmacy1 WHERE Name='" + n + "' AND Power='" + p + "'");
            if (rs.next()) {
                f = rs.getInt("Stock");
                st.executeUpdate("UPDATE pharmacy1 SET Stock= '" + (b + f) + "' WHERE Name='" + n + "' AND Power='" + p + "';");
                JOptionPane.showMessageDialog(null, "Stock is updated");
            } else {
                JOptionPane.showMessageDialog(null, rs);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
