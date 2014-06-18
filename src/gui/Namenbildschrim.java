package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bundesmann on 12.06.14.
 */
public class Namenbildschrim extends JFrame{
    public Namenbildschrim() {
        setSize(200,200);
        setTitle("Name des Spielers");
        setLayout(new GridLayout(5,1,2,2));
        final JTextField textField = new JTextField();
        final JTextField textField1 = new JTextField();
        MeinButton button = new MeinButton();
        button.setText("OK");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Startseite(textField.getText(),textField1.getText());
                setVisible(false);
            }
        };
        button.addActionListener(listener);
        add(new JLabel("Spieler 1:"));
        add(textField);
        add(new JLabel("Spieler 2:"));
        add(textField1);
        add(button);
        setVisible(true);
    }
}
