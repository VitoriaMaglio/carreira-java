package br.com.alura.cursos.principal;

import br.com.alura.cursos.modelos.Livros;

import java.util.Scanner;

public class MainLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a categoria do seu livro: "+
        "F- Ficcção; N - Não-ficção; T - Tecnologia; H - História ");
        char categoria = scanner.next().toUpperCase().trim().charAt(0);//aqui pega apenas o primeiro caractere digitado;

        //Livros livroF = new Livros("O Pequeno Príncipe", 'F');
        //Livros livroT = new Livros("Entendendo algoritmos", 'T');
        //Quando eu imprimo um objeto diretamente ele retorna a referência na memória
        //Para que isso não aconteça devo sobrescrever Override o método padrão toString que retorna uma String do obj

        Livros livroF = new Livros("O Pequeno Príncipe", 'F');
        Livros livroT = new Livros("Entendendo algoritmos", 'T');

        if (categoria == 'F'){
            System.out.println(livroF);
        } else if (categoria == 'T') {
            System.out.println(livroT);
        } else
            System.out.println("Categoria não existe.");

        //Porém o programa só funciona se eu digitar F maiúsculo, para funcionar com minúsculo preciso converter a entrada para upper or lower
    }   //.trim remove os espaços em branco
}
