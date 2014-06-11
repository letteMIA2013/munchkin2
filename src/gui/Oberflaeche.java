package gui;

import javax.swing.*;
import java.awt.*;

public class Oberflaeche extends JFrame {

    public Oberflaeche() {
        setSize(900, 900);

        Charakterblatt charakterBlatt = new Charakterblatt(this);
        add(charakterBlatt, BorderLayout.NORTH);

        setVisible(true);

    }







}
