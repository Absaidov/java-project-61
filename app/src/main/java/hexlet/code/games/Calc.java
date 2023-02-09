package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.generatesRandomNumbers;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static final int MINIMUM_NUMBER = 1;

    public static void calcGameStart() {
        String[][] arrayData = new String[NUMBER_OF_ROUND][2];
        int i = 0;
        int result;
        String question;
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            int randomNumber2 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            String[] arrayOfOperators = new String[]{" - ", " * ", " + "};
            question = resultForQuestion(randomNumber1, arrayOfOperators[i], randomNumber2);
            result = resulOfExpression(randomNumber1, arrayOfOperators[i], randomNumber2);
            arrayData[j][0] = question;
            arrayData[j][1] = String.valueOf(result);
            i++;
        }
        Engine.startEngine(description, arrayData);
    }
    public static String resultForQuestion(int number1, String numberForOperator, int number2) {
        return number1 + numberForOperator + number2;
    }
    public static int resulOfExpression(int number1, String numberForOperator, int number2) {
        int result;
        if (numberForOperator.equals(" - ")) {
            result = number1 - number2;
        } else if (numberForOperator.equals(" * ")) {
            result = number1 * number2;
        } else {
            result = number1 + number2;
        }
        return result;
    }
}
