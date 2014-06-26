package gui;

import logik.Hand;
import logik.SpielInfo;
import logik.Spieler;

import javax.swing.*;
import java.awt.*;

// Created by Bundesmann on 05.06.14.

public class Oberflaeche extends JFrame {

    private final SpielInfo spielInfo;

    public Oberflaeche(SpielInfo info) {
        setSize(900, 900);
        setTitle("Munchkin");
        spielInfo = info;

        //setBackground(new Color(222,200,145));

        Charakterblatt charakterBlatt = new Charakterblatt(this);

        JLabel label = new JLabel();
        label.setBackground(new Color(222,200,145));
        label.setOpaque(true);



        add(charakterBlatt, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);

        setVisible(true);

    }

    public SpielInfo getSpielInfo() {
        return spielInfo;
    }

    @Override
    public String getTitle() {
        return spielInfo.getAktuellerSpieler().getName() + ", Klasse:  " +  spielInfo.getAktuellerSpieler().getKlasse();
    }
}
