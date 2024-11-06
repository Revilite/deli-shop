package com.pluralsight.delishop.userinterface.frame;


import javax.swing.*;
import java.awt.*;

//Start of the process
public class UserPassScreen extends JFrame {




    public UserPassScreen() {


        setSize(1920, 1080);  //Sets the window size
        setLocationRelativeTo(null); //Sets the window to open in the center
        setLayout(null);  //Sets the layout a free layout
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Able to exit program with the exit button
        setVisible(true); // Shows the window
        setTitle("Please log in :D");
        getContentPane().setBackground(new Color(157, 220, 101));


        setBackground(Color.lightGray);


    }
}
