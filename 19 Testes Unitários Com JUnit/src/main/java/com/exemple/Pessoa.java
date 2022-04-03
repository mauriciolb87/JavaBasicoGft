package com.exemple;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDate nascomento;

    public Pessoa(String nome, LocalDate nascomento) {
        this.nome = nome;
        this.nascomento = nascomento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascomento() {
        return nascomento;
    }

    public void setNascomento(LocalDate nascomento) {
        this.nascomento = nascomento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascomento, LocalDate.now());
    }

    public boolean ehMaiorIdade(){
        return getIdade() >= 18;
    }
}
