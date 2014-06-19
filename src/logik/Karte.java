package logik;

import javax.swing.*;
import java.awt.*;
import java.lang.Override;import java.lang.String;

public class Karte extends JPanel {


    public int wert;
    public Art art;


    public Art getArt() {
        return art;
    }

    public int getWert() {
        return wert;
    }



    public Karte( int w, Art a){

        this.wert = w;
        this.art = a;


//        setLayout(new BorderLayout());
        JLabel bilderNamenLabel = new JLabel(a.getZufaelligerName() );
        add(bilderNamenLabel, BorderLayout.NORTH);


        JLabel bildLabel = new JLabel(a.getZufaelligesBild());
        add(bildLabel, BorderLayout.CENTER);

        JLabel staerkeLabel = new JLabel("Stärke: " + w);
        add(staerkeLabel, BorderLayout.SOUTH);



    }



    @Override
    public String toString() {
        return art + " " + wert;
    }
}
