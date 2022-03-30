package com.exemple.desafio;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Ringo");
        cliente.setRg("112212121");
        cliente.setCnh("4431121224");
        cliente.setCpf("9876080989");
        Endereco endereco = new Endereco();
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("SP");
        endereco.setRua("123 rua");
        cliente.getEnderecos().add(endereco);

        System.out.println("Cliente cadastrado");
        System.out.println(cliente.toString());

        System.out.println("Venda:");
        Pagamento pagamento = new Pagamento();
        pagamento.setProduto("Tv 22");
        pagamento.setValor(800.00);
        pagamento.getClientes().add(cliente);
        System.out.println("Venda:" + pagamento.toString());
    }
}
