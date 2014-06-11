package logik;
import java.lang.System;import java.util.ArrayList;

public class Kartenstapel {

    private int ANZAHL_KARTEN = 30;


    public Kartenstapel(){


        ArrayList<Karte> stapel = new ArrayList<Karte>();


        /*for (Bild b :Bild.values() ) {




        }*/
        for (int i=1; i <= ANZAHL_KARTEN; i++) {


            Karte karte = new Karte(i, i < 20? Art.MONSTER : Art.SCHATZ);
            stapel.add(karte);


        }




        //Collections.shuffle(stapel);


        //System.out.println(" "+stapel.size());

    for(Karte karte : stapel) {
        System.out.println(karte);
    }







    }






    }







