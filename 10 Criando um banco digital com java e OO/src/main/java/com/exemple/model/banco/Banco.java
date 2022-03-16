package main.java.com.exemple.model.banco;


import lombok.Data;
import main.java.com.exemple.model.cliente.Cliente;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;


}
