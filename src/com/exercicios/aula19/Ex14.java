package com.exercicios.aula19;

import java.util.Random;

/**
 * Created by mau on 28/08/15.
 */
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
*/
public class Ex14 {

    public static void main(String[] args) {

        Random gerador = new Random();

        int [] vetorA = new int[10];
        int soma = 0;
        int cont = 0;

        for(int i = 0; i < vetorA.length; i++) {

            vetorA[i] = gerador.nextInt(100);

            if(vetorA[i] % 2 > 0) {
                soma += vetorA[i];

                cont++;

                System.out.println("Números ímpares: " + vetorA[i]);
            }
        }

        for(int i = 0; i < vetorA.length; i++) {

            System.out.println("Todos os números do vetor: "+vetorA[i]);
        }


        System.out.println("A média aritmética dos números ímpares é: "+soma/cont);
    }
}
