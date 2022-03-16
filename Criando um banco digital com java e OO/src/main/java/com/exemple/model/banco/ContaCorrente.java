package main.java.com.exemple.model.banco;


import main.java.com.exemple.model.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente === ");
        imprimeInfoComuns();
    }
}
