import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Collections;

public class Game15 extends PApplet {

    private int[][] gameField;
    private float x;
    private float y;
    private float extent;
    private boolean invalidKeyPressed = false;
    private int invalidKeyTime = 0;
    private int moveCount = 0;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        gameField = new int[4][4];
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameField[i][j] = count++;
            }
        }
        gameField[3][3] = 16;
        x = width / 3f;
        y = 200f;
        extent = (width / 3f) / 4;
        shuffle();
    }

    @Override
    public void draw() {
        background(0);
        fill(255, 255, 0);
        textSize(50);
        text("Game 15", width / 3f + 230, 150);

        fill(255, 255, 0);
        textSize(40);
        text("Moves: " + moveCount, width - 570, height / 2f - 10);

        fill(255, 255, 0);
        textSize(50);
        text("Restart : R", width / 3f + 220, height - 150);

        fill(255, 255, 0);
        textSize(40);
        text("Use ↑ ↓ ← → ", 390, height / 2f - 10);



        init();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] != 16) {
                    fill(255, 255, 0);
                    textSize(50);
                    text(gameField[i][j], x + extent * j + extent / 2f - 20, y + i * extent + extent / 2f + 10);
                }
            }
        }

        if (invalidKeyPressed && millis() - invalidKeyTime < 1000) {
            fill(0, 255, 0);
            textSize(100);
            text("You pressed incorrect button!!!", width / 5f, height / 2f);
        } else {
            invalidKeyPressed = false;
        }
    }

    public void init() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fill(0, 0, 255);
                square(x + extent * j, y + i * extent, extent);
            }
        }
    }

    @Override
    public void keyPressed() {
        invalidKeyPressed = false;
        boolean move = false;

        switch (keyCode) {
            case UP:
                // TODO
                move = up();
                break;
            case DOWN:
                // TODO
                move = down();
                break;
            case LEFT:
                // TODO
                move = left();
                break;
            case RIGHT:
                // TODO
                move = right();
                break;
            case 82:
                resetGame();
                break;
            default:
                invalidKeyPressed = true;
                invalidKeyTime = millis();
                break;
        }

        if (move) {
            moveCount++;
        }
    }

    public boolean up() {
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] == 16) {
                    gameField[i][j] = gameField[i - 1][j];
                    gameField[i - 1][j] = 16;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean down() {
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] == 16) {
                    gameField[i][j] = gameField[i + 1][j];
                    gameField[i + 1][j] = 16;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean left() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (gameField[i][j] == 16) {
                    gameField[i][j] = gameField[i][j - 1];
                    gameField[i][j - 1] = 16;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean right() {
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j >= 0; j--) {
                if (gameField[i][j] == 16) {
                    gameField[i][j] = gameField[i][j + 1];
                    gameField[i][j + 1] = 16;
                    return true;
                }
            }
        }
        return false;
    }

    public void shuffle() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }
        list.add(16);
        Collections.shuffle(list);

        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameField[i][j] = list.get(k++);
            }
        }
    }

    public void resetGame() {
        gameField = new int[4][4];
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameField[i][j] = count++;
            }
        }
        gameField[3][3] = 16;
        shuffle();
        moveCount = 0;
    }

    public static void main(String[] args) {
        PApplet.main("Game15");
    }
}