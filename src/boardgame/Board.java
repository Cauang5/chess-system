package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Pieces[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Pieces[rows][columns];
    }

    public int rows() {
        return rows;
    }

    public Board setRows(int rows) {
        this.rows = rows;
        return this;
    }

    public int columns() {
        return columns;
    }

    public Board setColumns(int columns) {
        this.columns = columns;
        return this;
    }
}
