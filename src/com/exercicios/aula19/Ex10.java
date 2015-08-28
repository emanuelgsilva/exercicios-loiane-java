package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 27/08/15.
 */

/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] = A[i] % 2.

 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];


        int i;

        System.out.println("Vetor A");

        for (i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println("Vetor B");

        for (i = 0; i < vetorB.length; i++) {

            System.out.print(vetorB[i] + ", ");
        }
    }
}
