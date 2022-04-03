package com.exemple.a01HelloWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Ringo")
    void validarAlgoSomenteNoUser(){
        // verifica se e verdadeiro
        Assertions.assertEquals(10, 5 +5);

    }
}
