package com.collection.a01Lists.exercicios;

import java.util.ArrayList;
import java.util.List;

public class a01 {

    public static void main(String[] args) {

        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        List<Double> notas2 = new ArrayList<>(notas);
        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.remove(0));
        System.out.println(notas2.get(0));

    }

}
