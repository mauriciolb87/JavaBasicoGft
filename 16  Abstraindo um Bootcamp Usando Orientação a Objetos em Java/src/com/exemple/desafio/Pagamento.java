package com.exemple.desafio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pagamento {

    private double valor;
    private String produto;
    private Set<Cliente> clientes = new LinkedHashSet<>();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", produto='" + produto + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
