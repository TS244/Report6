package jp.ac.uryukyu.ie.e185428;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * GameMasterクラスのユニットテスト
 */
public class GameMasterTest {
    /**
     * fiveLineメソッドのテスト
     */
    @Test
    public void fiveLine() {
        int x = 0;
        int y = 0;
        int vector_x = 0;
        int vector_y = 1;
        int n = 1;

        Board board = new Board(8, 8);
        Player p = new Player(new Piece("○"), board);
        board.setBoard();
        p.putPiece(0, 0);
        p.putPiece(0, 1);
        p.putPiece(0, 2);
        p.putPiece(0, 3);
        p.putPiece(0, 4);
        //石を縦方向に５個並べる

        for(int i=1; i<5; i++) {
            if ((0 <= (x + (vector_x * i)) && (x + (vector_x * i)) <= board.x) && (0 <= (y + (vector_y * i)) && (y + (vector_y * i)) <= board.y)) {
                if(board.board[y+(vector_y*i)][x+(vector_x*i)].getPieceColor() == p.piece.getPieceColor()) n += 1;
                else break;
            }
            else {
                break;
            }
        }
        assertEquals(5, n);
    }
}