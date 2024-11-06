package com.pluralsight.delishop.userinterface.frame;

import javax.swing.*;
import java.awt.*;

public class Heading extends JLabel {

    public Heading() {
        setLayout(null);
        setText("Testing if this works");
        setFont(new Font(null, Font.BOLD, 82));
        setBorder(BorderFactory.createEtchedBorder());
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(BOTTOM);
        setForeground(Color.BLACK);

        setBackground(Color.gray);
        setOpaque(true);

        setPreferredSize(new Dimension(1920, 200));


    }
}
