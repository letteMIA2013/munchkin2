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
        textField.setForeground(new Color(139,69,19));
        textField.setBackground(new Color(222, 184, 135));
        textField.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        final JTextField textField1 = new JTextField();
        textField1.setForeground(new Color(139,69,19));
        textField1.setBackground(new Color(222, 184, 135));
        textField1.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));

        MeinButton button = new MeinButton();
        button.setText("OK");
        button.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Startseite(textField.getText(),textField1.getText());
                setVisible(false);
            }
        };
        button.addActionListener(listener);
        JLabel label = new JLabel();
        label.setText("Spieler 1:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(139,69,19));
        label.setBackground(new Color(222, 184, 135));
        label.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        add(label);
        add(textField);
        JLabel label1 = new JLabel();
        label1.setText("Spieler 2:");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(new Color(139,69,19));
        label1.setBackground(new Color(222, 184, 135));
        label1.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        label.setOpaque(true);
        label1.setOpaque(true);
        setBackground(new Color(222,200,145));
        add(label1);
        add(textField1);
        add(button);
        setVisible(true);
    }
}
