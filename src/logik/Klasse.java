package logik;

import gui.bilder.BildBauer;

import javax.swing.*;
import java.awt.*;

public class Klasse {


    public Klasse() {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JPanel klasse = new JPanel(new BorderLayout());

        JLabel krieger = new JLabel("Krieger");
        BildBauer bild1 = new BildBauer();
        ImageIcon icon = bild1.createImageIcon("klasse/Krieger.png");
        krieger.setIcon(icon);


        JLabel dieb = new JLabel("Dieb");
        ImageIcon icon2 = bild1.createImageIcon("klasse/Dieb-.png");
        dieb.setIcon(icon2);

        klasse.add(dieb, BorderLayout.WEST);
        klasse.add(krieger, BorderLayout.EAST);
        frame.add(klasse);

        frame.setVisible(true);


    }




}
