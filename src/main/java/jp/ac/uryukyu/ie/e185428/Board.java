package jp.ac.uryukyu.ie.e185428;

class Board {
    int x;
    int y;
    Piece[][] board;

    public Board(int y, int x) {
        this.y = y;
        this.x = x;
        board = new Piece[this.y][this.x];
    }

    public void setBoard() {
        for(int y=0; y<this.y; y++) {
            for(int x=0; x<this.x; x++) {
                board[y][x] = new Piece();
            }
        }
    }

    public void showBoard() {
        String x_coordinate = "   ";
        for(int x=0; x<board[0].length; x++) {
            x_coordinate += x + "  ";
        }
        System.out.println(x_coordinate);

        for(int y=0; y<board.length; y++) {
            String board_status = y + "  ";
            for(int x=0; x<board[0].length; x++) {
                board_status += board[y][x].getPieceColor() + "  ";
            }

            System.out.println(board_status);
        }
    }

    public boolean checkCanPut(int x, int y) {
        if(!(x>this.x || y>this.y) && board[y][x].getPieceColor() == "*") {
           return true;
        }
        return false;
    }

}
