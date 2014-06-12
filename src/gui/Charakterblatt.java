package gui;

import logik.SpielInfo;
import logik.Spieler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Created by Bundesmann on 05.06.14.

public class Charakterblatt extends JPanel {


    private final ArrayList<InventarFeld> inventarFelder;
    private final Oberflaeche oberflaeche;

    public Charakterblatt(final Oberflaeche oberflaeche) {

        this.oberflaeche = oberflaeche;

        inventarFelder = new ArrayList<InventarFeld>();

        setLayout(new GridLayout(2, 8, 3, 3));

        erstelleFuenfInventarFelder();

        add(new JLabel());
        add(new MeinLabel(){
            @Override
            public String getText() {
                return "Stärke: " + getAktuellerSpieler().getStaerke();
            }
        });
        add(new MeinLabel(){
            @Override
            public String getText() {
                return "Lvl: " + getAktuellerSpieler().getLevel();
            }
        });

        erstelleFuenfInventarFelder();

        add(new JLabel());
        JButton endeButton =new JButton("Ende des Zuges");
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oberflaeche.getSpielInfo().wechselAktuellenSpieler();
                oberflaeche.repaint();
                oberflaeche.setTitle(oberflaeche.getTitle());
            }
        };
        endeButton.addActionListener(listener1);
        add(endeButton);

        JButton menueButton = new JButton("Menü");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oberflaeche.setVisible(false);
                Startseite startseite = new Startseite(null, null);
            }
        };
        add(menueButton);
        menueButton.addActionListener(listener);


    }



    private Spieler getAktuellerSpieler(){
        SpielInfo spielInfo = oberflaeche.getSpielInfo();
        return spielInfo.istSpielerEinsDran()? spielInfo.getSpielerEins(): spielInfo.getSpielerZwei();
    }
        //TODO auf dem Feld sind 10 Felder, wir wollten nur 5 große.
    private void erstelleFuenfInventarFelder() {
        for(int i=0; i < 5; i++){
            InventarFeld feld = new InventarFeld();
            add(feld);
            inventarFelder.add(feld);
        }
    }


    private class InventarFeld extends JLabel{

        private InventarFeld() {
            setBackground(Color.GREEN);
            setOpaque(true);
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            setPreferredSize(new Dimension(30, 100));
        }
    }

}
