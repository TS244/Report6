package jp.ac.uryukyu.ie.e185428;

public class Main {
    public static void main(String args[]) {
        Board board = new Board(6, 6);
        Player wp = new Player("●", board);
        Player bp = new Player("◯", board);
        GameMaster master = new GameMaster(board, wp, bp);

        board.setBoard();
        wp.putPiece(2, 2);
        wp.putPiece(3, 3);
        bp.putPiece(3, 2);
        bp.putPiece(2, 3);
        board.showBoard();


    }
}
