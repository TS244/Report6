package jp.ac.uryukyu.ie.e185428;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Board board = new Board(5, 5);
        Player wp = new Player(new Piece("●"), board);
        Player bp = new Player(new Piece("○"), board);
        GameMaster master = new GameMaster(board);
        Player p;
        p = bp;

        board.setBoard();
        board.showBoard();
        while (true) {
            if (p.piece.getPieceColor().equals("●")) {
                System.out.println("白のターンです。");
            } else {
                System.out.println("黒のターンです。");
            }

            try {
                System.out.println("石を置く場所を指定してください。");
                System.out.println("x座標");
                Scanner scan_x = new Scanner(System.in);
                int x = Integer.parseInt(scan_x.next());
                System.out.println("y座標");
                Scanner scan_y = new Scanner(System.in);
                int y = Integer.parseInt(scan_y.next());

                if(board.checkCanPut(x, y)){
                    p.putPiece(x, y);
                }
                else {
                    System.out.println("\nすでに置かれているか、囲碁盤の範囲外です。\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n数値以外の値は入力できません。\n");
                continue;
            }

            board.showBoard();

            if (master.judge(p.piece.getPieceColor())) {
                if (p.piece.getPieceColor().equals("●")) {
                    System.out.println("白の勝ちです。");
                } else {
                    System.out.println("黒の勝ちです。");
                }
                break;
            }

            if(master.isDraw()) {
                System.out.println("引き分けです。");
                break;
            }

            if (p == wp) {
                p = bp;
            }
            else {
                p = wp;
            }
        }

    }


}


