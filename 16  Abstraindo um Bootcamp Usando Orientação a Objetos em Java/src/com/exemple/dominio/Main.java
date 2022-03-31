package com.exemple.dominio;

import com.exemple.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descriçao curso java");
        curso.setCargaHoraria(12);

        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("descriçao curso C#");
        curso2.setCargaHoraria(10);

        System.out.println(curso2);

        // polimorfismo
        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("tudo sobre java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria c#");
        mentoria2.setDescricao("tudo sobre c#");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boot Java");
        bootcamp.setDecricao("Descricão Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTuxe = new Dev();
        devTuxe.setNome("Tuxe");
        devTuxe.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Tuxe" + devTuxe.getConteudosInscritos());
        System.out.println("-------------------" );
        devTuxe.progredir();
        System.out.println("Conteudos inscritos Tuxe" + devTuxe.getConteudosInscritos());
        System.out.println("Conteudos conlcuidos Tuxe" + devTuxe.getConteudosConcluidos());
        System.out.println("XP " + devTuxe.calcularTotalXp());

        System.out.println("!!!!!!!-------------------!!!!!!!" );

        Dev devRingo = new Dev();
        devRingo.setNome("Ringo");
        devRingo.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Ringo" + devRingo.getConteudosInscritos());
        System.out.println("-------------------" );
        devRingo.progredir();
        devRingo.progredir();
        devRingo.progredir();
        System.out.println("Conteudos inscritos Ringo" + devRingo.getConteudosInscritos());
        System.out.println("Conteudos conlcuidos Ringo" + devRingo.getConteudosConcluidos());
        System.out.println("XP " + devRingo.calcularTotalXp());


    }
    
}
