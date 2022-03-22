package com.collection.a01Loops;

public class a02While {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("while");
        while (i < 6) {
            System.out.println("while");

            // update expression
            i++;
        }

        System.out.println("Do while");
        do {
            System.out.println("Do while");
            i++;
        }while (i < 6);
    }
}
