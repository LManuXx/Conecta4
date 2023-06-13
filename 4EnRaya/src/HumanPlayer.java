import java.util.Scanner;

public class HumanPlayer implements PlayerInterface {

    private Board board;

    public HumanPlayer(Board board) {
        this.board = board;
    }

    public void putToken() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un la columna: ");
        int col = scanner.nextInt();
        board.putToken(col);

    }

}
