import java.util.Random;
import java.util.Scanner;

public class MachinePlayer implements PlayerInterface {

    Board board;

    public MachinePlayer(Board board) {
        this.board = board;
    }

    @Override
    public void putToken() {
        board.putToken(generateRandomNumber(board.getColumn()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);

    }

}
