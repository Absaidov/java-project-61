package hexlet.code;
import static hexlet.code.Cli.asking;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.ArithProgression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class ChoiceOfGame {
    /*
     * asking the number of game
     * */
    private static Scanner sc = new Scanner(System.in);
    private static int gameNumberForAnotherClass;
    public static int getGameNumberForAnotherClass() {
        return gameNumberForAnotherClass;
    }

    public static String games() {
        int greetGameNumber = 1;
        int greetGameEven = 2;
        int greetGameCalc = 3;
        int greetGameGCD = 4;
        int greetGameProgression = 5;
        int greetGamePrime = 6;
        System.out.print("Please enter the game number and press Enter.\n"
                +
                "1 - Greet\n"
                +
                "2 - Even\n"
                +
                "3 - Calc\n"
                +
                "4 - GCD\n"
                +
                "5 - Progression\n"
                +
                "6 - Prime\n"
                +
                "0 - Exit\n"
                +
                "Your choice: ");
        gameNumberForAnotherClass = sc.nextInt();
        if (gameNumberForAnotherClass == greetGameNumber) {
            return asking();
        }
        if (gameNumberForAnotherClass == greetGameEven) {
            return EvenGame.gameEven();
        }
        if (gameNumberForAnotherClass == greetGameCalc) {
            return Calc.gameCalc();
        }
        if (gameNumberForAnotherClass == greetGameGCD) {
            return GCD.gameGCD();
        }
        if (gameNumberForAnotherClass == greetGameProgression) {
            return ArithProgression.gameProgres();
        }
        if (gameNumberForAnotherClass == greetGamePrime) {
            return Prime.gamePrime();
        } else {
            return "badGateWay";
        }
    }
}
