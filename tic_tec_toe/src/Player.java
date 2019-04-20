import java.util.Scanner;

class Player {
    private int playerNum;
    Scanner scanner = new Scanner(System.in);

    Player(int playerNum){
        this.playerNum = playerNum;
    }
    private Board board;

    public void setBoard(Board board){
        this.board = board;
    }

    boolean move(){
        // TODO Show board to player
        board.display();
        System.out.println("\n" + playerNum + "'s player turn.");

        // TODO get user input
        System.out.println("Enter a num.");
        int n = scanner.nextInt();

        if(n>=1 && n<=9){
            return board.game(n, playerNum);
        }else{
            System.out.println("Invalid input.");
            return false;
        }
        // TODO Check if move is valid
        // TODO update board
    }
}
