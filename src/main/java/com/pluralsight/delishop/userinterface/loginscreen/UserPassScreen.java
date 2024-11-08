package com.pluralsight.delishop.userinterface.loginscreen;


import javax.swing.*;
import java.awt.*;

//Start of the process
public class UserPassScreen extends JFrame {


    public UserPassScreen() {
        setLayout(new BorderLayout());


        JPanel[] padding = new JPanel[4];
        for (int i = 0; i < padding.length; i++) {
            padding[i] = new JPanel();
            padding[i].setPreferredSize(new Dimension(50, 50));
            padding[i].setBackground(new Color(42, 86, 28));
        }

        add(padding[0], BorderLayout.NORTH);
        add(padding[1], BorderLayout.SOUTH);
        add(padding[2], BorderLayout.EAST);
        add(padding[3], BorderLayout.WEST);
        add(new InfoContainer(), BorderLayout.CENTER);


        setSize(1920, 1080);  //Sets the window size*
        setResizable(false);
        setTitle("Please log in :D");

        setLocationRelativeTo(null); //Sets the window to open in the center
        setVisible(true); // Shows the window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Able to exit program with the exit button


    }
}
