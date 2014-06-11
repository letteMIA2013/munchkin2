package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startseite extends JFrame {
    private int Geheimcode;
    public Startseite(int pin) {
        setSize(300,300);

        if (pin != 111){
            JOptionPane.showMessageDialog(null,"Falsches Passwort!");
            return;
        }

        //Bild bild = new Bild();
        //ImageIcon icon = bild.createImageIcon("Startseite.jpg");
        //setIconImage(icon.getImage());


        MeinButton fortfahrButton = new MeinButton();
        fortfahrButton.setText("Fortfahren");
        MeinButton startButton = new MeinButton();
        startButton.setText("Start");
        MeinButton optionButton = new MeinButton();
        optionButton.setText("Optionen");
        MeinButton endeButton = new MeinButton();
        endeButton.setText("Ende");

        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent huhu){
                setVisible(false);
                Oberflaeche oberflaeche = new Oberflaeche();

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


        panel.setLayout(new GridLayout(4, 1));
        //setLayout(new BorderLayout());


        panel.add(fortfahrButton);
        panel.add(startButton);
        panel.add(optionButton);
        panel.add(endeButton);

        Bild bild1 = new Bild();
        ImageIcon icon1 = bild1.createImageIcon("Startseite.jpg");
        setIconImage(icon1.getImage());
        setIcon(icon1);

        Geheimcode = pin;

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
