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
    static Scanner sc = new Scanner(System.in);
    public static int gameNumberForAnotherClass;
    public static String games() {
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
        if (gameNumberForAnotherClass == 1) {
            return asking();
        }
        if (gameNumberForAnotherClass == 2) {
            return EvenGame.gameEven();
        }
        if (gameNumberForAnotherClass == 3) {
            return Calc.gameCalc();
        }
        if (gameNumberForAnotherClass == 4) {
            return GCD.gameGCD();
        }
        if (gameNumberForAnotherClass == 5) {
            return ArithProgression.gameProgres();
        }
        if (gameNumberForAnotherClass == 6) {
            return Prime.gamePrime();
        } else {
            return "badGateWay";
        }
    }
}
