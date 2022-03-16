package main.java.com.exemple.model.cliente;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {

    public enum TipoCliente {
        FISICA,
        JURIDICA }

    private String nome;
    private String documento;
    private TipoCliente tipoCliente;
    private List<Endereco> endereco;

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
        getEndereco().add(endereco);

    }

    public void imprimoDados(){
        System.out.println(String.format("Cliente: %s", this.nome));
        System.out.println(String.format("Tipo de Cliente: %s", this.tipoCliente));
        System.out.println(String.format("Documento: %s", this.documento));
        System.out.println( endereco.toString() );
    }

}

