package model.exercicio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    //remover espaços em branco
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite um nome: ");
        //String nome = scanner.nextLine();
        //String nome2 = nome.trim();
        //System.out.println(nome2);

        //Recebe um texto e devolve em maius e minus

        //System.out.println("Digite um nome: ");
        //String texto = scanner.nextLine();
        //String textoMai = texto.toUpperCase();
        //String textoMin = texto.toLowerCase();

        //System.out.println(textoMai);
        //System.out.println(textoMin);

        //Receba o nome de um arq e devolva sem a extensão
        //System.out.println("Digite um nome: ");
        //String arq = scanner.nextLine();
        //verificar se tem uma extensão pelo . que marca isso
//        int posicaoPonto = arq.lastIndexOf(".");
//        if (posicaoPonto != -1) {
//            String nomeSemExtensao = arq.substring(0, posicaoPonto);
//            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
//        } else {
//            System.out.println("O arquivo não possui extensão.");
//        }


        //verifique se uma String contém uma substring
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        if (texto.contains(palavra)){
            System.out.println("Sim, o texto contém a palavra " + palavra);
        }else
            System.out.println("Não conté");

        //exibir valor formatado -> format

        //verificar se um código segue regras
        System.out.println("Digite um código: ");
        String codigo = scanner.nextLine();
        //Usar Pattern pois vor criar um modelo e procurar com Mattcher se o texto segue esse padrão
        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");// se tem 3 letras maiúsculas, um hífen e 4 dígitos numéricos
        //  - fora dos colchetes significa o próprio hífen  \\d dígito de 0-9 {} quant de dígitos $ indica fim
        Matcher matcher = pattern.matcher(codigo);
        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência é inválido.");
        }

        //validar cpf
        System.out.println("Digite um cpf: ");
        String cpf = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        // \\. significa ponto



    }

    }

