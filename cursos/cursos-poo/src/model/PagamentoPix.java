package model;

public class PagamentoPix extends Pagamento{

    public PagamentoPix(int valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Você está pagando no pix!" + valor);
    }

    @Override
    public String toString() {
        return "Valor pago pix: " + valor;
    }
}
