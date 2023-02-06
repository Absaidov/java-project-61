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
//        int i = 0;
        int result = 0;
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            int randomNumber2 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            int randomNumberCalc = generatesRandomNumbers(1, 3);
            String question;
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
//            i++;
        }
        Engine.evenGaming(description, arrayData);
    }
}

