package model;

public class Pedido  {

    //atributtes

    private Cliente cliente ;
    private Produto produto;

    //constructor

    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    //get e set

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    //toString

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", produto=" + produto +
                '}';
    }

    public void valorTotal(Produto produto){
        double total = produto.getQuantidade() * produto.getPreco();
        System.out.println("Valor total da sua compra: " + total);
    }
}
