package com.exemple.a01HelloWord;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTeste {

    @Order(4)
    @Test
    void validaFluxeA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    void validaFluxeB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    void validaFluxeC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    void validaFluxeD(){
        Assertions.assertTrue(true);
    }
}
