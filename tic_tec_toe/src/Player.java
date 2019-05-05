public interface Player {
    boolean move();
    void setBoard(Board board);
    Board getBoard();
    int getPlayerNum();
}