package com.collection.a01Visao_Geral;

public class a04Arrays {

    public static void main(String[] args) {

        //Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Array: " + cars[0]);

        //Loop Through an Array Lista tudo
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Lista todos no Array: " + cars[i]);
        }

        // Multi-Dimensional Arrays

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println("Multi-Dimensional Arrays: " + x); // Outputs 7

        // Lista todos Arrays Multi-Dimensional
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
