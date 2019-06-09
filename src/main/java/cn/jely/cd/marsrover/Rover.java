package cn.jely.cd.marsrover;

import java.util.Objects;

public class Rover {
    private Mars mars;
    private int x;
    private int y;
    private Direction direction;
    public Rover(Mars mars, int x, int y, Direction direction) {
        setMars(mars);
        setX(x);
        setY(y);
        setDirection(direction);
    }
    public Mars getMars() {
        return mars;
    }

    public void setMars(Mars mars) {
        this.mars = mars;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                Objects.equals(mars, rover.mars) &&
                direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mars, x, y, direction);
    }

    public void forward(int step) {
        direction.forward(this,step);
    }

    public void backward(int step) {
        direction.backward(this,step);
    }

    public void addY(int step) {
        setY(getY() + step);
    }

    public void addX(int step) {
        setX(getX() + step);
    }

    public void turnLeft() {
        direction.turnLeft(this);
    }

    public void turnRight() {
        direction.turnRight(this);
    }

    public void execute(String command) {
        if (command != null && !command.trim().isEmpty()) {
            String[] cmds = command.split(":");
            for (String cmd : cmds) {
                if ("L".equals(cmd)) {
                    turnLeft();
                } else if ("R".equals(cmd)) {
                    turnRight();
                } else if (cmd.startsWith("F,")) {
                    forward(parseStep(cmd));
                } else if (cmd.startsWith("B,")) {
                    backward(parseStep(cmd));
                }else{
                    throw new IllegalArgumentException("Illegal Argument" + cmd);
                }
            }
        }
    }

    private int parseStep(String cmd) {
        return Integer.parseInt(cmd.substring(cmd.indexOf(",") + 1));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rover{");
        sb.append("mars=").append(mars);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", direction=").append(direction);
        sb.append('}');
        return sb.toString();
    }
}
