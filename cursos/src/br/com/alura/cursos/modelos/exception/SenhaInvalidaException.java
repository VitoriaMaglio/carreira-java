package br.com.alura.cursos.modelos.exception;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
