class AIPlayer extends RandomPlayer implements Player{

    public AIPlayer (int n){
        super(n);
    }

    @Override
    public boolean move() {
        int t = -1, i;
        char b[] = getBoard().copyBoard();

        // check if chances of win

        if(b[0]==b[4] && b[0]!='_')
            t=8;
        if(b[0]==b[8] && b[0]!='_')
            t=4;
        if(b[4]==b[8] && b[4]!='_')
            t=0;

        if(b[2]==b[6] && b[2]!='_')
            t=4;
        if(b[2]==b[4] && b[2]!='_')
            t=6;
        if(b[4]==b[6] && b[4]!='_')
            t=2;

        for (i=0; i<7; i+=3) {
            if(b[i]==b[i+1] && b[i]!='_')
                t=i+2;
            if(b[i]==b[i+2] && b[i]!='_')
                t=i+1;
            if(b[i+1]==b[i+2] && b[i+1]!='_')
                t=i;
        }

        for (i=0; i<3; i++) {
            if(b[i]==b[i+3] && b[i]!='_')
                t=i+6;
            if(b[i]==b[i+6] && b[i]!='_')
                t=i+3;
            if(b[i+3]==b[i+6] && b[i+3]!='_')
                t=i;
        }

        if(t>=1 && t<=9){
            return getBoard().game(t, playerNum);
        }else{
            // else do random move
            return super.move();
        }
    }
}