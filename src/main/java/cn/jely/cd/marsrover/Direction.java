package cn.jely.cd.marsrover;

public enum  Direction {
    South{
        @Override
        public void forward(Rover rover) {
            rover.subY();
        }

        @Override
        public void backward(Rover rover) {
            rover.addY();
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
        public void forward(Rover rover) {
            rover.addY();
        }

        @Override
        public void backward(Rover rover) {
            rover.subY();
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
        public void forward(Rover rover) {
            rover.addX();
        }

        @Override
        public void backward(Rover rover) {
            rover.subX();
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
        public void forward(Rover rover) {
            rover.subX();
        }

        @Override
        public void backward(Rover rover) {
            rover.addX();
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

    public abstract void forward(Rover rover);

    Direction() {

    }

    public abstract void backward(Rover rover);

    public abstract void turnLeft(Rover rover);

    public abstract void turnRight(Rover rover);
}
