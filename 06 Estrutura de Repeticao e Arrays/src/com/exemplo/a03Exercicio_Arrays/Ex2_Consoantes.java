package com.exemplo.a03Exercicio_Arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/


import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] caracterCon = new String[6];
        String[] caracterVol = new String[6];
        int qtdConsoantes = 0;
        int qtdVogais = 0;
        int count = 0;

        do {
            System.out.print("Letra: " );
            String letra = scan.next();

            if (letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") )
            {
                caracterVol[count] = letra;
                qtdVogais++;
            }else {
                caracterCon[count] = letra;
                qtdConsoantes++;
            }

            count++;
        }while ( count < caracterCon.length);

        for (String caracters : caracterCon  ) {
            if (caracters != null) {
                System.out.println("Consoantes:" + caracters);
            }
        }
        for (String caracters : caracterVol  ) {
            if (caracters != null) {
                System.out.println("Vogais:" + caracters);
            }
        }

    }
}
