package jp.ac.uryukyu.ie.e185428;

/**
 * 五目並べで使う囲碁盤のクラス
 */
public class Board {
    int x;
    int y;
    Piece[][] board;

    /**
     * 囲碁盤クラスのコンストラクタ
     * @param y 囲碁盤の縦幅
     * @param x 囲碁盤の横幅
     */
    public Board(int y, int x) {
        this.y = y;
        this.x = x;
        board = new Piece[this.y][this.x];
    }

    /**
     * 何も置かれていない囲碁盤を準備するメソッド
     */
    public void setBoard() {
        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                board[y][x] = new Piece("*");
            }
        }
    }

    /**
     * 囲碁盤の表示を行うメソッド
     */
    public void showBoard() {
        String x_coordinate = "   ";
        for (int x = 0; x < board[0].length; x++) {
            x_coordinate += x + "  ";
        }
        System.out.println(x_coordinate);

        for (int y = 0; y < board.length; y++) {
            String board_status = y + "  ";
            for (int x = 0; x < board[0].length; x++) {
                board_status += board[y][x].getPieceColor() + "  ";
            }

            System.out.println(board_status);
        }
    }

    /**
     * 置く予定の位置に石が置けるか確認するメソッド
     * @param x 囲碁盤のx座標
     * @param y 囲碁盤のy座標
     * @return 置けるならtrue,置けないならfalse。
     */
    public boolean checkCanPut(int x, int y) {
        if (!(x > this.x || y > this.y) && board[y][x].getPieceColor() == "*") {
            return true;
        }
        return false;
    }
}
