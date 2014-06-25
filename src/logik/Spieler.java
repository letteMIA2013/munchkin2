package logik;

        import java.util.ArrayList;




public class Spieler {

    private int staerke, level;
    private  String name;
    ArrayList<Karte> inventar, hand;

    public Spieler() {

        hand = new ArrayList<Karte>();
        inventar = new ArrayList<Karte>();
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

    public Spieler(String name) {
        this.name = name;
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

}
