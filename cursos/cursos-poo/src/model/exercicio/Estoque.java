package model.exercicio;

import java.util.Scanner;

//gerenciamento de uma loja de roupas; garantir que o estoque seja atualizado a cada venda e programar alerta quando não houver produtos sufucientes no estoque
//ter produtos no estoque com nome e quant
//realizar a venda para o cliente
//atualiza no estoque


//MELHORAR LÓGICA E SOLUÇÃO PARA ALGO MAIS GENÉRICO
public class Estoque extends Produto{


    //Realizar a lógica da venda
    Produto camisa = new Produto("Camisa", 2);
    Produto calca = new Produto("Calça", 5);
    Produto meia = new Produto("Meia", 7);

    public void venda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual item vc deseja comprar?");
        String resp = scanner.nextLine();
        switch (resp.toLowerCase()) {
            case "camisa" -> {
                System.out.println("Quantidade?");
                int respQuant = scanner.nextInt();
                int i = camisa.getQuantidade() - respQuant;
                System.out.println("Estoque final:" + i);
                if (i < 0){
                    System.out.println("Estoque insuficiente");

                }
            }
            case "calça" -> {
                System.out.println("Quantidade?");
                int respQuant = scanner.nextInt();
                int i = calca.getQuantidade() - respQuant;
                System.out.println("Estoque final:" + i);
                if (i < 0){
                    System.out.println("Estoque insuficiente");
                }
            }
            case "meia" -> {
                System.out.println("Quantidade?");
                int respQuant = scanner.nextInt();
                int i = meia.getQuantidade() - respQuant;
                System.out.println("Estoque final:" + i);
                if (i < 0){
                    System.out.println("Estoque insuficiente");
                }
            }
            default -> System.out.println("Produto inexistente.");
        }
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.venda();
    }
}
