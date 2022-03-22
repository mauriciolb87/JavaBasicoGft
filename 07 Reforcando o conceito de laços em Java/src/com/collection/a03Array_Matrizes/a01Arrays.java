package com.collection.a03Array_Matrizes;

public class a01Arrays {

    public static void main(String[] args) {

        int[] meuVetor     = new int[4];
        int   meuVetor2[]  = new int[4];
        // Declarando e inicializando
        int vetor3[] = new int[] {1, 2, 3};
        // Compacto
        int vetor[]  = {1, 3, 4};
        int vetor2[] = {2, 3, 5};

        meuVetor = new int[]{2, 4, 5, 3, 4};

        int[] idades = new int[]{12, 33, 42, 45, 23, 45};
        for (int idade:idades) {
            System.out.println(idade);
        }
        System.out.println("++++++++++++++");
        for (int i = 0; i < idades.length; i++) {
            int idade = idades[i];
            System.out.println(idade);
        }
    }
}
