package common;

import dao.PharmacyUtils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class OpenPDF {

    public static void openById(int Id) {
        String billPath = PharmacyUtils.billpath;
        File pdfFile = new File(billPath + "" + Id + ".pdf");
        if (pdfFile.exists()) {
            try {
                Desktop.getDesktop().open(pdfFile);
                JOptionPane.showMessageDialog(null, "Opening PDF file...");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "File not found: " + pdfFile.getAbsolutePath());
        }
    }
}
