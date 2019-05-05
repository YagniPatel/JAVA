import java.util.Random;

class RandomPlayer implements Player{
    private Random rand = new Random();
    protected int playerNum;
    private Board board;

    RandomPlayer(int n){
        this.playerNum = n;
    }

    public boolean move() {
        for(int n = rand.nextInt(9)+1; !board.game(n, playerNum); n = rand.nextInt(9));
        return true;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public Board getBoard(){
        return board;
    }

    public int getPlayerNum(){
        return playerNum;
    }

}