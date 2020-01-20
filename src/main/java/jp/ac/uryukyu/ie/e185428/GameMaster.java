package jp.ac.uryukyu.ie.e185428;

class GameMaster {
    Board board;

    GameMaster(Board board) {
        this.board = board;
    }

    public boolean judge(String piece_color) {
        int[] n = new int[4];

        for(int y=0; y<board.board.length; y++) {
            for(int x=0; x<board.board.length; x++) {
                if(board.board[y][x].getPieceColor() == piece_color) {
                    n[0] = fiveLine(x, y, 0, 1, piece_color); //「|」方向
                    n[1] = fiveLine(x, y, 1, 0, piece_color); //「ー」方向
                    n[2] = fiveLine(x, y, 1, 1, piece_color); // 「\」j方向
                    n[3] = fiveLine(x, y, -1, 1, piece_color); // 「/」方向
                }
                for(int i=0; i<4; i++) {
                    if(n[i] == 5) return true;
                }
            }
        }
        return false;
    }


    public int fiveLine(int x, int y, int vector_x, int vector_y, String piece_color) {
        int n = 1;

        for(int i=1; i<5; i++) {
            if ((0 <= (x + (vector_x * i)) && (x + (vector_x * i)) <= board.x) && (0 <= (y + (vector_y * i)) && (y + (vector_y * i)) <= board.y)) {
                if(board.board[y+(vector_y*i)][x+(vector_x*i)].getPieceColor() == piece_color) n += 1;
                else break;
            }
            else {
                break;
            }
        }

        for(int i=1; i<5; i++) {
            if ((0 <= (x - (vector_x * i)) && (x - (vector_x * i)) <= board.x) && (0 <= (y - (vector_y * i)) && (y - (vector_y * i)) <= board.y)) {
                if(board.board[y-(vector_y*i)][x-(vector_x*i)].getPieceColor() == piece_color) n += 1;
                else break;
            }
            else {
                break;
            }
        }
        return n;
    }
}
