package com.collection.a01Criacao;

public class Exercicio01Calculadora {

    public static void Calculadora(double valor1, double valor2, String operador){

        double resultado;

        if(operador.equals("+")) {
            System.out.println("A Soma de: " + valor1 + " + " + valor2 + " = " + (resultado = valor1 + valor2));
        }else if(operador.equals("-")) {
            System.out.println("A subtração de: " + valor1 + " - " + valor2 + " = " + (resultado = valor1 - valor2));
        }else if(operador.equals("/")) {
            System.out.println("A Divisão de: " + valor1 + " / " + valor2 + " = " + (resultado = valor1 / valor2));
        }else if(operador.equals("*")) {
            System.out.println("A Multiplicação de: " + valor1 + " * " + valor2 + " = " + (resultado = valor1 * valor2));
        }
    }

}
