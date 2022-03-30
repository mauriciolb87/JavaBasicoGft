package com.exemple.desafio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cliente extends Documentos{

    private String nome;
    private Set<Endereco> enderecos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", enderecos=" + enderecos +
                ", CPF=" + getCpf() +
                ", RG=" + getRg() +
                ", CNH=" + getCnh() +
                '}';
    }
}
