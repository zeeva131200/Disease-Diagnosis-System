/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static int playerScore = 0;
    private static int computerScore = 0;
    static Scanner s = new Scanner(System.in);
   
    public static void input() {
        String ans = "Y";
        char[][] gameBoard = {{'1', '|', '2', '|', '3'},
        {'-', '+', '-', '+', '-'},
        {'4', '|', '5', '|', '6'},
        {'-', '+', '-', '+', '-'},
        {'7', '|', '8', '|', '9'}};
        System.out.println("            Welcome to Tic Tac Toe");
        System.out.print("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("");
        printGameBoard(gameBoard);
        boolean gameOver = false;
        boolean playAgain = true;
        while (playAgain) {
            while (!gameOver) {
                playerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }
                computerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }
            }
            System.out.println(name + "'s Score: " + playerScore);
            System.out.println("Computer's Score: " + computerScore);
            System.out.println("Would you like to continue playing?(Enter Y for yes, N for no)");
            s.nextLine();
            ans = s.nextLine();
            if (ans.equalsIgnoreCase("y")) {
                playAgain = true;
                System.out.println("Great. Let's play again!");
                resetBoard(gameBoard);
                gameOver = false;
                printGameBoard(gameBoard);

            } else if (ans.equalsIgnoreCase("n")) {
                playAgain = false;
                System.out.println("Thanks for playing. Hope to see you again " + name + "!");
                System.out.println("Your total score is: " + playerScore);
                if (playerScore >= 1 && playerScore < 200) {
                    System.out.println("Congratulations! You have won a voucher.");
                    System.out.println("Your voucher code is DISCOUNT5");
                } else if (playerScore >= 200) {
                    System.out.println("Congratulations! You have won a voucher.");
                    System.out.println("Your voucher code is DISCOUNT10");
                } else {
                    System.out.println("I'm sorry. You have no vouchers to redeem:(");
                }

            } else {
                System.out.println("Please enter a valid answer.");
            }

        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        //print out entire row followed by a line
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static void placePiece(char[][] gameBoard, int position, int player) {
        char symbol;
        if (player == 1) {
            symbol = 'X';

        } else {
            symbol = 'O';

        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                printGameBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = symbol;
                printGameBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = symbol;
                printGameBoard(gameBoard);
                break;
            case 4:
                gameBoard[2][0] = symbol;
                printGameBoard(gameBoard);
                break;
            case 5:
                gameBoard[2][2] = symbol;
                printGameBoard(gameBoard);
                break;
            case 6:
                gameBoard[2][4] = symbol;
                printGameBoard(gameBoard);
                break;
            case 7:
                gameBoard[4][0] = symbol;
                printGameBoard(gameBoard);
                break;
            case 8:
                gameBoard[4][2] = symbol;
                printGameBoard(gameBoard);
                break;
            case 9:
                gameBoard[4][4] = symbol;
                printGameBoard(gameBoard);
                break;
            default:
                break;
        }
    }

    public static void playerMove(char[][] gameBoard) {
        //Scanner s=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 9");
        int move = s.nextInt();
        boolean result = isValidMove(move, gameBoard);
        while (!result) {
            System.out.println("Sorry! This position is taken. Try again!");
            move = s.nextInt();
            result = isValidMove(move, gameBoard);
        }
        System.out.println("Player moved at position " + move);
        placePiece(gameBoard, move, 1);
    }

    public static void computerMove(char[][] gameBoard) {
        Random r = new Random();
        int move = r.nextInt(9) + 1;
        boolean result = isValidMove(move, gameBoard);
        while (!result) {
            System.out.println("Sorry! This position is taken. Try again!");
            move = r.nextInt(9) + 1;
            result = isValidMove(move, gameBoard);
        }
        System.out.println("Computer moved at position " + move);
        placePiece(gameBoard, move, 2);
    }

    public static boolean isValidMove(int move, char[][] gameBoard) {
        switch (move) {
            case 1:
                if (gameBoard[0][0] == '1') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameBoard[0][2] == '2') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (gameBoard[0][4] == '3') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (gameBoard[2][0] == '4') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameBoard[2][2] == '5') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameBoard[2][4] == '6') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameBoard[4][0] == '7') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameBoard[4][2] == '8') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameBoard[4][4] == '9') {
                    return true;
                } else {
                    return false;

                }
            default:
                return false;
        }

    }

    public static boolean isGameOver(char[][] gameBoard) {
        //Horizontal wins
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        //Verical wins
        if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        //Diagonal wins
        if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') {
            System.out.println("Player Wins!");
            playerScore += 10;
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O') {
            System.out.println("Computer Wins!");
            computerScore += 10;
            return true;
        }
        if (gameBoard[0][0] != '1' && gameBoard[0][2] != '2' && gameBoard[0][4] != '3'
                && gameBoard[2][0] != '4' && gameBoard[2][2] != '5' && gameBoard[2][4] != '6'
                && gameBoard[4][0] != '7' && gameBoard[4][2] != '8' && gameBoard[4][4] != '9') {
            System.out.println("It's a tie!");
            return true;
        }
        return false;

    }

    public static void resetBoard(char[][] gameBoard) {
        gameBoard[0][0] = '1';
        gameBoard[0][2] = '2';
        gameBoard[0][4] = '3';
        gameBoard[2][0] = '4';
        gameBoard[2][2] = '5';
        gameBoard[2][4] = '6';
        gameBoard[4][0] = '7';
        gameBoard[4][2] = '8';
        gameBoard[4][4] = '9';
    }
}

