package com.collection.a03Exercicio_Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

import java.util.Scanner;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {


    }

    public static void num01(){
        Scanner scan = new Scanner(System.in);

        int num[] = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.print("Numero: " );
            num[i] = scan.nextInt();
        }

        for(int i = num.length-1;i>=0;i--){
            System.out.println("Inverso: " + num[i]);
        }
    }

    public static void num02(){
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}
