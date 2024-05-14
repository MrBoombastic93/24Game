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


    static Font myFont = new Font("Ink Free", Font.BOLD, 40);




    static JButton plusButton = new JButton("+");
    static JButton minusButton = new JButton("-");
    static JButton divideButton = new JButton("/");
    static JButton multiplyButton = new JButton("*");

    static JButton clear = new JButton("Clear");

    static JButton nextSequence = new JButton("Next Sequence");

    static  JButton randomNumber1;
    static JButton randomNumber2;
    static JButton randomNumber3;
    static JButton randomNumber4;

    static JButton equal;

    static int indexOfList = 0;



    public Contents(){

        label.setText("Jogo do 24");
        label.setFont(myFont);
        label.setBounds(180, 50, 250, 50);


        panel1.setBounds(100, 150, 300, 80);
        panel1.add(nextSequence);


        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divideButton.setEnabled(false);


        panel2.setLayout(new GridLayout(1, 4, 10, 10));
        panel2.setBounds(100, 250, 400, 70);
        panel2.add(plusButton);
        panel2.add(minusButton);
        panel2.add(multiplyButton);
        panel2.add(divideButton);
        panel2.add(clear);


        panel3.setLayout(new GridLayout(1, 5, 10, 10));
        panel3.setBounds(100, 350, 400, 70);
        RandomNumbers rn = new RandomNumbers();
        randomNumber1 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(0).intValue()));
        randomNumber2 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(1).intValue()));
        randomNumber3 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(2).intValue()));
        randomNumber4 = new JButton(String.valueOf(getRandomNumbers().get(indexOfList).get(3).intValue()));
        equal = new JButton("=");
        panel3.add(randomNumber1);
        panel3.add(randomNumber2);
        panel3.add(randomNumber3);
        panel3.add(randomNumber4);
        panel3.add(equal);



        textField = new JTextField();
        textField.setBounds(100, 450, 400, 80);
        textField.setFont(myFont);
        textField.setEditable(false);
        textField.setVisible(true);









    }




}
