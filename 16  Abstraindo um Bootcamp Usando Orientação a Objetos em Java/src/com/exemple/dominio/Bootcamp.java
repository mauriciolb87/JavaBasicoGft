package com.exemple.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String decricao;
    private final LocalDate dateInicio = LocalDate.now();
    private final LocalDate dateFinal = dateInicio.plusDays(45);
    private Set<Dev> devsInscrito = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public LocalDate getDateInicio() {
        return dateInicio;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public Set<Dev> getDevsInscrito() {
        return devsInscrito;
    }

    public void setDevsInscrito(Set<Dev> devsInscrito) {
        this.devsInscrito = devsInscrito;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(decricao, bootcamp.decricao) && Objects.equals(dateInicio, bootcamp.dateInicio) && Objects.equals(dateFinal, bootcamp.dateFinal) && Objects.equals(devsInscrito, bootcamp.devsInscrito) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, decricao, dateInicio, dateFinal, devsInscrito, conteudos);
    }
}
