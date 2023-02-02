package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.newGenerator;

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
        String[][] arrData = new String[getNumberOfRound()][2];
        int i = 0;
        int result = 0;
        String[] arithOperators = new String[]{" + ", " - ", " * "};
        for (int j = 0; j < arrData.length; j++) {
            int randomNumber1 = newGenerator(1, 100);
            int randomNumber2 = newGenerator(1, 100);
            if (arithOperators[i] == " + ") {
                result = add(randomNumber1, randomNumber2);
            } else if (arithOperators[i] == " - ") {
                result = sub(randomNumber1, randomNumber2);
            } else {
                result = multi(randomNumber1, randomNumber2);
            }
            String question = randomNumber1 + arithOperators[i] + randomNumber2;
            arrData[j][0] = question;
            arrData[j][1] = String.valueOf(result);
            i++;
        }
        Engine.evenGaming(description, arrData);
    }
}

