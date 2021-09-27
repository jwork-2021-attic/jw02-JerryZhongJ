package S181870286.task2;

public class Position {
    private Linable linable;
    private final int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setLinable(Linable linable) {
        this.linable = linable;
        linable.setPosition(this);
    }

    public Linable getLinable() {
        return linable;
    }
}
