package jp.ac.uryukyu.ie.e185428;

class Piece {
    private String piece_status;

    public Piece() {
        this.piece_status = "*";
    }

    public String getPieceColor() {
        return piece_status;
    }

    public void setPieceColor(String piece_color) {
        this.piece_status = piece_color;
    }
}
