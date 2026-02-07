package model;

public class PagamentoCartao extends Pagamento{

    public PagamentoCartao(int valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Você está pagando com cartão" + valor);
    }

    @Override
    public String toString() {
        return "Valor pago cartão: " + valor;
    }
}
