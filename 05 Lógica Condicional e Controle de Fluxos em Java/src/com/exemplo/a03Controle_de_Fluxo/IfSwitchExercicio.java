package com.exemplo.a03Controle_de_Fluxo;

import java.util.Scanner;

public class IfSwitchExercicio {

    public static void main(String[] args) {


       // ifElse();
       // switchCase();
        switchCase2();

    }

    public static void ifElse( ){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o mes: ");
        int mes = scan.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");
        }else if(mes == 7){
            System.out.println("Julho");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Setembro");
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");
        }else if(mes == 12){
            System.out.println("Dezembro");
        }

        if (mes == 6 || mes == 12 || mes == 1){
            System.out.println(" Ferias ");
        }
    }

    public static void switchCase(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva a Semana: ");
        String diaSemana = scan.next();

        switch (diaSemana){
            case "Domingo": System.out.println("Dia da semana 1"); break;
            case "Segunda": System.out.println("Dia da semana 2"); break;
            case "Terça":   System.out.println("Dia da semana 3"); break;
            case "Quarta":  System.out.println("Dia da semana 4"); break;
            case "Quinta":  System.out.println("Dia da semana 5"); break;
            case "Sexta":   System.out.println("Dia da semana 6"); break;
            case "Sabado":  System.out.println("Dia da semana 7"); break;

            default:
                System.out.println("Dia da semana invalido " + diaSemana);
        }
    }

    public static void switchCase2(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva um valor: ");
        int numero = scan.nextInt();

        switch (numero){
            case 1:
            case 2:
            case 3: System.out.println("Certo " + numero); break;
            case 4:
            case 5: System.out.println("Talvez " + numero); break;

            default:
                System.out.println("Indefinido" + numero);
        }
    }
}
