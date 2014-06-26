package logik;

import javax.swing.*;
import java.awt.*;

public class Karte extends JPanel {


    public int wert;
    public Art art;
    private Icon bild;


    /**
     * Diese Methode bestimmt den Stärkewert aller Karten
     * @return int wert für eine Random Zahl
     */
    public int getWert() {

        return wert;

    }

    public Art getArt() {
        return art;
    }

    public Karte( int w, Art a){


        wert = w;
        this.art = a;


//        setLayout(new BorderLayout());
        JLabel bilderNamenLabel = new JLabel(a.getZufaelligerName() );
        add(bilderNamenLabel, BorderLayout.NORTH);

        bild = a.getZufaelligesBild();
        JLabel bildLabel = new JLabel(bild);
        add(bildLabel, BorderLayout.CENTER);

        JLabel staerkeLabel = new JLabel("Stärke: " + w);
        add(staerkeLabel, BorderLayout.SOUTH);



    }



    @Override
    public String toString() {
        return art + " " + wert;
    }

    public Icon getBild() {
        return bild;
    }
}
