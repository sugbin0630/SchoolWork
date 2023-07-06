package Grade12.Grade11_review;

import java.util.*;

public class GameOfLife {
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private static final int GENERATIONS = 100;

    private boolean[][] grid;

    public GameOfLife() {
        this.grid = new boolean[WIDTH][HEIGHT];
        this.randomize();
    }

    private void randomize() {
        Random random = new Random();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                grid[i][j] = random.nextBoolean();
            }
        }
    }

    private void nextGeneration() {
        boolean[][] newGrid = new boolean[WIDTH][HEIGHT];

        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                int count = countAliveNeighbours(i, j);

                if (grid[i][j]) {
                    newGrid[i][j] = (count == 2 || count == 3);
                } else {
                    newGrid[i][j] = (count == 3);
                }
            }
        }

        this.grid = newGrid;
    }

    private int countAliveNeighbours(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int neighbourX = x + i;
                int neighbourY = y + j;

                if (i == 0 && j == 0) {
                    continue;
                }

                if (neighbourX < 0 || neighbourY < 0 || neighbourX >= WIDTH || neighbourY >= HEIGHT) {
                    continue;
                }

                if (grid[neighbourX][neighbourY]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void run() {
        for (int i = 0; i < GENERATIONS; i++) {
            System.out.println("Generation " + (i + 1) + ":");
            printGrid();
            nextGeneration();
        }
    }

    private void printGrid() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.print(grid[i][j] ? "X " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }
}

