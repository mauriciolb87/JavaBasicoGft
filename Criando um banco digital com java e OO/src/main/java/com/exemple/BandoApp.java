package main.java.com.exemple;


import main.java.com.exemple.model.banco.Banco;
import main.java.com.exemple.model.cliente.Cliente;
import main.java.com.exemple.model.banco.Conta;
import main.java.com.exemple.model.banco.ContaCorrente;
import main.java.com.exemple.model.banco.ContaPoupanca;
import main.java.com.exemple.model.cliente.Endereco;

import java.util.ArrayList;

public class BandoApp {
    public static void main(String[] args) {

        Endereco tuxeEndereco = new Endereco();
        tuxeEndereco.setTipoEnderoco(Endereco.TipoEnderoco.ENTREGA);
        tuxeEndereco.setEndereco("rua coronel 1");
        tuxeEndereco.setNumero("12");
        tuxeEndereco.setComplemto("casa");
        tuxeEndereco.setCidade("bage");
        tuxeEndereco.setBairro("centro");
        tuxeEndereco.setEstado("RS");
        tuxeEndereco.setCep("97300000");

        Cliente tuxe = new Cliente();
        tuxe.setNome("Tuxe");
        tuxe.setTipoCliente(Cliente.TipoCliente.FISICA);
        tuxe.addEndereco(tuxeEndereco);

        Conta cc = new ContaCorrente(tuxe);
        Conta cp = new ContaPoupanca(tuxe);

        cc.depositar(1000);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("========Dados do Cliente========");
        tuxe.imprimoDados();




    }
}
