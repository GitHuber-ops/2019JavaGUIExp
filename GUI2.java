package com.company;

import javax.swing.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GUI2 {
    public static void main(String[] args) {
        Frame f=new Frame("Menu");
        f.setSize(500,250);
        f.setLocation(1000,500);
        f.setLayout(new FlowLayout());
        Button b=new Button("I am button.");
        f.add(b);
        f.addWindowListener(new MyWin());
        f.setVisible(true);
        System.out.println("Hello world!");
    }
}

class MyWin extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing"+e.toString());
        System.out.println("我关了");
        System.exit(0);
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("我活了");
        super.windowActivated(e);
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("我开了");
        super.windowOpened(e);
    }

    public static void setButton(){
        JFrame frame;
        JButton button1, button2, button3, button4;

        frame = new JFrame("Flow Layout");
        frame.setLayout(new FlowLayout());
        button1 = new JButton("Ok");
        button2 = new JButton("Open");
        button3 = new JButton("Close");
        button4 = new JButton("网络程序设计");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.pack();
        frame.setVisible(true);
    }
}
