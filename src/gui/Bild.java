package gui;import javax.swing.*;
// Created by Bundesmann on 05.06.14.


public class Bild {
    public ImageIcon createImageIcon(String pfad) {
        java.net.URL imgURL = getClass().getResource(pfad);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "");
        }
        else {
            JOptionPane.showMessageDialog(null,"Konnte URL nicht finden");
            return null;
        }
    }
}
