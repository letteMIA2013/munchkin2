package gui;

import logik.Kartenstapel;
import logik.SpielInfo;
import logik.Spieler;

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
}
