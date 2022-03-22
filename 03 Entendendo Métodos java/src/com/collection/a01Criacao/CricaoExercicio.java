package com.collection.a01Criacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CricaoExercicio {

    public static void main(String[] args) {

       // calculadora();

        chamadaDia();

    }

    public static void calculadora(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o operador(Soma = +, Subtração = -, Divisao = /, Multiplicação = *): ");
        String operador = scan.next();

        int resultado = 0;

        if(operador.equals("+")){
            System.out.println( "Soma = " + (resultado = num1 + num2));
        }else if(operador.equals("-")){
            System.out.println( "Subtração = " + (resultado = num1 - num2));
        }else if(operador.equals("/")){
            System.out.println("Divisao = " + (resultado = num1 / num2));
        }else if(operador.equals("*")){
            System.out.println( "Multiplicação = " + (resultado = num1 * num2));
        }


    }

    public static void chamadaDia(){

        Date dataHoraAtual = new Date();
        int horas = dataHoraAtual.getHours();
        String horaAtual = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        if (horas >= 8){
            System.out.println("Bom dia");
        }else if (horas >= 12){
            System.out.println("Boa Tarde");
        }if (horas >= 20){
            System.out.println("Boa Noita");
        }
        System.out.println(horaAtual);


    }

    public static void taxaEmprestimo(){

        double valorEmprestimo;
        double numParcelas;
        double taxaJuros;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite valor do emprestimo: ");
        valorEmprestimo = scan.nextDouble();

        System.out.println("Digite o numero de parcelas: ");
        numParcelas = scan.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        taxaJuros = scan.nextDouble();

        double resultado = (valorEmprestimo * numParcelas) * taxaJuros;
    }

}

