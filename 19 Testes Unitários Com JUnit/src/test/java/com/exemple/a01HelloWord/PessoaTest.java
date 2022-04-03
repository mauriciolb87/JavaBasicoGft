package com.exemple.a01HelloWord;

import com.exemple.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new  Pessoa("Tuxe", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(2, pessoa.getIdade());
    }

    @Test
    void validarIdadeCorreta(){
        Pessoa pessoa = new  Pessoa("Ringo", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals( 22,pessoa.getIdade());
    }

    @Test
    void validarSeMaiorIdade(){
        Pessoa pessoa = new  Pessoa("Tuxe", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pessoa.ehMaiorIdade());

        Pessoa pessoa2 = new  Pessoa("Ringo", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(pessoa2.ehMaiorIdade());
    }

}
