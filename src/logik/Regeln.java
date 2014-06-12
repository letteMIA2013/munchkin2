package logik;

public class Regeln implements SpielInfo{




    public Kartenstapel kartenstapel;
    public Spieler spieler1;
    public Spieler spieler2;
    public Karte karte;


    public  Regeln(){


        new Klasse();

            // kartenstapel erstellen
        Kartenstapel kartenstapel = new Kartenstapel();

        // beide spieler erstellen

        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();

        // karten ziehen und an spieler verteilen (hand)

            for(int i = 0; i < 5; i++){



                karte = kartenstapel.getObersteKarte();
                spieler1.gibKarte(karte);

            }


        }



    @Override
    public Spieler getSpielerEins() {
        return null;
    }

    @Override
    public Spieler getSpielerZwei() {
        return null;
    }

    @Override
    public boolean istSpielerEinsDran() {
        return false;
    }

    public void tuerEintreten(){

    // TODO Türbutton, kartenstapel -> aufdeckfläche


       /* MouseListener meinListener = new MouseAdapter(){
                public void mousePressed(MouseEvent e){


                   TODO aufdeckstapel
                   aufdecklabel.setIcon(hier karten grafik rein);



                }
                JLabel aufdecklabel = (JLabel) e.getSource();
                    icon = aufdecklabel.getIcon();
                    aufdecklabel.setIcon(null);

        */


    }


    public void aufAergerAusSein(){

    // TODO wenn Raum leer -> möglichkeit Monster auszuspielen und selber zu bekämpfen

    }


    public void raumPluendern(){


    // TODO Monster looten oder Schatzkarte

    }

    @Override
    public Kartenstapel getKartenstapel() {
        return null;
        //TODO!!!
    }

    @Override
    public void wechselAktuellenSpieler() {
    // TODO!!!
    }
}








