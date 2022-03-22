package com.collection.a01Loops;

public class a01For {
    public static void main(String[] args) {

        System.out.println("For classico");
        for (int i = 0; i < 10; i++){
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("For invertido");
        for (int i = 10; i > 0; i--){
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("For each");
        /*
        for (type var : array)
        {
            statements using var;
        }
        */

    }
}
