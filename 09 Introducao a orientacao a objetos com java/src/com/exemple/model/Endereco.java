package com.exemple.model;

public class Endereco {

    public enum TipoEnderoco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO}

    private TipoEnderoco tipoEnderoco;
    private String endereco;
    private String numero;
    private String complemto;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;

    public TipoEnderoco getTipoEnderoco() {
        return tipoEnderoco;
    }

    public void setTipoEnderoco(TipoEnderoco tipoEnderoco) {
        this.tipoEnderoco = tipoEnderoco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemto() {
        return complemto;
    }

    public void setComplemto(String complemto) {
        this.complemto = complemto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "tipoEnderoco=" + tipoEnderoco +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemto='" + complemto + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
