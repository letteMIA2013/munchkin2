package gui;

import logik.Klasse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Bundesmann on 12.06.14.
 */
public class Namenbildschrim extends JFrame{

    private final String DEFAULT_NAME = "- your name here";

    public Namenbildschrim() {
        setSize(300,300);
        setTitle("Name und Charakter des Spielers");
        setLayout(new GridLayout(7,1,2,2));
        final JTextField textField = new JTextField(DEFAULT_NAME);
        textField.setForeground(new Color(139,69,19));
        textField.setBackground(new Color(222, 200, 160));
        textField.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        final JTextField textField1 = new JTextField(DEFAULT_NAME);
        textField1.setForeground(new Color(139,69,19));
        textField1.setBackground(new Color(222, 200, 160));
        textField1.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField.getText().equals(DEFAULT_NAME)){
                    textField.setText("");
                }
            }
        });

        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField1.getText().equals(DEFAULT_NAME)){
                    textField1.setText("");
                }
            }
        });

        final JComboBox comboBox = new JComboBox(Klasse.values());
        final JComboBox comboBox1 = new JComboBox(Klasse.values());

        MeinButton button = new MeinButton();
        button.setText("OK");
        button.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Startseite(textField.getText(),(Klasse)comboBox.getSelectedItem(), textField1.getText(), (Klasse)comboBox1.getSelectedItem());
                setVisible(false);
            }
        };
        button.addActionListener(listener);
        JLabel label = new JLabel();
        label.setText("Spieler 1:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(139, 69, 19));
        label.setBackground(new Color(222, 184, 135));
        label.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        add(label);
        add(textField);
        add(comboBox);
        JLabel label1 = new JLabel();
        label1.setText("Spieler 2:");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(new Color(139, 69, 19));
        label1.setBackground(new Color(222, 184, 135));
        label1.setBorder(BorderFactory.createLineBorder(new Color(139, 69, 19), 2));
        label.setOpaque(true);
        label1.setOpaque(true);
        setBackground(new Color(222, 200, 145));
        add(label1);
        add(textField1);
        add(comboBox1);
        add(button);
        setVisible(true);
    }
}
