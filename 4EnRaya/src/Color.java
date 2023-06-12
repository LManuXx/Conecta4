public enum Color {
    X,
    O,
    NULL;

    private boolean isFilled() {
        return this == X || this == O;
    }

    private boolean isNull() {
        return this == NULL;
    }

}
