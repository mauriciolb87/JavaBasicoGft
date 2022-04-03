package com.exemple.a01HelloWord;

import com.exemple.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLancamento(){

        int[] primeiro = {10, 20, 30, 40 ,50};
        int[] segundo  = {-1,  5,  7,  6,  3};

        // Se os 2 arrays são iguais
        Assertions.assertArrayEquals(primeiro, segundo);

        // outra forma se sao eiguais
        Assertions.assertNotEquals(primeiro, segundo);

    }

    @Test
    void validaObjetoNulo(){

        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Tuxe", LocalDate.now());
        Assertions.assertNotNull(pessoa);

    }

    @Test
    void validarTiposDiferentes(){

        double valor = 5.0;
        double valor2 = 5.0;

        Assertions.assertEquals(valor, valor2);
    }
}
