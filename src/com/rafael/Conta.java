package com.rafael;

import java.util.Scanner;

public class Conta {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos estao na sua conta?");
        int numberOfProducts = sc.nextInt();
        float total = 0;
        for (int i = 1; i < numberOfProducts + 1; i++) {
            System.out.printf("Insira o valor do produto %d:%n", i);
            total += sc.nextFloat();
        }
        System.out.printf("O total da sua conta e de %.2f reais%n", total);
    }
}
