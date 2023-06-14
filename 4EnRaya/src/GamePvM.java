public class GamePvM implements GameInterface {
    public GamePvM() {

    }

    @Override
    public void startGame() {

        do {
            Board board = new Board();
            HumanPlayer humanPlayer = new HumanPlayer(board);
            MachinePlayer machinePlayer = new MachinePlayer(board);

            while (!board.isFinished()) {
                humanPlayer.putToken();
                if (board.isFinished()) {
                    break;

                } else {
                    machinePlayer.putToken();
                }
            }

            System.out.println("Ha ganado el color: " + board.getWinnerColor().toString());
        } while (GamePvp.isResumed());
    }

}
