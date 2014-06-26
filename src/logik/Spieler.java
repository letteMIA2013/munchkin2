package logik;

        import java.util.ArrayList;


/**
 * Created by Steven, Luca und Raphael
 *
 */
public class Spieler {

    private int staerke, level;
    private  String name;
    private Klasse klasse;
    ArrayList<Karte> inventar, hand;



    public Spieler(String name, Klasse klasse) {
        hand = new ArrayList<Karte>();
        inventar = new ArrayList<Karte>();
        this.name = name;
        this.klasse = klasse;
    }

    public void gibKarte(Karte k){
        hand.add(k);
    }

    public ArrayList<Karte> getInventar() {
        return inventar;
    }

    public ArrayList<Karte> getHand(ArrayList<Karte> hand) {

        return hand;
    }



    public int getStaerke() {
        return staerke;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Klasse getKlasse() {
        return klasse;
    }
}
