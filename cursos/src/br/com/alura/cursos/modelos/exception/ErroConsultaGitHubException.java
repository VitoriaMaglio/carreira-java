package br.com.alura.cursos.modelos.exception;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
