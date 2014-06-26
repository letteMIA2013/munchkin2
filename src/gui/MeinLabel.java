package gui;import javax.swing.*;
import java.awt.*;
public class MeinLabel extends JLabel{

    // Created by Bundesmann on 05.06.14.

    public MeinLabel(){
        setBackground (new Color(222,184,135));
        setOpaque(true);

        setForeground(new Color(139,69,19));
        setBorder(BorderFactory.createLineBorder(new Color(139,69,19),2));
        setHorizontalAlignment(JLabel.CENTER);

    }
}
