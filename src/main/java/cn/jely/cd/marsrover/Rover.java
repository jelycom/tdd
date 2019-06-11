package cn.jely.cd.marsrover;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rover {
    public static final String TURNLEFT = "L";
    public static final String TURNRIGHT = "R";
    public static final String FORWARD = "F,";
    public static final String BACKWARD = "B,";
    private Mars mars;
    private int x;
    private int y;
    private Direction direction;
    private List<Obstacle> obstacles = new ArrayList<>();
    private Obstacle obstacle;

    public Rover(Mars mars, int x, int y, Direction direction) {
        this.mars = mars;
        this.x = x;
        this.y = y;
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
        for (int i = 0; i < step; i++) {
            direction.forward(this);
        }
    }

    public void backward(int step) {
        for (int i = 0; i < step; i++) {
            direction.backward(this);
        }
    }

    public void addY() {
        setObstacleIfMatch(x, y + 1);
        if(this.obstacle!=null) return;
        y++;
        if (y > mars.getMaxY()) {
            y = 0;
        }
    }

    private void setObstacleIfMatch(int x, int y) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.match(x, y)) {
                this.obstacle = obstacle;
            }
        }
    }

    public void subY() {
        setObstacleIfMatch(x, y - 1);
        if(this.obstacle!=null) return;
        y--;
        if (y < 0) {
            y = mars.getMaxY();
        }
    }

    public void addX() {
        setObstacleIfMatch(x+1, y);
        if(this.obstacle!=null) return;
        x++;
        if (x > mars.getMaxX()) {
            x = 0;
        }
    }

    public void subX() {
        setObstacleIfMatch(x-1, y);
        if(this.obstacle!=null) return;
        x--;
        if (x < 0) {
            x = mars.getMaxX();
        }
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
                executeSingle(cmd);
                if (this.obstacle != null) {
                    reportToEarth();
                }
            }
        }
    }

    private void executeSingle(String cmd) {
        if (TURNLEFT.equals(cmd)) {
            turnLeft();
        } else if (TURNRIGHT.equals(cmd)) {
            turnRight();
        } else if (cmd.startsWith(FORWARD)) {
            forward(parseStep(cmd));
        } else if (cmd.startsWith(BACKWARD)) {
            backward(parseStep(cmd));
        }else{
            throw new IllegalArgumentException("Illegal Argument" + cmd);
        }
    }

    private void reportToEarth() {
        System.out.println(this);
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

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void addObstacle(Obstacle obstacle) {
        this.obstacles.add(obstacle);
    }
}
