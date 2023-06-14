import java.util.Scanner;

public class HumanPlayer implements PlayerInterface {

    private Board board;

    public HumanPlayer(Board board) {
        this.board = board;
    }

    public void putToken() {

        int col;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un la columna: ");
            col = scanner.nextInt();

        } while ((col > 6 || col < 0) || board.isColumnFull(col));

        board.putToken(col);

    }

}
