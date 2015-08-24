package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 24/08/15.
 */

/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i
 */
public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        int i;

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
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
