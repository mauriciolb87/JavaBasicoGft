package com.exemplo.a03Exercicio_Arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {

        exer01();
        //exer02();
    }

    private static void exer01() {

        Integer[] numero = new Integer[20];
        Random gerador = new Random();
        int count = 0;

        do {
            int num = gerador.nextInt(101);

            numero[count] = num;
            count++;

        }while ( count < numero.length);

        for (int num : numero  ) {

             System.out.println("Numero:" + num + " Antecessor:" + (num - 1) + " Sucessores : " + (num + 1)  );
        }
    }

    public static void exer02(){

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println("\nSucessores dos Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.println((numero +1) + " ");
        }
        System.out.println("\nAntecessor dos Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.println((numero -1) + " ");
        }
    }
}
