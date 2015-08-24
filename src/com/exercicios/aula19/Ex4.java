package com.exercicios.aula19;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by mau on 24/08/15.
 */

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i])
 */
public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        int i;

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
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
