package jp.ac.uryukyu.ie.e185428;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Board board = new Board(8, 8);
        Player wp = new Player("●", board);
        Player bp = new Player("◯", board);
        GameMaster master = new GameMaster(board);
        Player p;
        p = bp;

        board.setBoard();
        board.showBoard();
        while (true) {
            if (p.piece_color == "●") {
                System.out.println("白のターンです。");
            } else if (p.piece_color == "◯") {
                System.out.println("黒のターンです。");
            }
            
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
                System.out.println("その位置には置けません");
                continue;
            }

            board.showBoard();

            if (master.judge(p.piece_color)) {
                if (p.piece_color == "●") {
                    System.out.println("白の勝ちです。");
                }
                if (p.piece_color == "◯") {
                    System.out.println("黒の勝ちです。");
                }
                break;
            }

            if (p == wp) {
                p = bp;
            } else {
                p = wp;
            }
        }

    }


}


