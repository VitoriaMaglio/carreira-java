package model;

import java.util.ArrayList;
import java.util.List;

public class StreamLambda {
/*
Dada uma lista de inteiros, gere uma nova lista com todos os valores dobrados.

 Entrada: [1, 2, 3, 4]
 Saída esperada: [2, 4, 6, 8]
 */
public static void main(String[] args) {

    //Quase consegui
    List<Integer> numeros = List.of(1,2,3,4);
//    numeros.add(1);
//    numeros.add(2);
//    numeros.add(3);
//    numeros.add(4);

    List<Integer> numerosDobrado = numeros.stream()
            .map(n -> n *2)
            .toList();

    //.stream -> quero percorrer essa lista usando stream( vai criar um fluxo de dados(pipeline))
    //.map -> transformar cada elemento da lista em outro elemento com a condição lambda
    //.toList converte o stream novamente para uma List

    //CONSEGUI
    List<Integer> num = List.of(1,2,5,7,8,92,76);
    List<Integer> numPar = num.stream()
            .filter(n -> n / 2 == 0)
            .toList();

    //CONSEGUI
//    List<String> nomes = List.of("Vitória","Felipe","Carlos");
//    List<String> nomesMaius = nomes.stream()
//            .map(n -> n.toUpperCase())
//            .toList();

    List<String> nomes = List.of("Vitória","Felipe","Carlos");
    List<Integer> quant = nomes.stream()
            .map(nome -> nome.length())
            .toList();

    //Usar .map sempre que precisar transformar tipo ou valor dos elementos.

    //Quase consegui
    List<Integer> valor = List.of(1,-2,3,-5,-6,6,7);
    boolean negativo  = valor.stream()
            .anyMatch(v -> v < 0);







}
}
