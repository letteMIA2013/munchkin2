package logik;

public class Regeln implements SpielInfo{




    private Kartenstapel kartenstapel;
    private Spieler spieler1;
    private Spieler spieler2;
    private Karte monsterKarte;
    private Karte gewonneneKarte;

    private boolean spielerEinsDran;



    public  Regeln(String spielerName1, Klasse spielerKlasse1, String spielerName2, Klasse spielerKlasse2){




            // kartenstapel erstellen
        Kartenstapel kartenstapel = new Kartenstapel();

        // beide spieler erstellen

         spieler1 = new Spieler(spielerName1, spielerKlasse1);
         spieler2 = new Spieler(spielerName2, spielerKlasse2);

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

    /**
     *  Wenn monsterstärke größer als die vom Spieler = levelverlust
     *  Ansonsten bekommt der spieler eine Karte
     */
    public void kampf(){

       if(monsterKarte.getWert() < getAktuellerSpieler().getStaerke()){

           gewonneneKarte = kartenstapel.getObersteKarte();
           getAktuellerSpieler();
           if (spielerEinsDran == true){

               spieler1.gibKarte(gewonneneKarte);

           }
           else{
               spieler2.gibKarte(gewonneneKarte);
           }


       }
        else {

        getAktuellerSpieler().setLevel(getAktuellerSpieler().getLevel() - 1);



       }

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
     * Diese Methode sollte aufgerufen werden, wenn der {@link logik.Spieler} einem Monster weglaufen will...
     * @param zahl dieser Wert stellt den Wurf dar, den der Speieler zum weglaufen gemacht hat,.
     * @return true, falls das weglaufen erforgreich ist, ansosnten false (Spieler verliert automatisch eine Stufe)
     */
    public boolean weglaufen(int zahl){
        if (zahl < 5){
            getAktuellerSpieler().setLevel(getAktuellerSpieler().getLevel() - 1);
            return false;
        }
        return true;
    }
}








