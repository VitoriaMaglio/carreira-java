package tests;

import model.Cliente;
import model.Pedido;
import model.Produto;
import model.StatusPedido;

import java.util.Scanner;

public class MainPedido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();
        cliente.setNome(nome);

        System.out.println("Digite o seu endereço");
        String endereco = scanner.nextLine();
        cliente.setNome(endereco);

        System.out.println("Digite nome do produto que você quer adicionar: ");
        String nomeProd = scanner.nextLine();
        produto.setNome(nomeProd);
        System.out.println("Digite preço do produto que você quer adicionar: ");
        double precoProd = scanner.nextDouble();
        produto.setPreco(precoProd);
        System.out.println("Digite quantidade do produto que você quer adicionar: ");
        int quantProd = scanner.nextInt();
        produto.setQuantidade(quantProd);

        pedido.valorTotal(produto);
        System.out.println("Seu pedido do produto: "+ produto + "está associado ao cliente " + nome);

        System.out.println("Quer adicionar esse produto no seu pedido? ");
        String resp = scanner.nextLine();

        if (resp != "sim"){
            pedido.remover(produto);

        }else
            pedido.adicionar(produto);

        pedido.setStatusPedido(StatusPedido.feito);
        System.out.println("Pedido " + pedido.getStatusPedido());

        System.out.println(pedido);









    }
}
