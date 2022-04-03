package com.exemple.a01HelloWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUser(){
        // verifica se e verdadeiro
        Assumptions.assumeTrue("tuxe".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 +5);

    }
}
