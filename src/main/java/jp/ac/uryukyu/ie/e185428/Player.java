package jp.ac.uryukyu.ie.e185428;

class Player {
    Board board;
    String piece_color;

    public Player(String piece_color, Board board) {
        this.piece_color = piece_color;
        this.board = board;
    }

    public void putPiece(int x, int y) {
        if (!(x > board.x || y > board.y)) {
            Piece piece = board.getPiece(x, y);
            piece.setPieceColor(this.piece_color);
        } else {
            System.out.println("その位置には置けません。");
        }
    }

}
