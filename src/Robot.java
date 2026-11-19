public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Direction getDirection() { return direction; }

    public void turnLeft() {
        switch (direction) {
            case UP:    direction = Direction.LEFT;  break;
            case LEFT:  direction = Direction.DOWN;  break;
            case DOWN:  direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.UP;    break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:    direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.DOWN;  break;
            case DOWN:  direction = Direction.LEFT;  break;
            case LEFT:  direction = Direction.UP;    break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:    y++; break;
            case DOWN:  y--; break;
            case LEFT:  x--; break;
            case RIGHT: x++; break;
        }
    }
}