package com.rafael;

import java.util.Scanner;

public class Turno {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em que turno voce estuda? (Insira M para matutino, V para vespertino ou N para noturno)");
        char turno = sc.next().charAt(0);
        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}
