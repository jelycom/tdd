package cn.jely.cd.marsrover;

public class Obstacle {
    private int x;
    private int y;
    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean match(int x, int y) {
        return this.x == x && this.y == y;
    }
}
