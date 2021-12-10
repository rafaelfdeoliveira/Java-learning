package com.rafael;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main (String[] args) {
        char[][] board = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'}
        };
        boolean TwoPlayersGame = isTwoPlayersGame();
        int firstPlayer = getFirstPlayer();
        int secondPlayer = getSecondPlayer(firstPlayer);
        int currentPlayer = getStartingPlayer();
        boolean gameOver = false;
        System.out.println("The Game begins");
        printBoard(board);
        while (!gameOver) {
            if (firstPlayer == currentPlayer) requestPlayerMove(firstPlayer, board);
            else if (TwoPlayersGame) requestPlayerMove(secondPlayer, board);
            else performBotMove(secondPlayer, board);
            currentPlayer = changeCurrentPlayer(currentPlayer);
            gameOver = isGameOver(board);
        }
    }

    static Scanner sc = new Scanner(System.in);

    static boolean isTwoPlayersGame () {
        while (true) {
            System.out.print("Are you playing against another Human player? (y or n): ");
            char answer = sc.next().charAt(0);
            if (answer == 'y' || answer == 'Y') return true;
            if (answer == 'n' || answer == 'N') return false;
            System.out.println("Invalid answer");
        }
    }

    static int getFirstPlayer () {
        while (true) {
            System.out.print("Choose your player (X or O): ");
            char playerSymbol = sc.next().charAt(0);
            if (playerSymbol == 'X' || playerSymbol == 'x') return 1;
            if (playerSymbol == 'O' || playerSymbol == 'o') return 2;
            System.out.println("Invalid answer");
        }
    }

    static int getSecondPlayer (int firstPlayer) {
        if (firstPlayer == 1) return 2;
        return 1;
    }

    static int getStartingPlayer () {
        while (true) {
            System.out.print("Who starts the game? (X or O): ");
            char firstPlayerSymbol = sc.next().charAt(0);
            if (firstPlayerSymbol == 'X' || firstPlayerSymbol == 'x') return 1;
            if (firstPlayerSymbol == 'O' || firstPlayerSymbol == 'o') return 2;
            System.out.println("Invalid answer");
        }
    }

    static void printBoard (char[][] board) {
        for (char[] row : board) {
            for (char spot : row) {
                System.out.print(spot);
            }
            System.out.println();
        }
    }

    // Check if the given position is valid and available (empty) returning true or false. If it is valid, it claims this position for the given player
    static boolean updateBoard (int player, int position, char[][] board) {
        char playerSymbol;
        if (player == 1) playerSymbol = 'X';
        else playerSymbol = 'O';
        switch (position) {
            case 1:
                if (board[0][0] != '_') return false;
                board[0][0] = playerSymbol;
                break;
            case 2:
                if (board[0][2] != '_') return false;
                board[0][2] = playerSymbol;
                break;
            case 3:
                if (board[0][4] != '_') return false;
                board[0][4] = playerSymbol;
                break;
            case 4:
                if (board[1][0] != '_') return false;
                board[1][0] = playerSymbol;
                break;
            case 5:
                if (board[1][2] != '_') return false;
                board[1][2] = playerSymbol;
                break;
            case 6:
                if (board[1][4] != '_') return false;
                board[1][4] = playerSymbol;
                break;
            case 7:
                if (board[2][0] != '_') return false;
                board[2][0] = playerSymbol;
                break;
            case 8:
                if (board[2][2] != '_') return false;
                board[2][2] = playerSymbol;
                break;
            case 9:
                if (board[2][4] != '_') return false;
                board[2][4] = playerSymbol;
                break;
            default:
                return false;
        }
        printBoard(board);
        return true;
    }

    static void requestPlayerMove (int humanPlayer, char[][] board) {
        char playerSymbol;
        if (humanPlayer == 1) playerSymbol = 'X';
        else playerSymbol = 'O';
        while (true) {
            System.out.printf("Player %c choose a spot to claim (Insert a number from 1 to 9): ", playerSymbol);
            String response = sc.next();
            try {
                int playerMove = Integer.parseInt(response);
                boolean success = updateBoard(humanPlayer, playerMove, board);
                if (success) break;
                System.out.println("Invalid or unavailable spot");
            } catch (Exception err) {
                System.out.println("Invalid answer");
            }
        }
    }

    // Adopts a good strategy to choose the bot move if the bot is starting the game, or if it is in an immediate risk of losing the game, or if it has an immediate opportunity to win the game. Otherwise, the bot randomly chooses an available spot to perform a move.
    static void performBotMove (int botPlayer, char[][] board) {
        System.out.println("Bot turn:");
        Random random = new Random();
        int botMove;
        if (isStartingBoardState(board)) {
            int[] goodStartingMoves = {1, 3, 7, 9};
            botMove = goodStartingMoves[random.nextInt(4)];
            updateBoard(botPlayer, botMove, board);
            return;
        }
        botMove = getBestMove(botPlayer, board);
        if (botMove != 0) {
            updateBoard(botPlayer, botMove, board);
            return;
        }
        boolean success = false;
        while (!success) {
            botMove = random.nextInt(9) + 1;
            success = updateBoard(botPlayer, botMove, board);
        }
    }

    static boolean isStartingBoardState (char[][] board) {
        for (char[] row : board) {
            for (int j = 0; j < row.length; j += 2) {
                if (row[j] != '_') return false;
            }
        }
        return true;
    }

    // Return the move to win immediately if there is such opportunity, or the move to avoid losing immediately if there is such risk, or 0 otherwise.
    static int getBestMove (int botPlayer, char[][] board) {
        char botSymbol;
        if (botPlayer == 1) botSymbol = 'X';
        else botSymbol = 'O';
        int bestMoveToWin = getBestMoveToWin(botSymbol, board);
        if (bestMoveToWin != 0) return bestMoveToWin;
        char opponentSymbol;
        if (botPlayer == 1) opponentSymbol = 'O';
        else opponentSymbol = 'X';
        return getBestMoveToWin(opponentSymbol, board);
    }

    // Return the best move for the player of the given symbol to win immediately (the same move for the other opponent to avoid losing immediately). If there is no immediate opportunity, it returns 0
    static int getBestMoveToWin (char symbol, char[][] board) {
        // Check if the player can win by filling a row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == '_' && board[i][2] == symbol && board[i][4] == symbol) return 1 + 3*i;
            if (board[i][0] == symbol && board[i][2] == '_' && board[i][4] == symbol) return 2 + 3*i;
            if (board[i][0] == symbol && board[i][2] == symbol && board[i][4] == '_') return 3 + 3*i;
        }
        // Check if the player can win by filling a column
        for (int j = 0; j < board[0].length; j += 2) {
            if (board[0][j] == '_' && board[1][j] == symbol && board[2][j] == symbol) return 1 + j/2;
            if (board[0][j] == symbol && board[1][j] == '_' && board[2][j] == symbol) return 4 + j/2;
            if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == '_') return 7 + j/2;
        }
        // Check if the player can win by filling a diagonal
        if (board[0][0] == '_' && board[1][2] == symbol && board[2][4] == symbol) return 1;
        if (board[0][0] == symbol && board[1][2] == '_' && board[2][4] == symbol) return 5;
        if (board[0][0] == symbol && board[1][2] == symbol && board[2][4] == '_') return 9;
        if (board[0][4] == '_' && board[1][2] == symbol && board[2][0] == symbol) return 3;
        if (board[0][4] == symbol && board[1][2] == '_' && board[2][0] == symbol) return 5;
        if (board[0][4] == symbol && board[1][2] == symbol && board[2][0] == '_') return 7;
        // Return 0 if there is no immediate opportunity to win
        return 0;
    }

    static int changeCurrentPlayer (int currentPlayer) {
        if (currentPlayer == 1) return 2;
        return 1;
    }

    static boolean isGameOver (char[][] board) {
        for (char[] row : board) {
            if (row[0] != '_' && row[0] == row[2] && row[0] == row[4]) {
                System.out.printf("%c player won. Game over!", row[0]);
                return true;
            }
        }
        for (int j = 0; j < board[0].length; j += 2) {
            if (board[0][j] != '_' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                System.out.printf("%c player won. Game over!", board[0][j]);
                return true;
            }
        }
        if (board[1][2] != '_' && ((board[0][0] == board[1][2] && board[0][0] == board[2][4]) || (board[0][4] == board[1][2] && board[0][4] == board[2][0]))) {
            System.out.printf("%c player won. Game over!", board[1][2]);
            return true;
        }
        for (char[] row : board) {
            for (int j = 0; j < row.length; j += 2) {
                if (row[j] == '_') return false;
            }
        }
        System.out.println("It is a draw. Game over!");
        return true;
    }
}
