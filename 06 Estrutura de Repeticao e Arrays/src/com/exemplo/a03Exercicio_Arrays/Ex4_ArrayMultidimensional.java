package com.exemplo.a03Exercicio_Arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {

        exer01();
    }

    private static void exer01() {

        int[][] numero = new int[4][4];
        Random gerador = new Random();
        int count = 0;

        for (int i = 0; i < numero.length; i++){
            for (int j = 0; j < numero[i].length; j++){
                numero[i][j] = gerador.nextInt(9);
            }
        }

        // percorre a matriz
        for (int[] linha : numero  ) {
            for (int coluna : linha  ){
                System.out.print(coluna + " " );
            }
            System.out.println();
        }
    }
}
