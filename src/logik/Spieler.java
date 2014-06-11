package logik;

import java.util.ArrayList;

/**
 * Created by e3_dittmer on 11.06.14.
 */
public class Spieler {

    private int staerke, level;
    ArrayList<Karte> inventar, hand;


    public ArrayList<Karte> getHand() {
        return hand;
    }

    public ArrayList<Karte> getInventar(){
        return null;
    }

    public int getStaerke() {
        return staerke;
    }

    public int getLevel() {
        return level;
    }
}
