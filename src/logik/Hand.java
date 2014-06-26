package logik;

import gui.Oberflaeche;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Hand extends JPanel {




    public Hand() {



            JPanel Hand1 = new JPanel(new BorderLayout());
            JPanel Hand2 = new JPanel(new BorderLayout());

            JLabel hand1label1 = new JLabel();
            JLabel hand1label2 = new JLabel();
            JLabel hand1label3 = new JLabel();
            JLabel hand1label4 = new JLabel();
            JLabel hand1label5 = new JLabel();

            JLabel hand2label1 = new JLabel();
            JLabel hand2label2 = new JLabel();
            JLabel hand2label3 = new JLabel();
            JLabel hand2label4 = new JLabel();
            JLabel hand2label5 = new JLabel();


            Hand1.add(hand1label1);
            Hand1.add(hand1label2);
            Hand1.add(hand1label3);
            Hand1.add(hand1label4);
            Hand1.add(hand1label5);

            Hand2.add(hand2label1);
            Hand2.add(hand2label2);
            Hand2.add(hand2label3);
            Hand2.add(hand2label4);
            Hand2.add(hand2label5);




            //Hand1.setVisible(false);
            //Hand2.setVisible(false);



        }











}
