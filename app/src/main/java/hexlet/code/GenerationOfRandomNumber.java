package hexlet.code;

public class GenerationOfRandomNumber {
    public static int generationOfNumber() {
        return (int) (Math.random() * 100);
    }
    public static int generationOfNumberForCalc() {
        int min = 1;
        int max = 3;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
}

