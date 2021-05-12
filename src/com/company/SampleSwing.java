package com.company;

import javax.swing.*;

public class SampleSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //Creating instance of JFrame

        JButton b = new JButton("Click Here"); //Creating instance of JButton
        b.setBounds(130, 100, 500, 40);
        f.add(b); //adding button to JFrame

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
