package com.rafael;

import com.rafael.aula2.AreaQuadrado;
import com.rafael.aula2.AreaTriangulo;
import com.rafael.aula2.Avatar;
import com.rafael.aula2.MediaNotas;

import java.util.Arrays;

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
        int areaQuadrado = AreaQuadrado.calcularArea(3);
        System.out.println(areaQuadrado);
        float media = MediaNotas.calcularMedia(1, 3, 5);
        System.out.println(media);
        float areaTriangulo = AreaTriangulo.calcularArea(4, 3);
        System.out.println(areaTriangulo);
        System.out.println(Arrays.toString(Avatar.values()));
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