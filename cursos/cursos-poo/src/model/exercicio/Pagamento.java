package model.exercicio;

public abstract class Pagamento {
    protected int valor;

    public Pagamento(int valor) {
        this.valor = valor;
    }

     public abstract void pagar();
}
