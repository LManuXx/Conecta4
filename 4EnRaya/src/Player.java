import java.util.Scanner;

public class Player {

    Board board;

    public Player(Board board) {
        this.board = board;
    }

    public void putToken() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un la columna: ");
        int col = scanner.nextInt();
        board.putToken(col);

    }

}
