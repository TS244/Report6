package jp.ac.uryukyu.ie.e185428;

import java.util.ArrayList;
import java.util.List;

class Board {
    List<Piece> pieces = new ArrayList<>();
    int x;
    int y;
    String[][] board;

    public Board(int y, int x) {
        this.y = y;
        this.x = x;
        board = new String[this.y][this.x];
    }

    public void setBoard() {
        for(int y=0; y<this.y; y++) {
            for(int x=0; x<this.x; x++) {
                Piece piece = new Piece(x, y);
                this.pieces.add(piece);
            }
        }
    }

    public Piece getPiece(int x, int y) {
        for (Piece piece : pieces) {
            int[] piece_pos = piece.getPosition();
            if (piece_pos[0] == x && piece_pos[1] == y) {
                return piece;
            }
        }
        return null;
    }

    public void showBoard() {
        //String[][] board = new String[y][x];
        for(Piece piece : pieces) {
            int[] piece_pos = piece.getPosition();
            String piece_status = piece.getPieceColor();
            board[piece_pos[1]][piece_pos[0]] = piece_status;
        }

        for(int y=0; y<board.length; y++) {
            String board_status = "";
            for(int x=0; x<board[0].length; x++) {
                board_status += board[y][x] + "  ";
            }
            System.out.println(board_status);
        }
    }

    public boolean alreadyPut(int x, int y) {
        Piece piece = getPiece(x, y);
        if(piece.getPieceColor() != "*") {
            return true;
        }
        return false;
    }



}
