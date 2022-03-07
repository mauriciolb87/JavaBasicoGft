package com.exemplo.a01Criacao;

public class Main {
    public static void main(String[] args) {


        // Calculadora
        System.out.println("Exercício calculadora");
        Exercicio01Calculadora.Calculadora(12, 2, "+");

        // Mensagem
        System.out.println("Exercício mensagem");
        Exercicio02Mensagem.obterMensagem(9);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Exercicio03Emprestimo.calcular(1000, Exercicio03Emprestimo.getDuasParcelas());
    }
}
