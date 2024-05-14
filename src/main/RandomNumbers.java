package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbers {

    static Character[] operators = {'+', '-', '*', '/'};

    static List<List<Double>> groupOfNumbers = new ArrayList<>();

    static Character[] exp = new Character[3];

    public static List<List<Double>> getRandomNumbers() {
        while (groupOfNumbers.size() < 60) {

            Set<List<Character>> set = new HashSet<>();

            LABEL:
            while (set.size() < 10) {

                Double[] randomNumbers = new Double[4];

                for (int i = 0; i < randomNumbers.length; i++) {
                    while (randomNumbers[i] == null) {
                        int n = (int) (Math.random() * 100) + 1;
                        if (n < 30)
                            randomNumbers[i] = (double) n;
                    }
                }


                for (int i = 0; i < operators.length; i++)
                    for (int k = 0; k < operators.length; k++)
                        for (int j = 0; j < operators.length; j++) {
                            Double result = 0.0;

                            switch (operators[i]) {
                                case '/' -> {
                                    exp[0] = '/';
                                    result = randomNumbers[0] / randomNumbers[1];
                                }
                                case '*' -> {
                                    exp[0] = '*';
                                    result = randomNumbers[0] * randomNumbers[1];
                                }
                                case '-' -> {
                                    exp[0] = '-';
                                    result = randomNumbers[0] - randomNumbers[1];
                                }
                                case '+' -> {
                                    exp[0] = '+';
                                    result = randomNumbers[0] + randomNumbers[1];
                                }
                            }

                            if (result <= 0 || (result % 1) != 0 || result > 30) continue;

                            switch (operators[k]) {
                                case '/' -> {
                                    exp[1] = '/';
                                    result /= randomNumbers[2];
                                }
                                case '*' -> {
                                    exp[1] = '*';
                                    result *= randomNumbers[2];
                                }
                                case '-' -> {
                                    exp[1] = '-';
                                    result -= randomNumbers[2];
                                }
                                case '+' -> {
                                    exp[1] = '+';
                                    result += randomNumbers[2];
                                }
                            }

                            if (result <= 0 || (result % 1) != 0 || result > 30) continue;

                            switch (operators[j]) {
                                case '/' -> {
                                    exp[2] = '/';
                                    result /= randomNumbers[3];
                                }
                                case '*' -> {
                                    exp[2] = '*';
                                    result *= randomNumbers[3];
                                }
                                case '-' -> {
                                    exp[2] = '-';
                                    result -= randomNumbers[3];
                                }
                                case '+' -> {
                                    exp[2] = '+';
                                    result += randomNumbers[3];
                                }
                            }

                            if (result == 24 && set.add(List.of(exp))) {

                                groupOfNumbers.add(List.of(randomNumbers));
                                continue LABEL;
                            }

                        }

            }

        }
        return groupOfNumbers;

    }
}