package com.rafael;

import java.util.Scanner;

public class MaisBarato {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] prices = new float[3];
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Qual o preco do produto %d?%n", i + 1);
            prices[i] = sc.nextFloat();
        }
        float minPrice = prices[0];
        int cheapestProduct = 1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                cheapestProduct = i + 1;
            }
        }
        System.out.printf("Voce deve comprar o produto %d por ser o mais barato com o preco de %.2f reais%n", cheapestProduct, minPrice);
    }
}
