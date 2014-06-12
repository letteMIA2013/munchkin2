package gui;

import logik.SpielInfo;
import logik.Spieler;

import javax.swing.*;
import java.awt.*;

public class Oberflaeche extends JFrame {

    private final SpielInfo spielInfo;

    public Oberflaeche(SpielInfo info) {
        setSize(900, 900);

        spielInfo = info;



        Charakterblatt charakterBlatt = new Charakterblatt(this);
        add(charakterBlatt, BorderLayout.NORTH);

        setVisible(true);

    }

    public SpielInfo getSpielInfo() {
        return spielInfo;
    }

    @Override
    public String getTitle() {
        return spielInfo.istSpielerEinsDran()? spielInfo.getSpielerEins().getName(): spielInfo.getSpielerZwei().getName();
    }
}
