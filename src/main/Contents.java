package main;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

import static main.RandomNumbers.getRandomNumbers;

public class Contents{

    static JLabel label = new JLabel();

    static JTextField textField;


    static JPanel panel1 = new JPanel();

    static JPanel panel2 = new JPanel();

    static JPanel panel3 = new JPanel();


    static Font myFontTitle = new Font("Ink Free", Font.BOLD, 40);

    static Font myFontTextField = new Font("Ink Free", Font.BOLD, 30);



    static JButton plusButton = new JButton("+");
    static JButton minusButton = new JButton("-");
    static JButton divideButton = new JButton("/");
    static JButton multiplyButton = new JButton("*");

    static JButton retry = new JButton("Retry");

    static JButton nextSequence = new JButton("Next Sequence");

    static  JButton randomNumber1;
    static JButton randomNumber2;
    static JButton randomNumber3;
    static JButton randomNumber4;


    static int indexOfList = 0;



    public Contents(){

        label.setText("24 Game");
        label.setFont(myFontTitle);
        label.setBounds(180, 50, 250, 50);


        panel1.setLayout(new GridLayout(1, 2, 10, 10));
        panel1.setBounds(150, 180, 300, 50);
        panel1.add(nextSequence);
        panel1.add(retry);


        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divideButton.setEnabled(false);


        panel2.setLayout(new GridLayout(1, 4, 10, 10));
        panel2.setBounds(100, 280, 400, 70);
        panel2.add(plusButton);
        panel2.add(minusButton);
        panel2.add(multiplyButton);
        panel2.add(divideButton);


        panel3.setLayout(new GridLayout(1, 4, 10, 10));
        panel3.setBounds(100, 380, 400, 70);
        RandomNumbers rn = new RandomNumbers();
        randomNumber1 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(0).intValue()));
        randomNumber2 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(1).intValue()));
        randomNumber3 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(2).intValue()));
        randomNumber4 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(3).intValue()));
        panel3.add(randomNumber1);
        panel3.add(randomNumber2);
        panel3.add(randomNumber3);
        panel3.add(randomNumber4);



        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(100, 480, 400, 80);
        textField.setFont(myFontTextField);
        textField.setEditable(false);
        textField.setVisible(true);









    }




}
