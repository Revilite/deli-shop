package com.pluralsight.delishop.userinterface.loginscreen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class ButtonContainer extends JPanel {
    ArrayList<JButton> buttons = new ArrayList<>();
    StringBuilder sb;
    String password = "12345";

    public ButtonContainer() {
        setLayout(new GridLayout(4, 3, 15, 15));
        setBackground(new Color(157, 220, 101));
        setBorder(BorderFactory.createSoftBevelBorder(2, new Color(157, 220, 101), Color.BLACK));
        setOpaque(true);

        sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            JButton button = createButton(i);
            buttons.add(button);
            add(button);
        }

        add(new JLabel());  //Adds empty space
        add(createButton(0));
    }

    private JButton createButton(int number) {
        JButton button = new JButton();
        button.setText(Integer.toString(number));
        button.setFont(new Font("Times New Roman", Font.BOLD, 86));
        button.setFocusable(false);
        button.setBackground(Color.gray);
        button.setForeground(Color.black);
        button.setBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.black));


        button.addActionListener(e -> {
            sb.append(number);
            if (sb.length() % 5 == 0 && password.equalsIgnoreCase(sb.toString())) {

            } else if (sb.length() % 5 == 0) {
                sb = new StringBuilder();  //Resets string
                new JOptionPane()

                        .showMessageDialog(null, "Incorrect Password, Please enter again", "Incorrect Password", JOptionPane.WARNING_MESSAGE); // Adds popup to reenter the
            }

        });

        return button;
    }


}
