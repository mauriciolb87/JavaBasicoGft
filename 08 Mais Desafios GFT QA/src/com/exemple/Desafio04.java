package com.exemple;

import java.util.Scanner;

/*
* Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

 */
public class Desafio04 {

    public static void main(String[] args) {

   //forma01();
        forma02(); // correto

}

    private static void forma02() {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = n ; i >= 1 ; i--) {
            if (n % i == 0) {
                System.out.println(    (n / i)   );
            }
        }
        System.out.println(        );
    }

    private static void forma01() {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1;  n >= i ; i++) {
            if (n % i == 0) {
                System.out.println(    (n / i)   );
            }
        }
        System.out.println(        );
    }
}

