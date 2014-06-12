package logik;

public class Regeln implements SpielInfo{


    public  Regeln(){



            new Klasse();


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








