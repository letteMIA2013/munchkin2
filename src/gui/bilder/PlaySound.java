package gui.bilder;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
// Created by Bundesmann on 05.06.14.

public class PlaySound {
    public static void playSound(String soundFileName) {
        final JFXPanel fxPanel = new JFXPanel();
        String source = new File("H:/alles/Java(Programmieren)/munchkin/src/gui/bilder/" + soundFileName).toURI().toString();
        Media media = null;
        media = new Media(source);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}