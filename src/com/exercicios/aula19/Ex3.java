package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 24/08/15.
 */

/*
 Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 ser o quadrado do respectivo elemento de A, ou seja:
 B[i] = A[i] * A[I]
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        int i;

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
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
