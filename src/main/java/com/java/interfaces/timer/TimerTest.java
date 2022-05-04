package com.java.interfaces.timer;


import javax.swing.*;

public class TimerTest {

    public static void run() {
        var listener = new TimerPrinter();

        var timer = new Timer(1000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Zamknij program");
        System.exit(0);

    }
}
