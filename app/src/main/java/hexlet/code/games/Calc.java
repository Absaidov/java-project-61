package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.generatesRandomNumbers;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;
/*
 * game Calc
 * */
public class Calc {
    private static String description = "What is the result of the expression?";
    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXIMUM_NUMBER = 3;

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static void resultOfGameCalc() {
        String[][] arrayData = new String[getNumberOfRound()][2];
        int result;
        String question;
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            int randomNumber2 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            int randomNumberCalc = generatesRandomNumbers(MINIMUM_NUMBER, MAXIMUM_NUMBER);
            if (randomNumberCalc == 1){
                result = multi(randomNumber1, randomNumber2);
                question = randomNumber1 + " * " + randomNumber2;
            } else if (randomNumberCalc == 2) {
                result = add(randomNumber1, randomNumber2);
                question = randomNumber1 + " + " + randomNumber2;
            } else {
                result = sub(randomNumber1, randomNumber2);
                question = randomNumber1 + " - " + randomNumber2;
            }
            arrayData[j][0] = question;
            arrayData[j][1] = String.valueOf(result);
        }
        Engine.evenGaming(description, arrayData);
    }
}

