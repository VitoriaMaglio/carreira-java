package model.exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loja {

    //Declarar um MAP

    private Map<String,Integer> estoque = new HashMap<>();

    public Loja(){
        estoque.put("Camisa" , 2);
        estoque.put("Calça" , 2);
        estoque.put("Meia" , 2);
    }

    public void atualizar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual item você deseja comprar:? ");
        String produto = scanner.nextLine().toLowerCase();

        if (!estoque.containsKey(produto)){ //se a chave (key) do valor não conter no map
            System.out.println("Produto inexistente");
            return;

        }
        System.out.println("Quantidade");
        int quantidade = scanner.nextInt();
        int quantidadeAtual = estoque.get(produto); //aqui a gnt tem uma variável q faz uma busca pra saber quantas unidades do produto existem no estoque
        //produto é a chave q o user digitou
        // o método get retorna valor associado a essa key

        if (quantidade > quantidadeAtual){
            System.out.println("Estoque insuficiente");
        }else{
            estoque.put(produto, quantidadeAtual - quantidade); //o método put(chave, valor) adiciona um novo par de chave-valor se a chave n existir
            //tbm atualiza o valor de uma chave existente se a chave ja estiver no Map
            System.out.println("Venda realizada" + produto+ estoque.get(produto));
        }

    }
    public void exibirEstoque() {
        System.out.println("Estoque atual");
        estoque.forEach((produto, quantidade) -> System.out.println(produto + quantidade));
        //method reference
    }

    static void main() {
        Loja loja = new Loja();
        loja.exibirEstoque();
        loja.atualizar();
        loja.exibirEstoque();
    }

}

