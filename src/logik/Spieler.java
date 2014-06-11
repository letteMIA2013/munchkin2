package logik;

import java.util.ArrayList;


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
