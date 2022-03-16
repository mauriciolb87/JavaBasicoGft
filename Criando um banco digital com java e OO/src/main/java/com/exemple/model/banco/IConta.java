package main.java.com.exemple.model.banco;

public interface IConta {

     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
     void imprimirExtrato();

}
