package boardgame;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int row() {
        return row;
    }

    public Position setRow(int row) {
        this.row = row;
        return this;
    }

    public int column() {
        return column;
    }

    public Position setColumn(int column) {
        this.column = column;
        return this;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
