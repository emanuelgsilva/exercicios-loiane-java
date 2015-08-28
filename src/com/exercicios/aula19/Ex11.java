package com.exercicios.aula19;

import java.util.Scanner;

/**
 * Created by mau on 27/08/15.
 */
public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        int p;
        int cont = 0;
        for(p = 0; p < vetorA.length; p++) {

            if(vetorA[p] % 2 == 0) {
                System.out.println(vetorA[p]);
                cont++;
            }
        }

        System.out.println("A quantidade de números pares no vetor é: "+cont);
    }
}
