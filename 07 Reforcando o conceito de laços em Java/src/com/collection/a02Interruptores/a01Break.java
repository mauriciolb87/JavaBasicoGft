package com.collection.a02Interruptores;

public class a01Break {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                if (i == 12){
                break;
              }
            }
        }

        System.out.println("++++++++++++++++++++++");

        int contator = 0;
        while (contator < 15){
            if (contator % 2 == 0){
                System.out.println(contator);
                if (contator == 12){
                    break;
                }
            }
            contator++;
        }
    }
}
