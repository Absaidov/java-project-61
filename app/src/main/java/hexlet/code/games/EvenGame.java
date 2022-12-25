package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.*;
/*
 * game greet
 * */

public class EvenGame {

    public static boolean logicOfThegame(){
        logicOfgame = randomNumberForAnotherClass % 2 == 0;
        return logicOfgame;
    }
    public static String gameEven(){
        questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        return Engine.evenGaming();
    }
    public static String rightAnswerOfEvengame(){
        return "yes";
    }
    public static String wrongAnswerOfEvengame(){
        return "no";
    }
}
