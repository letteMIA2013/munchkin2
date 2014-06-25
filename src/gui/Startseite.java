package gui;
import gui.bilder.BildBauer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startseite extends JFrame {
    private int Geheimcode;
    public Startseite(/*int pin*/final String spielerName1,String spielerArt1, final String spielerName2, String spielerArt2) {
        setSize(300,300);
        setTitle("Menü");
        //if (pin != 111){
        //    JOptionPane.showMessageDialog(null,"Falsches Passwort!");
        //    return;
        //}

        //Bild bild = new Bild();
        //ImageIcon icon = bild.createImageIcon("Startseite.jpg");
        //setIconImage(icon.getImage());



        MeinButton startButton = new MeinButton();
        startButton.setText("Start");
        startButton.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        //MeinButton optionButton = new MeinButton();
        //optionButton.setText("Optionen");
        //optionButton.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        MeinButton endeButton = new MeinButton();
        endeButton.setText("Ende");
        endeButton.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));

        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent huhu){
                setVisible(false);
                Oberflaeche oberflaeche = new Oberflaeche(new DummySpielInfo(spielerName1, spielerName2));

            }
        };
        startButton.addActionListener(listener);

        ActionListener listener1 = new ActionListener(){
            public void actionPerformed(ActionEvent huhu){
                setVisible(false);

            }
        };
        endeButton.addActionListener(listener1);

        JPanel panel = new JPanel();
        JPanel l = new JPanel();


        panel.setLayout(new GridLayout(3, 1));
        //setLayout(new BorderLayout());



        panel.add(startButton);
        //panel.add(optionButton);
        panel.add(endeButton);

        BildBauer bild1 = new BildBauer();
        ImageIcon icon1 = bild1.createImageIcon("Startseite.jpg");
        setIconImage(icon1.getImage());
        setIcon(icon1);

        //Geheimcode = pin;

        //add(panel,BorderLayout.CENTER);
        add(panel);

        setVisible(true);
    }

    private void setIcon(ImageIcon icon1) {
    }

    public int getGeheimcode() {
        return Geheimcode;
    }
}
