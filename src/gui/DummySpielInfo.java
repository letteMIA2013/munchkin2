package gui;

import logik.*;

import java.util.ArrayList;

/**
 * Created by Bundesmann on 11.06.14.
 */
public class DummySpielInfo implements SpielInfo {

    private final Spieler sp1;
    private final Spieler sp2;
    private boolean istSp1Dran;

    public DummySpielInfo(String spielerName1, String spielerName2) {

        sp1 = new Spieler(spielerName1){
            @Override
            public int getStaerke() {
                return 6;
            }

            @Override
            public int getLevel() {
                return 2;
            }
        };

        sp2 = new Spieler(spielerName2){
            @Override
            public int getStaerke() {
                return 10;
            }

            @Override
            public int getLevel() {
                return 4;
            }

           /* @Override
            public ArrayList<Karte> getHand() {
                ArrayList<Karte> kartes = new ArrayList<Karte>();
                kartes.add(new Karte(5, Art.MONSTER));
                return kartes;
            }*/

            @Override
            public ArrayList<Karte> getInventar() {
                ArrayList<Karte> kartes = new ArrayList<Karte>();
                kartes.add(new Karte(0, Art.SCHATZ));
                kartes.add(new Karte(0, Art.SCHATZ));
                return kartes;
            }
        };
    }

    @Override
    public Spieler getSpielerEins() {
        return sp1;
    }

    @Override
    public Spieler getSpielerZwei() {
        return sp2;
    }

    @Override
    public boolean istSpielerEinsDran() {
        return istSp1Dran;
    }

    @Override
    public Kartenstapel getKartenstapel() {
        return null;
    }

    @Override
    public void wechselAktuellenSpieler() {
        istSp1Dran = !istSp1Dran;
    }
    public Spieler getAktuellerSpieler(){
        return null;
    }



    public Karte raumPluendern(){
        return  null;
    }

}
