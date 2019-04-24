import java.util.Scanner;

class Game {
    Scanner scanner = new Scanner(System.in);
    private Board board;
    private Player playerX, playerO;
    Game(){
        this(new Player(1), new Player(2));
    }

    Game(Player playerX, Player playerO){
        this(new Board(), playerX, playerO);
    }

    Game(Board board, Player playerX, Player playerO){
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;

        // Dependency injection
        this.playerO.setBoard(board);
        this.playerX.setBoard(board);
        this.board.setPlayerO(playerO);
        this.board.setPlayerX(playerX);
    }

    void play(){
        //TODO
        //iterate until game is over

        int m=1;
        boolean f;
        for(;!board.isGameOver();){
            // play
            f = m%2==0 ? playerO.move() : playerX.move();

            // handle wrong input
            if (f){
                m++;
            }else{
                System.out.println("wrong input.");
            }

            // handle if game is over
            if(board.isGameOver()) {
                // todo check who wins
                board.display();
                System.out.println("\nGame is over.");
                if(board.win() != 0){
                    if(board.win() == 1)
                        System.out.println("\n1 is won.");
                    else
                        System.out.println("\n2 is won.");
                }
                else
                    System.out.println("\nNobody is won.");

                break;
            }
        }
    }
}