package jogodacobra; // certifique-se de que ambas as classes estão no mesmo pacote

import java.util.LinkedList;

public class GameBoard {
    private static final int WIDTH = 20;
    static final int HEIGHT = 20;

    public void drawBoard(Snake snake, Point fruit) {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < getWidth(); x++) {
                if (x == 0 || x == getWidth() - 1 || y == 0 || y == HEIGHT - 1) {
                    System.out.print("#");
                } else if (x == fruit.getX() && y == fruit.getY()) {
                    System.out.print("F");
                } else {
                    boolean printSnake = false;
                    for (Point point : snake.getBody()) { // Supondo que a classe Snake esteja no mesmo pacote
                        if (point.getX() == x && point.getY() == y) {
                            System.out.print("O");
                            printSnake = true;
                            break;
                        }
                    }
                    if (!printSnake) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static int getWidth() {
        return WIDTH;
        
    }
}
