package com.collection.a02Exercicios_Estrutura_Repeticao;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        contador01();

    }

    public static void contador01(){
        Scanner leitor = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int soma = 0;

        System.out.println("Digite os números:");

        for (int i = 0; i < 5; i++) {
            numero = leitor.nextInt();
            if(numero > maior) maior = numero;
            soma = soma + numero;
        }

        int media = soma / 5;
        System.out.println("O maior numero digitado é: "+maior);
        System.out.println("A media do numero digitado é: "+media);
    }

    public static void contador02(){
        Scanner leitor = new Scanner(System.in);

        int numero = 0;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numeros: ");
            numero = leitor.nextInt();
            count++;
            if(numero > maior) maior = numero;
            soma = soma + numero;
        }while (count < 5);

        int media = soma / 5;
        System.out.println("O maior numero digitado é: "+maior);
        System.out.println("A media do numero digitado é: "+media);
    }
}
