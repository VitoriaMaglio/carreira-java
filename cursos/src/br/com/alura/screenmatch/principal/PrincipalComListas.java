package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        //ArrayList array dinâmico ent quando novos elementos são adicionados, o tamanho é ajustado
        //LinkedList lista encadeada de elementos, cada elemento da lista é um objeto que contém uma referência par ao próximo elemento
        //Porém acessar de forma aleatória é ruim
        List<Titulo> lista = new ArrayList<>();//Sempre tenta referenciar um obj da maneira mais genérica possível
        lista.add(meuFilme);      //Declara com List pois é uma interface com recursos
        lista.add(outroFilme);
        lista.add(lost);
        //Adicionando filmes e séries em uma lista parametrizando com a classe Titulo
        //Foreach -> percorrer uma lista de um modo rápido
        //Lambda//Method Reference -> ::
        for(Titulo item : lista ){
            System.out.println(item.getNome());
        }
        lista.forEach(titulo -> System.out.println(titulo));

        lista.forEach(System.out::println);

        //instanceOf instância de ; verifica se um objeto é de um determinado tipo

        //Referências são ponteiros para objetos em memória, apontam para um obj
        //Quando vc cria um obj p1, cria outro p2  atribuindo ele a p1 eles passam a apontar para a mesma referência na memória
        //Logo, se vc mudar um valor de p2, p1 tbm vai mudar
        //Casting de tipos ()

        //Collections sort ordena os tipos primitivos de uma lista
        //Quando vc tem uma lista parametrizada com Titulo, ele não sabe ordenar pois não tem um critério de comparação
        //Interface Comparable  compareTo

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));


    }

}
