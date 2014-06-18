package logik;

import javax.swing.*;
import java.awt.*;
import java.lang.Override;import java.lang.String;

public class Karte extends JPanel {


    public int wert;
    public Art art;
    public ImageIcon bild;


    public Art getArt() {
        return art;
    }

    public Karte( int w, Art a, ImageIcon bild){

        //TODO: getter methoden hierfür:
        this.wert = w;

        this.art = a;
        this.bild = bild;


//        setLayout(new BorderLayout());
        JLabel namenLabel = new JLabel("Namen:" );
        add(namenLabel, BorderLayout.NORTH);
        //TODO: jlabel fürs bild erzeugen und in die mitte hinzufügen

        JLabel bilderNamenLabel = new JLabel();
        add(bilderNamenLabel, BorderLayout.CENTER);
        //TODO: jlabel für namen erzeugen und oben hinzufügen

        JLabel staerkeLabel = new JLabel("Stärke: " + w);
        add(staerkeLabel, BorderLayout.SOUTH);









    }




    @Override
    public String toString() {
        return art + " " + wert;
    }
}
