package S181870286.task2;

public class Line {
    private Position[] positions;
    public Line(int length) {
        this.positions = new Position[length];
        for (int i = 0; i < length; i++) {
            positions[i] = new Position(0, i);
        }
    }

    public void put(Linable linable, int i) {
        this.positions[i].setLinable(linable);
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].getLinable();
        }
    }


    @Override
    public String toString() {
        StringBuilder lineString = new StringBuilder("\t");
        for (Position p : positions) {
            lineString.append(p.getLinable().toString());
        }
        return lineString.toString();
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].getLinable();
        }

        return linables;

    }
}
