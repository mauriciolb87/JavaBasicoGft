package com.exemplo.a02Exercicios_Estrutura_Repeticao;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        tabuada01();
    }

    public static void tabuada01(){
        Scanner leitor = new Scanner(System.in);

        int result = 0;

        System.out.print("Digite a tabuada: ");
        int valor = leitor.nextInt();

        for (int i = 0; i < 11; i++) {
            result =  valor * i;
            System.out.println(valor + " x " + i + " = " + result);
        }

    }
}
