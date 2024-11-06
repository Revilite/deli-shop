package com.pluralsight.delishop.userinterface.frame;


import javax.swing.*;
import java.awt.*;

//Start of the process
public class UserPassScreen extends JFrame {


    public UserPassScreen() {
        setSize(1920, 1080);  //Sets the window size
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));  //Sets the
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Able to exit program with the exit button
        setLocationRelativeTo(null); //Sets the window to open in the center
        setTitle("Please log in :D");


        getContentPane().setBackground(new Color(157, 220, 101));

        add(new Heading());
        add(new ButtonContainer());

        setVisible(true); // Shows the window
    }
}
