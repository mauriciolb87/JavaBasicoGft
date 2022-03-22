package com.collection.a02Exercicios_Estrutura_Repeticao;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        calc01();
    }

    public static void calc01(){

        Scanner leitor = new Scanner(System.in);

        int numero = 0, par = 0, impar = 0, count = 0;

        System.out.println("Qtd de Numeros: ");
        int qtdNumero = leitor.nextInt();

        do {
            System.out.println("Numeros: ");
            numero = leitor.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            count++;

        }while (count < qtdNumero);

        System.out.println("Qtd de Numeros : " + count);
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
    }
}
