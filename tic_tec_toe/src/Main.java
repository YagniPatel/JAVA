import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String... args) {
        System.out.println("two player? (Y|N)");
        String c = scanner.next();
        if (c.trim().equalsIgnoreCase("Y")){
            twoPlayer();
        }else{
            playWithComputer();
        }
    }

    public static void playWithComputer(){
        //
        Player playerX = new ConsolePlayer(1);
        Player playerO = new AIPlayer(2);
        Game game = new Game(playerX, playerO);
        game.play();
    }

    public static void twoPlayer(){
        Player playerX = new ConsolePlayer(1);
        Player playerO = new ConsolePlayer(2);
        Game game = new Game(playerX, playerO);
        game.play();
    }
}