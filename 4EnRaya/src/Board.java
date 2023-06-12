public class Board {

    private final int NUM_ROWS = 7;
    private final int NUM_COLS = 7;
    private Turn turn = new Turn();
    private Color[][] colors = new Color[NUM_ROWS][NUM_COLS];
    private int[] lastPosition = new int[2];
    private boolean winner = false;

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                colors[i][j] = Color.NULL;
            }
        }
    }

    public void putToken(int col) {
        int row = 0;
        if (this.isEmpty(colors[row][col]) && !this.isFull()) {

            this.setColor(row, col);
        } else if (this.isFull()) {
            System.out.println("¡El tablero esta lleno!");
        } else {

            while (!this.isEmpty(colors[row][col])) {
                row++;
            }
            this.setColor(row, col);

        }
        displayBoard();
        checkWinner();

    }

    public Color getWinnerColor() {
        return turn.getOppositePlayerColor();
    }

    private void getLastPosition(int row, int col) {
        lastPosition[0] = row;
        lastPosition[1] = col;
    }

    public void displayBoard() {
        System.out.println("Tablero:");

        for (int i = NUM_ROWS - 1; i >= 0; i--) {
            for (int j = 0; j < NUM_COLS; j++) {
                String square = getSquareSymbol(colors[i][j]);
                System.out.print("[" + square + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String getSquareSymbol(Color color) {
        if (color == Color.X) {
            return "X";
        } else if (color == Color.O) {
            return "O";
        } else {
            return " ";
        }
    }

    private boolean isFull() {

        for (int i = 0; i < NUM_COLS; i++) {
            if (colors[6][i] == Color.NULL) {
                return false;
            }
        }

        return true;
    }

    private boolean isEmpty(Color color) {
        return color == Color.NULL;
    }

    private void setColor(int row, int col) {
        colors[row][col] = turn.getCurrentPlayerColor();
        turn.changeTurn();
        getLastPosition(row, col);
    }

    public boolean isFinished() {
        return isFull() || winner;
    }

    public void checkWinner() {
        Color color = colors[lastPosition[0]][lastPosition[1]];

        // Horizontal
        if (checkLine(lastPosition[0], lastPosition[1], 0, 1, color) ||
                checkLine(lastPosition[0], lastPosition[1], 0, -1, color)) {
            winner = true;
        }

        // Vertical
        if (checkLine(lastPosition[0], lastPosition[1], 1, 0, color) ||
                checkLine(lastPosition[0], lastPosition[1], -01, 0, color)) {
            winner = true;
        }

        // Diagonal /
        if (checkLine(lastPosition[0], lastPosition[1], 1, 1, color) ||
                checkLine(lastPosition[0], lastPosition[1], -1, -1, color)) {
            winner = true;
        }

        // Diagonal \
        if (checkLine(lastPosition[0], lastPosition[1], -1, 1, color) ||
                checkLine(lastPosition[0], lastPosition[1], 1, -1, color)) {
            winner = true;
        }

    }

    private boolean checkLine(int startRow, int startCol, int rowIncrement, int colIncrement, Color color) {
        int count = 0;
        int currentRow = startRow;
        int currentCol = startCol;

        while (currentRow >= 0 && currentRow < NUM_ROWS && currentCol >= 0 && currentCol < NUM_COLS &&
                colors[currentRow][currentCol] == color) {
            count++;
            currentRow += rowIncrement;
            currentCol += colIncrement;
        }

        return count >= 4;
    }

}
