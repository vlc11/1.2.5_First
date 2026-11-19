public class Main {
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                turnTo(robot, Direction.RIGHT);
            } else {
                turnTo(robot, Direction.LEFT);
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                turnTo(robot, Direction.UP);
            } else {
                turnTo(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private static void turnTo(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 3, 0);
        System.out.println("X = " + robot.getX() + ", Y = " + robot.getY());
    }
}