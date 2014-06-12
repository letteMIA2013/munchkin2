package logik;

import javax.swing.*;
import java.util.ArrayList;


public interface SpielInfo {


    public Spieler getSpielerEins();

    public Spieler getSpielerZwei();

    public boolean istSpielerEinsDran();

    public Kartenstapel getKartenstapel();

    public void wechselAktuellenSpieler();







}
