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
        int i;
        char t='n';

        if(c[0]==c[4] && c[0]==c[8] && c[0]!='_')
            t=c[0];

        if(c[2]==c[4] && c[2]==c[6] && c[2]!='_')
            t=c[2];

        for (i=0; i<7; i+=3) {
            if(c[i]==c[i+1] && c[i]==c[i+2] && c[i]!='_')
                t=c[i];
        }

        for (i=0; i<3; i++) {
            if(c[i]==c[i+3] && c[i]==c[i+6] && c[i]!='_')
                t=c[i];
        }

        if(t=='x')
            return 1;
        else if(t=='o')
            return 2;
        else
            return 0;
    }

    /**
     *
     * @return true if game is over, false otherwise
     */
    boolean isGameOver(){
        int i;
        if (win() != 0 )
            return true;
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

    char[] copyBoard(){
        char[] a = c;
        return a;
    }
}