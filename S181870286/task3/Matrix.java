package S181870286.task3;

import S181870286.task2.Linable;
import S181870286.task2.Position;

public class Matrix {
    private Position[][] positions;
    public Matrix(int row, int col) {
        this.positions = new Position[row][];
        for (int i = 0; i < row;i++) {
            positions[i] = new Position[col];
            for (int j = 0; j < col; j++) {
                positions[i][j] = new Position(i, j);
            }
        }
    }

    public void put(Linable linable, int row, int col) {
        this.positions[row][col].setLinable(linable);
    }

    public Linable get(int row, int col) {
        if ((row < 0) || (row > positions.length) || (col < 0) || (col > positions[row].length)) {
            return null;
        } else {
            return positions[row][col].getLinable();
        }
    }


    @Override
    public String toString() {
        StringBuilder matrixString = new StringBuilder();
        for (Position[] line : positions) {
            matrixString.append("\t");
            for (Position p : line) {
                matrixString.append(p.getLinable().toString());
            }
            matrixString.append("\n");
        }

        return matrixString.toString();
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[positions.length * positions[0].length];
        int i = 0;
        for (Position[] line : positions) {
            for (Position p : line) {
                linables[i] = p.getLinable();
                i++;
            }
        }
        return linables;

    }
}
