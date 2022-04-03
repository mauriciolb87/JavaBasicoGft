package com.exemple;

import java.util.logging.Logger;

public class GerenciadorDeConexaoDb {

    private static Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoDb.class.getName());

    public  static void iniciarConexao(){
        // Fez algo
        LOGGER.info("Inicio conexao");
    }

    public  static void finalizarConexao(){
        // Fez algo
        LOGGER.info("Finalizar conexao");
    }

    public static void insereDados(Pessoa pessoa){
        // insere pesso no DB
        LOGGER.info("inserio dados");
    }

    public static void removeDados(Pessoa pessoa){
        // insere pesso no DB
        LOGGER.info("remove dados");
    }
}
