package com.pluralsight.delishop.userinterface.loginscreen;

import javax.swing.*;
import java.awt.*;

public class InfoContainer extends JPanel {
    public InfoContainer() {
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);

        Heading heading = new Heading();
        add(heading, BorderLayout.NORTH);
        add(new ButtonContainer(), BorderLayout.CENTER);

    }
}
