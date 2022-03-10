package com.exemplo.a02Exercicios_Estrutura_Repeticao;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String aluno;
        int idade;

        do {
            System.out.print("Nome do aluno: ");
            aluno = leitor.next();

            if (aluno.equals("0"))break;

            System.out.print("Idade do aluno: ");
            idade = leitor.nextInt();
        }while (true);

        System.out.println("Programa Finalizado");
    }
}
