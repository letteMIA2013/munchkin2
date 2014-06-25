package logik;

public class Regeln implements SpielInfo{




    private Kartenstapel kartenstapel;
    private Spieler spieler1;
    private Spieler spieler2;
    private Karte monsterKarte;

    private boolean spielerEinsDran;



    public  Regeln(){




            // kartenstapel erstellen
        Kartenstapel kartenstapel = new Kartenstapel();

        // beide spieler erstellen

         spieler1 = new Spieler();
         spieler2 = new Spieler();

        // karten ziehen und an spieler verteilen (hand)

        for(int i = 1; i <= 5; i++){
                this.spieler2.gibKarte(kartenstapel.getObersteKarte());
                this.spieler1.gibKarte(kartenstapel.getObersteKarte());
        }
    }



    @Override
    public Spieler getSpielerEins() {
        return spieler1;
    }

    @Override
    public Spieler getSpielerZwei() {
        return spieler2;
    }

    @Override
    public boolean istSpielerEinsDran() {
        return spielerEinsDran;
    }

    @Override
    public Spieler getAktuellerSpieler(){

        return istSpielerEinsDran()? getSpielerEins(): getSpielerZwei();
    }

    public Karte tuerEintreten(){

    // TODO Türbutton, kartenstapel -> aufdeckfläche


        monsterKarte = kartenstapel.getObersteKarte();
        return monsterKarte;

    }

    @Override
    public Karte raumPluendern(){
        return kartenstapel.getObersteKarte();
    }


    @Override
    public Kartenstapel getKartenstapel() {
        return kartenstapel;
    }

    @Override
    public void wechselAktuellenSpieler() {
        spielerEinsDran = !spielerEinsDran;
    }

    /**
     * Diese Methode sollte aufgerufe werden, wenn der {@link logik.Spieler} einem Monmstr wglaufen will...
     * @param zahl dieser Wert stellt den Wurf dar, den der Speielr zum wglaufen gemacht hat,.
     * @return true, falls das weglaufen erforgreich ist, ansosnten false (Spielr verliert automatisch eine Stufe)
     */
    public boolean weglaufen(int zahl){
        if (zahl < 5){
            getAktuellerSpieler().setLevel(getAktuellerSpieler().getLevel() - 1);
            return false;
        }
        return true;
    }
}








