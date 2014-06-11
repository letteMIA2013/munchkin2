package gui;import javax.swing.*;
import java.awt.*;
public class MeinLabel extends JLabel{

    public MeinLabel(){
        setBackground (Color.BLACK);
        setOpaque(true);

        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setHorizontalAlignment(JLabel.CENTER);

    }
}
