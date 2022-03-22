package com.collection.a03Retorno;

public class Main {

    public static void main(String[] args) {

        //  Retornos

        System.out.println("Exercicios de Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println(" Area do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println(" Area do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9 );
        System.out.println(" Area do Quadrilatero: " + areaTrapezio);

    }
}
