package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.Contents.*;
import static main.RandomNumbers.getRandomNumbers;
import static main.GameFrame.*;

public class Action implements ActionListener {


    static double num = 0;

    static double result = 0;
    static int numbersToUse = 4;

    static char operator;

    Action() {
        randomNumber1.addActionListener(this);
        randomNumber2.addActionListener(this);
        randomNumber3.addActionListener(this);
        randomNumber4.addActionListener(this);

        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        divideButton.addActionListener(this);
        multiplyButton.addActionListener(this);

        retry.addActionListener(this);
        nextSequence.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == randomNumber1) {
            textField.setText("");

            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            multiplyButton.setEnabled(true);
            divideButton.setEnabled(true);

            randomNumber1.setEnabled(false);
            numbersToUse--;
            if (result == 0) {
                textField.setText(textField.getText().concat("" + getRandomNumbers().get(indexOfList).get(0).intValue()));
                result = Double.valueOf(textField.getText());
            } else {
                num = getRandomNumbers().get(indexOfList).get(0).intValue();
                switch (operator) {
                    case '+' -> result += num;
                    case '-' -> result -= num;
                    case '*' -> result *= num;
                    case '/' -> result /= num;
                }
                textField.setText(String.valueOf((int)result));
            }
            if (result == 24 && numbersToUse == 0) {
                textField.setText((int)result + "! Got it!");
            } else if(numbersToUse == 0) {
                textField.setText((int)result + "... you missed, try again!");
            }
        }

        if (e.getSource() == randomNumber2) {
            textField.setText("");

            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            multiplyButton.setEnabled(true);
            divideButton.setEnabled(true);

            randomNumber2.setEnabled(false);
            numbersToUse--;
            if (result == 0) {
                textField.setText(textField.getText().concat("" + getRandomNumbers().get(indexOfList).get(1).intValue()));
                result = Double.valueOf(textField.getText());
            } else {
                num = getRandomNumbers().get(indexOfList).get(1).intValue();
                switch (operator) {
                    case '+' -> result += num;
                    case '-' -> result -= num;
                    case '*' -> result *= num;
                    case '/' -> result /= num;
                }
                textField.setText(String.valueOf((int)result));
            }
            if (result == 24 && numbersToUse == 0) {
                textField.setText((int)result + "! Got it!");
            } else if(numbersToUse == 0) {
                textField.setText((int)result + "... you missed, try again!");
            }
        }

        if (e.getSource() == randomNumber3) {
            textField.setText("");

            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            multiplyButton.setEnabled(true);
            divideButton.setEnabled(true);

            randomNumber3.setEnabled(false);
            numbersToUse--;
            if (result == 0) {
                textField.setText(textField.getText().concat("" + getRandomNumbers().get(indexOfList).get(2).intValue()));
                result = Double.valueOf(textField.getText());
            } else {
                num = getRandomNumbers().get(indexOfList).get(2).intValue();
                switch (operator) {
                    case '+' -> result += num;
                    case '-' -> result -= num;
                    case '*' -> result *= num;
                    case '/' -> result /= num;
                }
                textField.setText(String.valueOf((int)result));
            }
            if (result == 24 && numbersToUse == 0) {
                textField.setText((int)result + "! Got it!");
            } else if(numbersToUse == 0) {
                textField.setText((int)result + "... you missed, try again!");
            }
        }

        if (e.getSource() == randomNumber4) {
            textField.setText("");

            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            multiplyButton.setEnabled(true);
            divideButton.setEnabled(true);

            randomNumber4.setEnabled(false);
            numbersToUse--;
            if (result == 0) {
                textField.setText(textField.getText().concat("" + getRandomNumbers().get(indexOfList).get(3).intValue()));
                result = Double.valueOf(textField.getText());
            } else {
                num = getRandomNumbers().get(indexOfList).get(3).intValue();
                switch (operator) {
                    case '+' -> result += num;
                    case '-' -> result -= num;
                    case '*' -> result *= num;
                    case '/' -> result /= num;
                }
                textField.setText(String.valueOf((int)result));
            }
            if (result == 24 && numbersToUse == 0) {
                textField.setText((int)result + "! Got it!");
            } else if(numbersToUse == 0) {
                textField.setText((int)result + "... you missed, try again!");
            }
        }

        if (e.getSource() == plusButton) {

            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            multiplyButton.setEnabled(false);
            divideButton.setEnabled(false);

            textField.setText(textField.getText().concat("-"));
            textField.setText("");
            operator = '+';

        }


        if (e.getSource() == minusButton) {


            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            multiplyButton.setEnabled(false);
            divideButton.setEnabled(false);

            textField.setText(textField.getText().concat("+"));
            textField.setText("");
            operator = '-';
        }


        if (e.getSource() == multiplyButton) {

            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            multiplyButton.setEnabled(false);
            divideButton.setEnabled(false);

            textField.setText(textField.getText().concat("*"));
            textField.setText("");
            operator = '*';
        }


        if (e.getSource() == divideButton) {

            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            multiplyButton.setEnabled(false);
            divideButton.setEnabled(false);

            textField.setText(textField.getText().concat("/"));
            textField.setText("");
            operator = '/';
        }



            if (e.getSource() == retry) {
                textField.setText("0");
                randomNumber1.setEnabled(true);
                randomNumber2.setEnabled(true);
                randomNumber3.setEnabled(true);
                randomNumber4.setEnabled(true);
                result = 0;
                numbersToUse = 4;
            }

            if(e.getSource() == nextSequence){
                ++indexOfList;
                randomNumber1.setText(String.valueOf(getRandomNumbers().get(indexOfList).get(0).intValue()));
                randomNumber2.setText(String.valueOf(getRandomNumbers().get(indexOfList).get(1).intValue()));
                randomNumber3.setText(String.valueOf(getRandomNumbers().get(indexOfList).get(2).intValue()));
                randomNumber4 .setText(String.valueOf(getRandomNumbers().get(indexOfList).get(3).intValue()));

                randomNumber1.setEnabled(true);
                randomNumber2.setEnabled(true);
                randomNumber3.setEnabled(true);
                randomNumber4.setEnabled(true);

                result = 0;
                num = 0;
                textField.setText("0");
                numbersToUse = 4;
            }

        }
    }

