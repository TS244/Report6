package jp.ac.uryukyu.ie.e185428;

/**
 * 五目並べを行うプレーヤーのクラス
 * 指定した場所に石を置くことができる
 *
 * Board board; //囲碁盤の情報
 * String piece_color; //プレイヤーの石の色
 */
class Player {
    Board board;
    String piece_color;

    public Player(String piece_color, Board board) {
        this.piece_color = piece_color;
        this.board = board;
    }

    /**
     * 指定した位置に石を置くメソッド
     * @param x  囲碁盤のx座標
     * @param y  囲碁盤のy座標
     */
    public void putPiece(int x, int y) {
        board.board[y][x].setPieceColor(this.piece_color);
    }

}
