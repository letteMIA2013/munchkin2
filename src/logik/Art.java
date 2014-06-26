package logik;

import gui.bilder.BildBauer;

import javax.swing.*;
import java.util.Random;

public enum Art {




    MONSTER("monster", new String[]{"Bekiffter-Golem-", "Freundschaftstrank-", "Käpt-Blubber-", "Netz-Troll-", "Schlafender-Troll-",
    "Werschildkroete-","Zwerg-", "Halbling-" , "Zauberer-"}),

    SCHATZ ("schatz", new String[]{"Abschlachtendes-Schwert-","Helm_der_Peripherensicht-","Stahlrüstung-", "Lederrüstung-", "Stiefel-","Schleimige_Rüstung-"});

    private final String[] bilderNamen;
    private final String verzeichnis;


    Art(String verzeichnis, String[] bilderNamen){

        this.verzeichnis = verzeichnis;
        this.bilderNamen = bilderNamen;


    }

    public ImageIcon getZufaelligesBild(){
        String name = bilderNamen[new Random().nextInt(bilderNamen.length - 1)];
        return new BildBauer().createImageIcon(verzeichnis + "/" + name + ".png");
    }

    public String getZufaelligerName(){
        return bilderNamen[new Random().nextInt(bilderNamen.length - 1)];
    }
}
