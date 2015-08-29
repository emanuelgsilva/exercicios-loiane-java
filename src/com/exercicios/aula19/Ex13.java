package com.exercicios.aula19;

import java.util.Random;

/**
 * Created by mau on 28/08/15.
 */
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
*/
public class Ex13 {

    public static void main(String[] args) {

        Random gerador = new Random();

        int [] vetorA = new int[10];
        int soma = 0;

        for(int i = 0; i < vetorA.length; i++) {

            vetorA[i] = gerador.nextInt(100);

            if(vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }

        System.out.println("A soma dos valores do vetor é: " + soma);
    }
}
