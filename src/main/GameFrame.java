package main;

import javax.swing.*;
import java.awt.*;

import static main.Contents.*;

public class GameFrame {

    static JFrame frame;


    public GameFrame() {

        frame = new JFrame("Jogo do 24");
        frame.setSize(600, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        frame.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(textField);
        frame.setVisible(true);

    }

}
