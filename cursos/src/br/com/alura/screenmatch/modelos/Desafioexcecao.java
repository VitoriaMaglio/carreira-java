package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.exception.SenhaInvalidaException;

import java.util.Scanner;

public class Desafioexcecao {
    /*
    Programa que solicita dois num, realiza divisõa com try/catch pra exceção 0 como divisor
    Programa que lê senha que captura SenhaInvalidaException, exceção personalizada
     */



//        System.out.println("Informe um número: ");
//        int x = scanner.nextInt();
//        System.out.println("Informe um número: ");
//        int y = scanner.nextInt();
//
//        try{
//            int divisao = x / y;
//            System.out.println("Resultado: " + divisao);
//        } catch (ArithmeticException e) {
//            System.out.println("Erro divisão por zero!");;
//        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}


