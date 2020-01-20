package jp.ac.uryukyu.ie.e185428;

/**
 * 石の状態を表すPieceクラス
 *
 * String piece_status //石の状態(黒か白か、何も置かれてないか)
 */
class Piece {
    private String piece_status;

    /**
     * コンストラクタ
     * "*"は石が置かれていない状態
     */
    public Piece() {
        this.piece_status = "*";
    }

    /**
     * 石の色を取得するメソッド
     * @return 石の色を返す
     */
    public String getPieceColor() {
        return piece_status;
    }

    /**
     * 石の色を設定するメソッド
     * @param piece_color 設定したい石の色
     */
    public void setPieceColor(String piece_color) {
        this.piece_status = piece_color;
    }
}
