import java.util.Scanner;

class Player {
    private int playerNum;
    Scanner scanner = new Scanner(System.in);

    // To check whose turn is
    Player(int playerNum){
        this.playerNum = playerNum;
    }
    private Board board;

    public void setBoard(Board board){
        this.board = board;
    }

    boolean move(){
        // Show board to player
        board.display();
        System.out.println("\n" + playerNum + "'s player turn.");

        // get user input
        System.out.println("Enter a num.");
        int n = scanner.nextInt();

        // Check if move is valid
        // update board
        if(n>=1 && n<=9){
            return board.game(n, playerNum);
        }else{
            System.out.println("Invalid input.");
            return false;
        }
    }
}
