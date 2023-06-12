import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        Player playerX = new Player(board);
        Player playerY = new Player(board);

        while (!board.isFinished()) {
            playerX.putToken();

        }

        System.out.println("Ha ganado el color: " + board.getWinnerColor().toString());

    }
}
