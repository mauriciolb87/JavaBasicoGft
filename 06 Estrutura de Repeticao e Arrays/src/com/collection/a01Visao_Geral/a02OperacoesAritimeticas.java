package com.collection.a01Visao_Geral;

public class a02OperacoesAritimeticas {

    public static void main(String[] args) {

        int rest = 10;

        int soma = 20;
        System.out.println("Operação de soma: " + (soma += rest));

        int subtracao = 20;
        System.out.println("Operação de subtracao: " + (subtracao -= rest));

        int multiplicacao = 20;
        System.out.println("Operação de multiplicacao: " + (multiplicacao *= rest));

        int divisao = 20;
        System.out.println("Operação de divisao: " + (divisao /= rest));
    }
}
