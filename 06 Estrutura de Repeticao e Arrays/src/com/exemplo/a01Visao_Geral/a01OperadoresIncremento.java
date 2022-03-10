package com.exemplo.a01Visao_Geral;

public class a01OperadoresIncremento {

    public static void main(String[] args) {

        // ------------------Pre Fixados
        // Somar uma unidade ao valor da variavel
        int numero01 = 0;
        System.out.println("Pre Fixados: " + ++numero01 + " Resultado " + numero01);
        // Subtrair uma unidade ao valor da variavel
        int numero02 = 0;
        System.out.println("Pre Fixados: " + --numero02 + " Resultado " + numero02);

        //------------------ Pos Fixados
        // Somar um ao valor da variavel, retornando o valor original
        int numero03 = 0;
        System.out.println("Pos Fixados: " + numero03++ + " Resultado " + numero03);
        // Subtrair um ao valor da variavel, retornando o valor original
        int numero04 = 0;
        System.out.println("Pos Fixados: " + numero04-- + " Resultado " + numero04);

    }

}
