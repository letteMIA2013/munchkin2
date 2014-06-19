package gui.bilder;

import logik.Art;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class BildBauer {
    public ImageIcon createImageIcon(String pfad) {
        java.net.URL imgURL = getClass().getResource(pfad);
        if (imgURL != null) {
            ImageIcon imageIcon = new ImageIcon(imgURL, "");
            return new ImageIcon(createResizedCopy(imageIcon.getImage(), 150, 150));
        } else {
            JOptionPane.showMessageDialog(null, "Konnte URL nicht finden: " + imgURL + " für Pfad: " + pfad);
            return null;
        }
    }



    private BufferedImage createResizedCopy(Image originalImage,
                                            int scaledWidth, int scaledHeight)
    {
        int imageType = BufferedImage.TYPE_INT_RGB ;
        BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
        Graphics2D g = scaledBI.createGraphics();

        g.setComposite(AlphaComposite.Src);

        g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
        g.dispose();
        return scaledBI;
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
