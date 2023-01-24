package hexlet.code;

import static hexlet.code.games.ArithProgression.getRandomNumber;

public class GenerationOfRandomNumber {
    public static int generationOfNumber() {
        final int multiNumberInHundered = 100;
        return (int) (Math.random() * multiNumberInHundered);
    }
    public static int maxNumberForCalc() {
        final int max = 3;
        return max;
    }
    public static int generationOfNumberForCalc() {
        final int min = 1;
        int max = maxNumberForCalc();
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }

    /*
    * */
    public static int generationOfNumberForProg() {
        final int min = 0;
        int max = getRandomNumber() - 1;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int maxNumberForLengthProgression() {
        final int max = 15;
        return max;
    }
    public static int generationOfNumberForLengthProgression() {
        final int min = 5;
        int max = maxNumberForLengthProgression();
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int generationOfNumberForLenghtOfStep() {
        final int min = 2;
        int max = getRandomNumber();
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }

}
