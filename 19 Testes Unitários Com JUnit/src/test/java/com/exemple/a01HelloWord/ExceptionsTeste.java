package com.exemple.a01HelloWord;

import com.exemple.Conta;
import com.exemple.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioExecaoTransferencia(){
        Conta origem = new Conta("1223", 0);
        Conta destino = new Conta("33212", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(origem, destino, -1));

    }
}
