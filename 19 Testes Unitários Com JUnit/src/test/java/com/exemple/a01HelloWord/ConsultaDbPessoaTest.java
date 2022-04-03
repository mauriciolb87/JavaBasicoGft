package com.exemple.a01HelloWord;

import com.exemple.GerenciadorDeConexaoDb;
import com.exemple.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultaDbPessoaTest {

    @BeforeAll
    void configuraConexao(){
        GerenciadorDeConexaoDb.iniciarConexao();
        System.out.println("iniciou");
    }

    @BeforeEach
    void insereDadosTeste(){
        GerenciadorDeConexaoDb.insereDados(new Pessoa("Tuxe", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDadosTeste(){
        GerenciadorDeConexaoDb.removeDados(new Pessoa("Tuxe", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosdeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    void finalizaConexao(){
        GerenciadorDeConexaoDb.iniciarConexao();
        System.out.println("finalizou");
    }


}
