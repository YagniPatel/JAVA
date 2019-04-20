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
        Game game = new Game();
        game.play();
    }

    public static void twoPlayer(){
        Game game = new Game();
        game.play();
    }
}