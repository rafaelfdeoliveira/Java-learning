package com.rafael;

//import com.rafael.aula2.AreaQuadrado;
//import com.rafael.aula2.AreaTriangulo;
//import com.rafael.aula2.Avatar;
//import com.rafael.aula2.MediaNotas;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
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
//        final float dolarToReal = 5.65f;
//        final float euroToReal = 6.39f;
//        System.out.println("Insira um valor em reais: ");
//        Scanner sc = new Scanner(System.in);
//        float reais = sc.nextFloat();
//        System.out.printf(Locale.US, "Você possui %.2f dólares (USD)", reais/dolarToReal);
//        System.out.printf(Locale.US, "Você possui %.2f euros (EUR)", reais/euroToReal);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Cálculo das 4 operações básicas com dois números inteiros fornecidos.");
//        System.out.println("Insira o primeiro número:");
//        int firstNumber = sc.nextInt();
//        System.out.println("Insira o segundo número:");
//        int secondNumber = sc.nextInt();
//        int firstNumber = Integer.parseInt(args[0]);
//        int secondNumber = Integer.parseInt(args[1]);
//        System.out.printf("Soma: %d + %d = %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
//        System.out.printf("Subtração: %d - %d = %d%n", firstNumber, secondNumber, firstNumber - secondNumber);
//        System.out.printf("Multiplicação: %d X %d = %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
//        System.out.printf("Divisão: %d / %d = %.2f%n", firstNumber, secondNumber, (float) firstNumber / secondNumber);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Insira um número de 1 a 10 para ver sua tabuada:");
//        int number = sc.nextInt();
//        System.out.printf("Tabuada do %d:%n", number);
//        for (int i = 1; i < 11; i++) {
//            System.out.printf("%d X %d = %d%n", number, i, number * i);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Insira o valor da temperatura em graus Celsius:");
//        float celsius = sc.nextFloat();
//        System.out.printf("%.1fºC é igual a %.1fºF%n", celsius, celsiusToFarenheit(celsius));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe a cotação do dólar atual:");
//        final float realToDolar = sc.nextFloat();
//        System.out.println("Informe um valor em Reais:");
//        final float reais = sc.nextFloat();
//        final float dolars = reais / realToDolar;
//        System.out.printf("R$%.2f equivalem a $%.2f%n", reais, dolars);
//        final float inputReais = sc.nextFloat();
//        final String dolars = DecimalFormat.getCurrencyInstance(Locale.US).format(inputReais / realToDolar);
//        final String reais = DecimalFormat.getCurrencyInstance(Locale.forLanguageTag("pt-br")).format(inputReais);
//        System.out.printf("%s equivalem a %s%n", reais, dolars);
//        Scanner sc = new Scanner(System.in);
//        final float inchToCentimeters = 2.54f;
//        System.out.println("Informe o valor em polegadas:");
//        final float inches = sc.nextFloat();
//        final float centimeters = inches * inchToCentimeters;
//        System.out.printf("%.2f polegadas equivalem a %.2f centímetros%n", inches, centimeters);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe a idade:");
//        int idade = sc.nextInt();
//        if (idade >= 16 && idade < 18 || idade > 70) {
//            System.out.println("Se voto é opcional");
//        } else if (idade < 16) {
//            System.out.println("Não pode votar");
//        } else {
//            System.out.println("Seu voto é obrigatório");
//        }
    }

    private static float celsiusToFarenheit (float celsius) {
        return (float) (celsius * 1.8 + 32);
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