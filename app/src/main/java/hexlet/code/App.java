package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.asking;
import static hexlet.code.games.ArithProgression.resultOfGameConsecutiveNumbers;
import static hexlet.code.games.EvenGame.gameEven;
import static hexlet.code.games.Calc.resultOfGameCalc;
import static hexlet.code.games.GCD.resultOfGameGCD;
import static hexlet.code.games.Prime.gamePrime;
public class App {
    /*
     * asking the number of game
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        String number = sc.next();
        switch (number) {
            case "1" -> asking();
            case "2" -> gameEven();
            case "3" -> resultOfGameCalc();
            case "4" -> resultOfGameGCD();
            case "5" -> resultOfGameConsecutiveNumbers();
            case "6" -> gamePrime();
            default -> System.out.println("badgatewayFromAPP");
        }
    }
}

