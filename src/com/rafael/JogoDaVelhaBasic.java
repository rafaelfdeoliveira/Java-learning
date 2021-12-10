package com.rafael;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelhaBasic {
    public static void main (String[] args) {
        char[][] tabuleiro = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'}
        };
        printTabuleiro(tabuleiro);
        atualizarTabuleiro(1, 1, tabuleiro);
    }

    public static void printTabuleiro(char[][] tabuleiro) {
        for (char[] row: tabuleiro) {
            for (char item: row) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
//    Random random = new Random();
//    int movimento = random.nextInt(9) + 1;

    /* Jogador 1 = 'x';
    Jogador 2 = 'o';
    */
    public static void atualizarTabuleiro (int posicao, int jogador, char[][] tabuleiro) {
        char character;
        if (jogador == 1) {
            character = 'x';
        } else {
            character = 'o';
        }

        switch (posicao) {
            case 1:
                tabuleiro[0][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][4] = character;
                printTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = character;
                printTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][2] = character;
                printTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][4] = character;
                printTabuleiro(tabuleiro);
                break;
        }
    }

}
