package com.rafael;

//import com.rafael.aula2.AreaQuadrado;
//import com.rafael.aula2.AreaTriangulo;
//import com.rafael.aula2.Avatar;
//import com.rafael.aula2.MediaNotas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
//        int listInteiros[] = new int[3];
//        int[] listInteiros = new int[3];
//        System.out.println(Arrays.toString(listInteiros));
//        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
//        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
//        System.out.println(copyTo);
//        int[] listInteiros = new int[10];
//        listInteiros[0] = 14;
//        listInteiros[1] = 20;
//        listInteiros[2] = 7;
//        int[] newList = new int[0];
//        for (int i = 0; i < listInteiros.length; i++) {
//            if (listInteiros[i] > 0) {
//                newList = Arrays.copyOfRange(listInteiros, 0, i + 1);
//                System.out.println("O número na posição " + i + " do array é: " + listInteiros[i]);
//            }
//        }
//        System.out.println(Arrays.toString(newList));
//        boolean flag;
//        Boolean outraFlag;
//        double[] arrayDouble = new double[5];
//        arrayDouble[0] = 5.0;
//        arrayDouble[1] = 7.0;
//        System.out.println(Arrays.toString(arrayDouble));
//        String[] arrayString = new String[5];
//        arrayString[0]= "Gabriela";
//        System.out.println(Arrays.toString(arrayString));
//          double[][] notasAlunos = new double[3][4];
//        notasAlunos[0][0] = 8;
//        notasAlunos[0][1] = 9;
//        notasAlunos[0][2] = 10;
//        notasAlunos[0][3] = 8;
//        for (int i = 0; i < notasAlunos.length; i++) {
//            for (int j=0; j < notasAlunos[i].length; j++) {
//                if (notasAlunos[i][j] > 0.0) {
//                    System.out.println(notasAlunos[i][j]);
//                }
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        String[] dataString = new String[5];
//        for (int i = 0; i < dataString.length; i++) {
//            System.out.print("Digite nome do aluno: ");
//            dataString[i] = sc.nextLine();
//        }
//        for (int i = 0; i < dataString.length; i++) {
//            System.out.println(dataString[i]);
//        }
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Vendedor Joao";
        vendedor.baterPonto();
        Diretor diretor = new Diretor(1);
        System.out.println(diretor.matricula);
        diretor.nome = "Diretor Marcio";
        diretor.baterPonto();
    }

    private static float celsiusToFarenheit (float celsius) {
        return (float) (celsius * 1.8 + 32);
    }
}

//class Vendedor implements Funcionario {
//    //quantidade (quantidade não pode ser menor que 0)
//    // implements significa que Vendedor é um Funcionario. Vendedor deve implememtar os métodos indicados pela interface Funcionario (como troca) com o decorator @Override
//    @Override
//    public boolean troca() {
//        return false;
//    }
//}
//interface Funcionario {
//    boolean troca();
//}

//Herança:
//Toda class já extends Object por default (Toda class tem um pai)
@ToString
@Setter
@Getter
class Funcionario {
    long matricula;
    String nome;
    String cpf;
    public void baterPonto() {
        System.out.println(this.nome + " batendo ponto...");
    }
}
class Vendedor extends Funcionario {
    public void baterPonto() {
        System.out.println(this.nome + " batendo ponto como vendedor...");
    }
}
class Diretor extends Funcionario {
    //Constructor: Torna obrigatório passar os argumentos do constructor para inicializar a class
    public Diretor (long matricula) {
        this.matricula = matricula;
    }
}

// abstract class é um modelo de class que não pode ser instanciado diretamente
//abstract class Funcionario {
//
//}

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