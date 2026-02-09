package model.exercicio;

import java.util.Scanner;

public class Senha {


    //Laços
    //for : quando vc sabe a quantidade de iterações
    //while : qunaod vc n sabe a quantidade de iterações mas tem uma condição de parada


    private String senha ;

    public Senha(String senha) {
        this.senha = senha;
    }

    Scanner scanner = new Scanner(System.in);
    public void digiteSenha(){
        System.out.println("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();
        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senhaDigitada.equals(senha)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
    }
}
