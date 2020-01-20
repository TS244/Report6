package jp.ac.uryukyu.ie.e185428;

class Player {
    Board board;
    String piece_color;

    public Player(String piece_color, Board board) {
        this.piece_color = piece_color;
        this.board = board;
    }

    public void putPiece(int x, int y) {
        board.board[y][x].setPieceColor(this.piece_color);
    }

}
