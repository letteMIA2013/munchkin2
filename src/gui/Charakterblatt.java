package gui;import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Created by Bundesmann on 05.06.14.

public class Charakterblatt extends JPanel {


    private final ArrayList<InventarFeld> inventarFelder;

    public Charakterblatt(final Oberflaeche oberflaeche) {

        inventarFelder = new ArrayList<InventarFeld>();

        setLayout(new GridLayout(2, 8, 3, 3));

        erstelleFuenfInventarFelder();

        add(new JLabel());
        add(new JLabel("Stärke: "));
        add(new JLabel("Lvl: "));

        erstelleFuenfInventarFelder();

        add(new JLabel());
        add(new JButton("Ende"));
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oberflaeche.setVisible(false);
                Startseite startseite = new Startseite(111);
            }
        };
        JButton pauseButton = new JButton("Pause");
        add(pauseButton);
        pauseButton.addActionListener(listener);


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
