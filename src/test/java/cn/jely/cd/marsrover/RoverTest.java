package cn.jely.cd.marsrover;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoverTest {

    private final Mars mars = new Mars(100000, 100000);
    @DataProvider(name = "forwardParams")
    public Object[][] forwardParams() {
        return new Object[][]{{new Rover(mars, 200, 200, Direction.North), 1,new Rover(mars, 200, 201, Direction.North)},
                {new Rover(mars, 200, 200, Direction.South), 1,new Rover(mars, 200, 199, Direction.South)},
                {new Rover(mars, 200, 200, Direction.East), 1,new Rover(mars, 201, 200, Direction.East)},
                {new Rover(mars,200,200,Direction.West),1,new Rover(mars,199,200,Direction.West)}
        };
    }
    @DataProvider(name = "backwardParams")
    public Object[][] backwardParams() {
        return new Object[][]{{new Rover(mars, 200, 200, Direction.North),1, new Rover(mars, 200, 199, Direction.North)},
                {new Rover(mars, 200, 200, Direction.South), 1,new Rover(mars, 200, 201, Direction.South)},
                {new Rover(mars, 200, 200, Direction.East), 1,new Rover(mars, 199, 200, Direction.East)},
                {new Rover(mars,200,200,Direction.West),1,new Rover(mars,201,200,Direction.West)}
        };
    }
    @DataProvider(name = "turnLeftParams")
    public Object[][] turnLeftParams() {
        return new Object[][]{{new Rover(mars, 200, 200, Direction.North), new Rover(mars, 200, 200, Direction.West)},
                {new Rover(mars, 200, 200, Direction.South), new Rover(mars, 200, 200, Direction.East)},
                {new Rover(mars, 200, 200, Direction.East), new Rover(mars, 200, 200, Direction.North)},
                {new Rover(mars,200,200,Direction.West),new Rover(mars,200,200,Direction.South)}
        };
    }

    @DataProvider(name = "turnRightParams")
    public Object[][] turnRightParams() {
        return new Object[][]{{new Rover(mars, 200, 200, Direction.North), new Rover(mars, 200, 200, Direction.East)},
                {new Rover(mars, 200, 200, Direction.South), new Rover(mars, 200, 200, Direction.West)},
                {new Rover(mars, 200, 200, Direction.East), new Rover(mars, 200, 200, Direction.South)},
                {new Rover(mars,200,200,Direction.West),new Rover(mars,200,200,Direction.North)}
        };
    }
    @DataProvider(name = "executeCmdParams")
    public Object[][] executeCmdParams() {
        return new Object[][]{{new Rover(mars, 200, 200, Direction.North), "L:L:F,20:R:B,3", new Rover(mars, 203, 180, Direction.West)},
                {new Rover(mars, 200, 200, Direction.West), "B,4:L:F,3", new Rover(mars,  204,197, Direction.South)}};
    }
    @Test(dataProvider = "forwardParams")
    public void testForward(Rover rover, int step, Rover expected) {
        rover.forward(step);
        Assert.assertEquals(rover,expected);
    }

    @Test(dataProvider = "backwardParams")
    public void testBackward(Rover origin, int step, Rover expected) {
        origin.backward(step);
        Assert.assertEquals(origin,expected);
    }

    @Test(dataProvider = "turnLeftParams")
    public void testTurnLeft(Rover origin,Rover expected) {
        origin.turnLeft();
        Assert.assertEquals(origin,expected);
    }
    @Test(dataProvider = "turnRightParams")
    public void testTurnRight(Rover origin,Rover expected) {
        origin.turnRight();
        Assert.assertEquals(origin,expected);
    }
    @Test(dataProvider = "executeCmdParams")
    public void executeCmd(Rover origin,String command,Rover expected) {
        origin.execute(command);
        Assert.assertEquals(origin,expected);
    }
}