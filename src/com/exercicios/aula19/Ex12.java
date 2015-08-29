package com.exercicios.aula19;

import java.util.Random;

/**
 * Created by mau on 28/08/15.
 */
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor
 */
public class Ex12 {

    public static void main(String[] args) {

        Random gerador = new Random();

        int [] vetorA = new int[10];
        int soma = 0;

        for(int i = 0; i < vetorA.length; i++) {

            vetorA[i] = gerador.nextInt(100);

            soma += vetorA[i];


        }

        System.out.println("A soma dos valores do vetor é: " + soma);
    }
}
