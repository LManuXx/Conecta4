import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        while (!board.isFinished()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un la columna: ");
            int col = scanner.nextInt();

            board.putToken(col);
            board.displayBoard();

        }

        System.out.println("Ha ganado el color: " + board.getWinnerColor().toString());

    }
}
