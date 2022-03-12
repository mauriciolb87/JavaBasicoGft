package com.exemplo.a01Loops;

public class a03Exercicios {

    public static void main(String[] args) {

        //exer01();
        exer02();

    }

    public static void exer01(){
        for(int i = 3; i <= 11; i++){

            if (i == 7){

            }else {
                System.out.println(i++);
            }
        }
    }

    private static void exer02() {
        int i = 0;
        while (true) {
            if (i <= 6){
                System.out.println("while");
                i++;
            }
        }
    }

}
