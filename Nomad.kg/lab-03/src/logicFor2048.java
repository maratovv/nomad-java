public class LogicFor2048 {
    private int[][] gameBoard;

    public LogicFor2048() {
        gameBoard = new int[4][4];
        gameBoard[0][3] = 2;
        gameBoard[0][2] = 2;
        gameBoard[0][1] = 2;
    }

    public void moveRight() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = gameBoard[i].length - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (gameBoard[i][j] == 0 && gameBoard[i][k] != 0) {
                        gameBoard[i][j] = gameBoard[i][k];
                        gameBoard[i][k] = 0;
                        break;
                    }
                }
            }

            for (int j = gameBoard[i].length - 1; j > 0; j--) {
                if (gameBoard[i][j] == gameBoard[i][j - 1] && gameBoard[i][j] != 0) {
                    gameBoard[i][j] *= 2;
                    gameBoard[i][j - 1] = 0;
                }
            }

            for (int j = gameBoard[i].length - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (gameBoard[i][j] == 0 && gameBoard[i][k] != 0) {
                        gameBoard[i][j] = gameBoard[i][k];
                        gameBoard[i][k] = 0;
                        break;
                    }
                }
            }
        }
    }

    public void moveLeft() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length - 1; j++) {
                for (int k = j + 1; k < gameBoard[i].length; k++) {
                    if (gameBoard[i][j] == 0 && gameBoard[i][k] != 0) {
                        gameBoard[i][j] = gameBoard[i][k];
                        gameBoard[i][k] = 0;
                        break;
                    }
                }
            }

            for (int j = 0; j < gameBoard[i].length - 1; j++) {
                if (gameBoard[i][j] == gameBoard[i][j + 1] && gameBoard[i][j] != 0) {
                    gameBoard[i][j] *= 2;
                    gameBoard[i][j + 1] = 0;
                }
            }

            for (int j = 0; j < gameBoard[i].length - 1; j++) {
                for (int k = j + 1; k < gameBoard[i].length; k++) {
                    if (gameBoard[i][j] == 0 && gameBoard[i][k] != 0) {
                        gameBoard[i][j] = gameBoard[i][k];
                        gameBoard[i][k] = 0;
                        break;
                    }
                }
            }
        }
    }

    public void moveUp() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int i = 0; i < gameBoard.length - 1; i++) {
                for (int k = i + 1; k < gameBoard.length; k++) {
                    if (gameBoard[i][j] == 0 && gameBoard[k][j] != 0) {
                        gameBoard[i][j] = gameBoard[k][j];
                        gameBoard[k][j] = 0;
                        break;
                    }
                }
            }

            for (int i = 0; i < gameBoard.length - 1; i++) {
                if (gameBoard[i][j] == gameBoard[i + 1][j] && gameBoard[i][j] != 0) {
                    gameBoard[i][j] *= 2;
                    gameBoard[i + 1][j] = 0;
                }
            }

            for (int i = 0; i < gameBoard.length - 1; i++) {
                for (int k = i + 1; k < gameBoard.length; k++) {
                    if (gameBoard[i][j] == 0 && gameBoard[k][j] != 0) {
                        gameBoard[i][j] = gameBoard[k][j];
                        gameBoard[k][j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public void moveDown() {
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int i = gameBoard.length - 1; i > 0; i--) {
                for (int k = i - 1; k >= 0; k--) {
                    if (gameBoard[i][j] == 0 && gameBoard[k][j] != 0) {
                        gameBoard[i][j] = gameBoard[k][j];
                        gameBoard[k][j] = 0;
                        break;
                    }
                }
            }

            for (int i = gameBoard.length - 1; i > 0; i--) {
                if (gameBoard[i][j] == gameBoard[i - 1][j] && gameBoard[i][j] != 0) {
                    gameBoard[i][j] *= 2;
                    gameBoard[i - 1][j] = 0;
                }
            }

            for (int i = gameBoard.length - 1; i > 0; i--) {
                for (int k = i - 1; k >= 0; k--) {
                    if (gameBoard[i][j] == 0 && gameBoard[k][j] != 0) {
                        gameBoard[i][j] = gameBoard[k][j];
                        gameBoard[k][j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public void printGameBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LogicFor2048 logicFor2048 = new LogicFor2048();
        logicFor2048.printGameBoard();

        System.out.println("После движения вправо:");
        logicFor2048.moveRight();
        logicFor2048.printGameBoard();

        System.out.println("После движения влево:");
        logicFor2048.moveLeft();
        logicFor2048.printGameBoard();

        System.out.println("После движения вверх:");
        logicFor2048.moveUp();
        logicFor2048.printGameBoard();

        System.out.println("После движения вниз:");
        logicFor2048.moveDown();
        logicFor2048.printGameBoard();
    }
}