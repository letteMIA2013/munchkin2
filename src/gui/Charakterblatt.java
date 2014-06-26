package gui;

import logik.Karte;
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

        erstelleFuenfInventarFelder(0);

        add(new JLabel());
        add(new MeinLabel(){
            @Override
            public String getText() {
                return "Stärke: " + oberflaeche.getSpielInfo().getAktuellerSpieler().getStaerke();
            }
        });
        add(new MeinLabel(){
            @Override
            public String getText() {
                return "Lvl: " + oberflaeche.getSpielInfo().getAktuellerSpieler().getLevel();
            }
        });

        erstelleFuenfInventarFelder(5);

        add(new JLabel());
        JButton endeButton =new JButton("Ende des Zuges");
        endeButton.setForeground(new Color(139, 69, 19));
        endeButton.setBackground(new Color(222, 184, 135));
        endeButton.setOpaque(true);
        endeButton.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
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
        menueButton.setForeground(new Color(139,69,19));
        menueButton.setBackground(new Color(222, 184, 135));
        menueButton.setOpaque(true);
        menueButton.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oberflaeche.setVisible(false);
               // Startseite startseite = new Startseite(null, null);
            }
        };
        add(menueButton);
        menueButton.addActionListener(listener);

        setBackground(new Color(222,200,145));

    }




        //TODO auf dem Feld sind 10 Felder, wir wollten nur 5 große.

    private void erstelleFuenfInventarFelder(int startIndex) {
        for(int i=0; i < 5; i++){
            InventarFeld feld = new InventarFeld(startIndex);
            add(feld);
            inventarFelder.add(feld);
            startIndex++;
        }
    }


    private class InventarFeld extends JPanel{

        private final JLabel leeresFeld;
        private final int index;
        private final JLabel vollesFeld;

        private InventarFeld(int index) {

            this.index = index;

            leeresFeld = new JLabel("" + index);
            leeresFeld.setBackground(new Color(222, 184, 135));
            leeresFeld.setOpaque(true);
            leeresFeld.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
            leeresFeld.setPreferredSize(new Dimension(100, 100));

            vollesFeld = new JLabel();


        }

        @Override
        public void paint(Graphics g) {
            ArrayList<Karte> inventar = oberflaeche.getSpielInfo().getAktuellerSpieler().getInventar();
            removeAll();

            if (inventar == null || inventar.size() <= index){
                add(leeresFeld);
            }
            else{
                Karte karte = inventar.get(index);
                vollesFeld.setIcon(karte.getBild());
                add(vollesFeld);

            }
            super.paint(g);
        }
    }

}
