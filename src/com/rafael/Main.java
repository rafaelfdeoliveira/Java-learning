package com.rafael;

import com.rafael.aula2.AreaQuadrado;
import com.rafael.aula2.AreaTriangulo;
import com.rafael.aula2.Avatar;
import com.rafael.aula2.MediaNotas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int num = 2;
//        int num1;
//        num1 = 3;
//        String name = "Gabriela";
//        boolean verificacao;
//        verificacao = true;
//        float nota = 7.0f;
//        float pi = (float) Math.PI;
//        DiasDaSemana aula = DiasDaSemana.segunda;
//        MesesDoAno month = MesesDoAno.Fevereiro;
//        System.out.println(aula);
//        System.out.println(month);
//        System.out.println(MesesDoAno.Janeiro.values());
//        System.out.println("Número = " + num);
//        System.out.println(pi);
//        int areaQuadrado = AreaQuadrado.calcularArea(3);
//        System.out.println(areaQuadrado);
//        float media = MediaNotas.calcularMedia(1, 3, 5);
//        System.out.println(media);
//        float areaTriangulo = AreaTriangulo.calcularArea(4, 3);
//        System.out.println(areaTriangulo);
//        System.out.println(Arrays.toString(Avatar.values()));
//        boolean par = 4 % 2 == 0;
//        String name = "Gabriela";
//        int idade = 23;
//        float altura = 1.70f;
//        System.out.printf("Meu nome é %s, tenho %d e minha altura é %.2f%n", name, idade, altura);
//        String name = "Rafael";
//        byte age = 30;
//        float high = 1.86f;
//        System.out.printf("Meu nome é %s, tenho %d anos e minha altura é %.2f metros.%n", name, age, high);
//        System.out.printf("Hello, %s and %s.%n", args[0], args[1]);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe o nome: ");
//        String name = sc.nextLine();
////        sc.next() pega só a primeira palavra inserida. sc.nextLine() pega a linha toda inserida.
//        System.out.printf("O nome informado foi %s%n", name);
//        System.out.println("Informe um valor para o byte: ");
//        byte b = sc.nextByte();
//        System.out.println("O valor informado foi " + b);
        final float dolarToReal = 5.65f;
        final float euroToReal = 6.39f;
        System.out.println("Insira um valor em reais: ");
        Scanner sc = new Scanner(System.in);
        float reais = sc.nextFloat();
        System.out.printf("Você possui %.2f dólares (USD)", reais/dolarToReal);
        System.out.printf("Você possui %.2f euros (EUR)", reais/euroToReal);
    }
}

enum DiasDaSemana {
    segunda, terca, quarta, quinta, sexta, sabado, domingo
}

enum MesesDoAno {
    Janeiro(1), Fevereiro(2);
    public int mes;
    MesesDoAno (int valor) {
        mes = valor;
    }
}

//enum FormasDePagamento {
//    DINHEIRO(1), CREDITO(2);
//}