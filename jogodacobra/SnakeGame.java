package jogodacobra;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    private boolean gameOver;
    private Snake snake;
    private GameBoard board;
    private Point fruit;

    public SnakeGame() {
        this.gameOver = false;
        this.snake = new Snake(0, 0);
        this.board = new GameBoard();
        this.fruit = generateRandomPosition(); // Gera uma posição inicial aleatória para a fruta
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            board.drawBoard(snake, fruit);
            handleInput(scanner);
            snake.move();
            if (snake.getBody().getFirst().getX() == fruit.getX() &&
                snake.getBody().getFirst().getY() == fruit.getY()) {
                snake.grow();
                fruit = generateRandomPosition(); // Gera uma nova posição para a fruta
            }
        }
        scanner.close();
    }

    private void handleInput(Scanner scanner) {
        if (scanner.hasNext()) {
            String input = scanner.next();
            switch (input.toLowerCase()) {
                case "w":
                    if (snake.getDirection() != Direction.DOWN) {
                        snake.setDirection(Direction.UP);
                    }
                    break;
                case "s":
                    if (snake.getDirection() != Direction.UP) {
                        snake.setDirection(Direction.DOWN);
                    }
                    break;
                case "a":
                    if (snake.getDirection() != Direction.RIGHT) {
                        snake.setDirection(Direction.LEFT);
                    }
                    break;
                case "d":
                    if (snake.getDirection() != Direction.LEFT) {
                        snake.setDirection(Direction.RIGHT);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private Point generateRandomPosition() {
        Random random = new Random();
        int x = random.nextInt(GameBoard.getWidth() - 2) + 1; // Evita as bordas do tabuleiro
        int y = random.nextInt(GameBoard.HEIGHT - 2) + 1; // Evita as bordas do tabuleiro
        return new Point(x, y);
    }
}
