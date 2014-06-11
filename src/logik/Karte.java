package logik;

import javax.swing.JLabel;
import java.awt.Image;import java.lang.Override;import java.lang.String;

public class Karte extends JLabel{


    public int wert;
    public Art art;
    public Image bild;



    public Karte( int w, Art a/*Bild b*/){

        this.wert = w;
        this.art = a;

       //this.bild = b








    }




    @Override
    public String toString() {
        return art + " " + wert;
    }
}
