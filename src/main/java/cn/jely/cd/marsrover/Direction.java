package cn.jely.cd.marsrover;

public enum  Direction {
    South{
        @Override
        public void forward(Rover rover, int step) {
            rover.addY(-step);
        }

        @Override
        public void backward(Rover rover, int step) {
            rover.addY(step);
        }

        @Override
        public void turnLeft(Rover rover) {
            rover.setDirection(Direction.East);
        }

        @Override
        public void turnRight(Rover rover) {
            rover.setDirection(Direction.West);
        }
    }, North {
        @Override
        public void forward(Rover rover, int step) {
            rover.addY(step);
        }

        @Override
        public void backward(Rover rover, int step) {
            rover.addY(-step);
        }

        @Override
        public void turnLeft(Rover rover) {
            rover.setDirection(Direction.West);
        }

        @Override
        public void turnRight(Rover rover) {
            rover.setDirection(Direction.East);
        }
    }, East {
        @Override
        public void forward(Rover rover, int step) {
            rover.addX(step);
        }

        @Override
        public void backward(Rover rover, int step) {
            rover.addX(-step);
        }

        @Override
        public void turnLeft(Rover rover) {
            rover.setDirection(Direction.North);
        }

        @Override
        public void turnRight(Rover rover) {
            rover.setDirection(Direction.South);
        }
    }, West {
        @Override
        public void forward(Rover rover, int step) {
            rover.addX(-step);
        }

        @Override
        public void backward(Rover rover, int step) {
            rover.addX(step);
        }

        @Override
        public void turnLeft(Rover rover) {
            rover.setDirection(Direction.South);
        }

        @Override
        public void turnRight(Rover rover) {
            rover.setDirection(Direction.North);
        }
    };

    public abstract void forward(Rover rover, int step);

    Direction() {

    }

    public abstract void backward(Rover rover, int step);

    public abstract void turnLeft(Rover rover);

    public abstract void turnRight(Rover rover);
}
