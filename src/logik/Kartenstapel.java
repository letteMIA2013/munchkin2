package logik;

import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;

public class Kartenstapel {

    private int ANZAHL_KARTEN = 30;
    private final ArrayList<Karte> stapel;


    public Kartenstapel() {


        stapel = new ArrayList<Karte>();


        for (int i = 1; i <= ANZAHL_KARTEN; i++) {


            Art typDerKarte = i < 20 ? Art.MONSTER : Art.SCHATZ;
            Karte karte = new Karte(i, typDerKarte, typDerKarte.getZufaelligesBild());
            stapel.add(karte);


            Collections.shuffle(stapel);
        }


        //System.out.println(" "+stapel.size());

        for (Karte karte : stapel) {
            System.out.println(karte);
        }


    }

    /**
     * diese methode gibt die oberste karte des stapels zurück.
     * bitte beachten, dass diese karte dabei aus dem stapel entfernt wird.
     * @return eine {@link logik.Karte}
     */
    public Karte getObersteKarte() {
        Karte remove = stapel.remove(0);
        return remove;
    }



}







