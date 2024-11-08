package com.pluralsight.delishop.userinterface.loginscreen;

import javax.swing.*;
import java.awt.*;

public class Heading extends JLabel {

    public Heading() {
        setText("Enter 5-Digit Employee Password");
        setFont(new Font(null, Font.BOLD, 100));
        setForeground(Color.BLACK);
        setHorizontalAlignment(CENTER);
    }
}
