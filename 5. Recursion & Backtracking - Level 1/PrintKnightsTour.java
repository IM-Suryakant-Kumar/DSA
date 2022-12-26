import java.util.Scanner;

public class PrintKnightsTour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int move) {
        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return;
        } else if (move == chess.length * chess.length) {
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = move;
        printKnightsTour(chess, r - 2, c + 1, move);
        printKnightsTour(chess, r - 1, c + 2, move);
        printKnightsTour(chess, r + 1, c + 2, move);
        printKnightsTour(chess, r + 2, c + 1, move);
        printKnightsTour(chess, r + 2, c - 1, move);
        printKnightsTour(chess, r + 1, c - 2, move);
        printKnightsTour(chess, r - 1, c - 2, move);
        printKnightsTour(chess, r - 2, c - 1, move);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.println(chess[i][j] + " ");
            }
        }
    }
}
