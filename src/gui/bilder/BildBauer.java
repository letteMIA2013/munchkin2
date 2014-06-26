package gui.bilder;

import logik.Art;

import javax.swing.*;



public class BildBauer {
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

    public static void main(String[] args) {

        ImageIcon zufaelligesBild = Art.SCHATZ.getZufaelligesBild();

        JFrame frame = new JFrame();
        String zufaelligerName = Art.SCHATZ.getZufaelligerName();
        frame.setTitle(zufaelligerName);
        JLabel label = new JLabel(zufaelligesBild);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
