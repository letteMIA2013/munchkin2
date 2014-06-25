package logik;

import javax.swing.*;
import java.awt.*;

public class Klasse {


    public Klasse() {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JPanel klasse = new JPanel(new BorderLayout());
        JButton krieger = new JButton("krieger");
        JButton dieb = new JButton("dieb");


        frame.add(klasse);
        klasse.add(krieger, BorderLayout.WEST);
        klasse.add(dieb, BorderLayout.EAST);

        frame.setVisible(true);


    }

    public boolean istDieb(){
        return true;
    }


}
