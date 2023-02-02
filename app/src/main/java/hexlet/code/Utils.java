package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
public class Utils {
    public static int newGenerator(int min, int max){
            return RandomUtils.nextInt(min,max);
    }
}
