package jp.ac.uryukyu.ie.e185428;

/**
 * 五目並べを行うプレーヤーのクラス
 */
public class Player {
    Board board;
    Piece piece;

    /**
     * Playerクラスのコンストラクタ
     * @param piece 使用する石
     * @param board 使用する囲碁盤
     */
    public Player(Piece piece, Board board) {
        this.piece = piece;
        this.board = board;
    }

    /**
     * 指定した位置に石を置くメソッド
     * @param x  囲碁盤のx座標
     * @param y  囲碁盤のy座標
     */
    public void putPiece(int x, int y) {
        board.board[y][x].setPieceColor(this.piece.getPieceColor());
    }

}
