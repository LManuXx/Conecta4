import java.util.Random;
import java.util.Scanner;

public class MachinePlayer implements PlayerInterface {

    Board board;

    public MachinePlayer(Board board) {
        this.board = board;
    }

    @Override
    public void putToken() {
        int col;
        do {
            col = generateRandomNumber(board.getColumn());
        } while (board.isColumnFull(col));

        board.putToken(col);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);

    }

}
