package jp.ac.uryukyu.ie.e185428;

class Piece {
    private int x;
    private int y;
    private String piece_status;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
        this.piece_status = "*";
    }

    public int[] getPosition() {
        int[] piece_pos = {x, y};
        return piece_pos;
    }

    public String getPieceColor() {
        return piece_status;
    }

    public void setPieceColor(String piece_color) {
        this.piece_status = piece_color;
    }
}
