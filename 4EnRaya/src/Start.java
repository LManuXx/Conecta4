import java.util.Scanner;

public class Start {

    public Start() {

    }

    private void GamePvp() {
        GamePvp game = new GamePvp();
        game.startGame();
    }

    private void GamePvM() {
        GamePvM game = new GamePvM();
        game.startGame();
    }

    private void GameMvM() {
        GameMvM game = new GameMvM();
        game.startGame();
    }

    private int selectMode() {
        boolean res;
        System.out.println("¿Quieres elegir otro modo?");
        System.out.println("1-Pvp");
        System.out.println("2-PvM");
        System.out.println("3-MvM");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    private boolean isResumed() {
        boolean res;
        System.out.println("¿Quieres elegir otro modo?");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.equals("s");

    }

    public void startGame() {

        do {
            int option = selectMode();
            switch (option) {
                case 1:
                    GamePvp();
                    break;
                case 2:
                    GamePvM();
                    break;
                case 3:
                    GameMvM();
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
