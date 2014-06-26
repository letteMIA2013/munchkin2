package logik;

import gui.bilder.BildBauer;

import javax.swing.*;
import java.awt.*;

/**
 * // Created by Bundesmann on 05.06.14.

 */
public enum Klasse {

    Dieb ("klasse/Dieb.png"),
    Krieger ("klasse/Krieger.png");
    private final ImageIcon imageIcon;

    Klasse(String bildname) {

        BildBauer bildBauer = new BildBauer();
        imageIcon = bildBauer.createImageIcon(bildname);
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }
}
