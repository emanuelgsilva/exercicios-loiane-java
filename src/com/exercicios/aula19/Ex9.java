package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 27/08/15.
 */
/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).
*/

public class Ex9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        int i;

        System.out.println("Vetor A");

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Vetor B");

        for (i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println("Vetor C");

        for (i = 0; i < vetorC.length; i++) {

            System.out.print(vetorC[i] + ", ");
        }
    }
}
