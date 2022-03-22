package com.collection.a02Exercicios_Estrutura_Repeticao;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        int nota = leitor.nextInt();

        while (nota <0 | nota > 10){
            System.out.print("Nota invalida! Digite uma nota: ");
            nota = leitor.nextInt();
        }

    }
}
