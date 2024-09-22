package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("CREATE TABLE appuser(Id INT AUTO_INCREMENT PRIMARY KEY,"+"username VARCHAR(50),"+"password VARCHAR(10)"+");");
            st.executeUpdate("CREATE TABLE pharmacy1(Name TEXT," + "Power TEXT," + "Price FLOAT," + "Stock INT(10)" + ");");
            st.executeUpdate("CREATE TABLE record(Name TEXT,"+"Power TEXT,"+"Price FLOAT,"+ "Stock INT(10),"+"TotalPrice FLOAT"+");");
            st.executeUpdate("CREATE TABLE bill(billId INT,"+"billDate VARCHAR(10),"+"TotalPrice FLOAT,"+"generated VARCHAR(50)"+");");
            JOptionPane.showMessageDialog(null, "Table created");
            st.executeUpdate("INSERT INTO appuser (username,password) VALUES('BHAVYA','020405')");
            st.executeUpdate("INSERT INTO appuser (username,password) VALUES('KIRTAN','123455')");
            st.executeUpdate("INSERT INTO appuser (username,password) VALUES('VYOM','123456')");
            st.executeUpdate("INSERT INTO appuser (username,password) VALUES('DARSH','456789')");
            st.executeUpdate("INSERT INTO appuser (username,password) VALUES('VISHRUT','567891')");
            JOptionPane.showMessageDialog(null, "Data Inserted Sucessfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
