package logik;


public interface SpielInfo {


    public Spieler getSpielerEins();

    public Spieler getSpielerZwei();

    public boolean istSpielerEinsDran();

    public Spieler getAktuellerSpieler();

    public Karte raumPluendern();

    public Kartenstapel getKartenstapel();

    public void wechselAktuellenSpieler();







}
