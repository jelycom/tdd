package cn.jely.cd.marsrover;

public class Mars {
    private int maxX;
    private int maxY;

    public Mars(int x, int y) {
        setMaxX(x);
        setMaxY(y);
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        if(maxX<0) throw new IllegalArgumentException("maxX cannot be negative");
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        if(maxX<0) throw new IllegalArgumentException("maxX cannot be negative");
        this.maxY = maxY;
    }
}
