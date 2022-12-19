package hexlet.code;
import static hexlet.code.Cli.asking;
import static hexlet.code.ChoiceOfGame.games;
import static hexlet.code.Greet.greetGame;

public class App {
    public static void main(String[] args) {
        System.out.println(games());
        System.out.println(asking());
        System.out.println(greetGame());
    }
}
