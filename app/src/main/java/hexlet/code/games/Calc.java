package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.generatesRandomNumbers;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static final int MINIMUM_NUMBER = 1;
    private static String[] arrayOfOperators = new String[]{" - ", " * ", " + "};

    public static void calcGameStart() {
        String[][] arrayData = new String[NUMBER_OF_ROUND][2];

        String question;
        for (int j = 0; j < arrayData.length; j++) {
            int result;
            int randomOperator = generatesRandomNumbers(0, 2);
            int randomNumber1 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            int randomNumber2 = generatesRandomNumbers(MINIMUM_NUMBER, MAX_NUMBER_OF_NUMBERS);
            question = resultForQuestion(randomNumber1, arrayOfOperators[randomOperator], randomNumber2);
            result = resulOfExpression(randomNumber1, arrayOfOperators[randomOperator], randomNumber2);
            arrayData[j][0] = question;
            arrayData[j][1] = String.valueOf(result);
        }
        Engine.startEngine(description, arrayData);
    }
    private static String resultForQuestion(int number1, String numberForOperator, int number2) {
        return number1 + numberForOperator + number2;
    }
    private static int resulOfExpression(int number1, String numberForOperator, int number2) {
        if (numberForOperator.equals(" - ")) {
            return number1 - number2;
        } else if (numberForOperator.equals(" * ")) {
            return number1 * number2;
        } else {
            return number1 + number2;
        }
    }
}
