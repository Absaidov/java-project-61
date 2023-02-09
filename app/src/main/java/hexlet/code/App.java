package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetGameStart;
import static hexlet.code.games.ArithProgression.progresGameStart;
import static hexlet.code.games.EvenGame.evenGameStart;
import static hexlet.code.games.Calc.calcGameStart;
import static hexlet.code.games.GCD.GCDGameStart;
import static hexlet.code.games.Prime.primeGameStart;
public class App {
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
            case "1" -> greetGameStart();
            case "2" -> evenGameStart();
            case "3" -> calcGameStart();
            case "4" -> GCDGameStart();
            case "5" -> progresGameStart();
            case "6" -> primeGameStart();
            default -> System.out.println("badgatewayFromAPP");
        }
    }
}

