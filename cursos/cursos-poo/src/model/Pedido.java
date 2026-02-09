package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements ProdutoInterface {

    //atributtes

    private Cliente cliente ;
    private List<Produto> produtos;
    private StatusPedido statusPedido;


    //constructor


    public Pedido() {
        this.produtos = new ArrayList<>();
    }



    //get e set

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(List<Produto> produto) {
        this.produtos = produto;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    //toString

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", produtos=" + produtos +
                ", statusPedido=" + statusPedido +
                '}';
    }

    public void valorTotal(Produto produto){
        double total = produto.getQuantidade() * produto.getPreco();
        System.out.println("Valor total da sua compra: " + total);
    }

    @Override
    public void adicionar(Produto produto) {
        System.out.println("Produto adicionado no pedido");
        produtos.add(produto);

    }

    @Override
    public void remover(Produto produto) {
        System.out.println("Produto removido do pedido");
        produtos.remove(produto);
    }
}
