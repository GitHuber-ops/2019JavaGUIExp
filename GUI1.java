package com.company;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class GUI1 {
    private JFrame frame;
    private JButton button1, button2, button3, button4, button5;

    public void go()  {
        frame = new JFrame("Menu");
        frame.setLayout(new FlowLayout());
        button1 = new JButton("Student");
        button2 = new JButton("Teacher");
        button3 = new JButton("Academic Teacher");
        button4 = new JButton("Admin");
        button5 = new JButton("Quit");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        GUI1 gui = new GUI1 ();
        gui.go();
    }
}
