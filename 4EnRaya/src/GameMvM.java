public class GameMvM implements GameInterface {
    public GameMvM() {

    }

    @Override
    public void startGame() {

        do {
            Board board = new Board();
            MachinePlayer machinePlayer = new MachinePlayer(board);
            MachinePlayer machinePlayer2 = new MachinePlayer(board);

            while (!board.isFinished()) {
                machinePlayer2.putToken();
                if (board.isFinished()) {
                    break;

                } else {
                    machinePlayer.putToken();
                }
            }
        } while (GamePvp.isResumed());
    }

}
