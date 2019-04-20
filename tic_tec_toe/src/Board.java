class Board {
    private Player playerO, playerX;
    char c[] = {'_','_','_','_','_','_','_','_','_'};

    // display the board
    void display(){
        int i;
        for(i=0; i<9; i++){
            if(i%3==0)
                System.out.println();
            System.out.print(c[i] + " ");
        }
    }

    /**
     *
     * @param a number of box
     * @param b player
     * @return return true if move successful, false otherwise
     */
    boolean game(int a,int b){
        // check if parameters are valid.
        if(a>=1 && a<=9) {
            if (c[a - 1] == '_') {
                if (b % 2 == 0) {
                    c[a - 1] = 'o';
                } else {
                    c[a - 1] = 'x';
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    int win(){


        return 0;
    }

    /**
     *
     * @return true if game is over, false otherwise
     */
    boolean isGameOver(){
        int i;
        for (i=0; i<9; i++)
            if(c[i]=='_')
                return false;
        return true;
    }

    public void setPlayerO(Player playerO) {
        this.playerO = playerO;
    }

    public void setPlayerX(Player playerX) {
        this.playerX = playerX;
    }
}
