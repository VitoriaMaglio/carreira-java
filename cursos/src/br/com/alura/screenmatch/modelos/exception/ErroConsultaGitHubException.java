package br.com.alura.screenmatch.modelos.exception;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
