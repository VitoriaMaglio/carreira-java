package model.exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalavrasMap {

    //MÉTODOS DO MAP
    //put(key,value) adiciona e se existir atualiza o valor
    //get(Object key) retorna o valor associado a chave, null se não exisitir
    //getOrDefault(K key, V defaultValue) retorna o valor da chave se existir e se não retorna o valor padrão default definido
    //containsKey(Object key) verifica se a chave existe e retorna ela
    //containsValue(Object value) verifica se um valor existe e retona
    //keySet() retona um set com todas as chaves do Map ----> Set é um conjunto de dados sem valor repetido e
    //values() retorna uma Collection comtodas valores do Map
    //entrySet() retorna um conjunbto com todos pares chave-valor
    //forEach(BiConsumer<? super K, ? super V> action) percorre o Map com lambda.

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        //aplicar um filtro para dividir a frase em palavras

        String[] palavras = frase.split(" ");

        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras){
            //getOrdefault tenta pegar o valor associado a uma chave no Mapse existir retorna, se não retorna o valor padrão default
            int valorAtual = contagem.getOrDefault(palavra, 0); // tem q ter uma variável do valor antigo que vai ser atualizado
            contagem.put(palavra, valorAtual + 1);
        }
        System.out.println("\nContagem de palavras:");
        contagem.forEach((palavra, qtd) -> System.out.println(palavra + " -> " + qtd));

    }}
