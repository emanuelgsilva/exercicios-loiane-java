package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 24/08/15.
 */

/*
 Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
 mesmo tipo e tamanho e com os elementos do vetor A multiplicados
 por 2, ou seja: B[i] = A[i] * 2
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int i;

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor A");

        for (i = 0; i < vetorA.length; i++) {

            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B");

        for (i = 0; i < vetorA.length; i++) {

            System.out.println(vetorB[i] + " ");

        }

    }
}


