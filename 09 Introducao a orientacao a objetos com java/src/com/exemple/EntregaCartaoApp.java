package com.exemple;

import com.exemple.model.Cliente;
import com.exemple.model.Endereco;
import com.exemple.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        cliente.setNumCartao("12312123");

        cliente.setCodigo(12);
        cliente.setNome("Tuxe");
        cliente.setDocumento("12345678912");
       // cliente.setTipoPessoa(Pessoa.TipoPessoa.JURIDICA);

        endereco.setTipoEnderoco(Endereco.TipoEnderoco.ENTREGA);
        endereco.setEndereco("weeqwq");
        endereco.setNumero("sdsd");
        endereco.setComplemto("sss");
        endereco.setCidade("wwqw");
        endereco.setBairro("dsdsa");
        endereco.setEstado("sdasd");
        endereco.setCep("sddq");

       // cliente.setEndereco(new ArrayList<endereco>());

        // Tratado algum erro
        try{
            cliente.addEndereco(endereco);
            System.out.println("Add");
        }catch (Exception e){
            System.err.println("Erro ao add endereco " + e.getMessage() );
        }

        System.out.println(cliente.toString() );
        System.out.println(endereco.toString());

    }
}
