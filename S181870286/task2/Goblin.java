package S181870286.task2;

public class Goblin implements Linable {
    
    private final int r, g, b;
    private final int value;
    private Position position;

    public Goblin(int r, int g, int b, int value){
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    @Override
    public void setPosition(Position position) {
        // TODO Auto-generated method stub
        this.position = position;
    }

    @Override
    public Position getPosition() {
        
        return position;
    }

    @Override
    public int getValue() {
        
        return value;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m \033[0m";
    }

    @Override
    public void swapPosition(Linable another) {
        Position p = another.getPosition();
        position.setLinable(another);
        p.setLinable(this);
    }
    
}
