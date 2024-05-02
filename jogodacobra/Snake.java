package jogodacobra;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Point> body;
    private Direction direction;
    private int boardWidth;
    private int boardHeight;

    public Snake(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.body = new LinkedList<>();
        this.body.add(new Point(10, 10)); // Posição inicial da cobra
        this.direction = Direction.RIGHT; // Direção inicial da cobra
    }

    public LinkedList<Point> getBody(){
        return body;
    }

    public void move() {
        Point head = body.getFirst();
        Point newHead = new Point(head.getX(), head.getY());
        switch (direction) {
            case UP:
                newHead.setY(newHead.getY() - 1);
                break;
            case DOWN:
                newHead.setY(newHead.getY() + 1);
                break;
            case LEFT:
                newHead.setX(newHead.getX() - 1);
                break;
            case RIGHT:
                newHead.setX(newHead.getX() + 1);
                break;
        }
        body.addFirst(newHead);
        checkCollisions();
    }

    public void grow() {
        Point tail = body.getLast();
        body.addLast(new Point(tail.getX(), tail.getY()));
    }

    public void checkCollisions() {
        Point head = body.getFirst();
        int headX = head.getX();
        int headY = head.getY();

        if (headX == 0 || headX == boardWidth - 1 || headY == 0 || headY == boardHeight - 1) {
            System.out.println("Game Over - Colisão com a parede!");
            System.exit(0);
        }

        for (int i = 1; i < body.size(); i++) {
            Point part = body.get(i);
            if (headX == part.getX() && headY == part.getY()) {
                System.out.println("Game Over - Colisão com o próprio corpo!");
                System.exit(0);
            }
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
