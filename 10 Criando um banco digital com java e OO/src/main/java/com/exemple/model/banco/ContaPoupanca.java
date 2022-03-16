package main.java.com.exemple.model.banco;


import main.java.com.exemple.model.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Poupança === ");
        imprimeInfoComuns();
    }
}
