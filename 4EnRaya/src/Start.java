import java.util.Scanner;

public class Start {

    public Start() {

    }

    private void gamePvp() {
        GamePvp game = new GamePvp();
        game.startGame();
    }

    private void gamePvM() {
        GamePvM game = new GamePvM();
        game.startGame();
    }

    private void gameMvM() {
        GameMvM game = new GameMvM();
        game.startGame();
    }

    private int selectMode() {
        System.out.println("¿Quieres elegir otro modo?");
        System.out.println("1-Pvp");
        System.out.println("2-PvM");
        System.out.println("3-MvM");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    private boolean isResumed() {

        System.out.println("¿Quieres elegir otro modo?");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("resource")
        String input = scanner.nextLine();
        return input.equals("s");

    }

    public void startGame() {

        do {
            int option = selectMode();
            switch (option) {
                case 1:
                    gamePvp();
                    break;
                case 2:
                    gamePvM();
                    break;
                case 3:
                    gameMvM();
                    break;

                default:
                    break;
            }

        } while (isResumed());
    }

    public static void main(String[] args) throws Exception {
        Start start = new Start();
        start.startGame();
    }

}
