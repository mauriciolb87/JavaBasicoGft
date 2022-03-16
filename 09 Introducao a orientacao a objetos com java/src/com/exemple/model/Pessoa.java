package com.exemple.model;

public class Pessoa {

    public enum TipoPessoa {
        FISICA,
        JURIDICA}
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    private Integer codigo;
    private String nome;
    private String documento;
    private TipoPessoa tipoPessoa;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        if (documento == null || documento.isEmpty()){
            throw  new RuntimeException("Documento n pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF ){
           setDocumento(documento, tipoPessoa = TipoPessoa.FISICA);
        }else if(documento.length() == TAMANHO_CNPJ){
            setDocumento(documento, tipoPessoa = TipoPessoa.JURIDICA);
        }else{
        throw  new RuntimeException("Documento invalido");
        }
    }

    private void setDocumento(String documento, TipoPessoa tipo){

        this.tipoPessoa = tipo;
        this.documento = documento;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }
}
