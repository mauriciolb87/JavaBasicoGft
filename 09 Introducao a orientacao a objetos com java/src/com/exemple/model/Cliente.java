package com.exemple.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Endereco> endereco;
    private String numCartao;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public List<Endereco> getEndereco() {
        if (endereco == null) {
            endereco = new ArrayList<Endereco>();
        }
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public void addEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Erro, endereco nulo");
        }
        if (endereco.getCep() == null){
            throw new NullPointerException("Erro, cep nulo");
        }
        getEndereco().add(endereco);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "endereco=" + endereco +
                ", numCartao='" + numCartao + '\'' +
                '}';
    }
}
