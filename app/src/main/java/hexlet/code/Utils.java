package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Utils {
    public static int generatesRandomNumbers(int min, int max) {
        return RandomUtils.nextInt(min, max);
    }
}
