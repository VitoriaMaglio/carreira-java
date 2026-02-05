package br.com.alura.screenmatch.modelos.exception;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
