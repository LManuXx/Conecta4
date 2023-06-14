public class Turn {

    private final int NUM_PLAYERS = 2;
    private int current = 0;
    private Color turn[] = new Color[NUM_PLAYERS];

    public Turn() {
        initializeTurn();
    }

    private void initializeTurn() {
        turn[0] = Color.X;
        turn[1] = Color.O;
    }

    public void changeTurn() {
        current = (current + 1) % turn.length;
    }

    public Color getCurrentPlayerColor() {
        return turn[current];
    }

    public Color getOppositePlayerColor() {
        return turn[(current + 1) % turn.length];
    }

}
