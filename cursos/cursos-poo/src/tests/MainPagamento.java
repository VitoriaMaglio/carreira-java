package tests;

import model.exercicio.Pagamento;
import model.exercicio.PagamentoCartao;
import model.exercicio.PagamentoPix;

import java.util.ArrayList;
import java.util.List;

public class MainPagamento {


    public static void main(String[] args) {

        //Polimorfismo -> Criar uma lista do tipo classe pai e adicionar elementos filhos.
        //referência do tipo da classe pai para chamar métodos sobrescritos em objetos das classes filhas.
        List<Pagamento> pagamentos = new ArrayList<>();

       //pagamentos.add(PagamentoPix pix2 = new PagamentoPix(3)); não pode declarar uma variável dentro dos parênteses de um método.
        pagamentos.add(new PagamentoPix(3));
        pagamentos.add(new PagamentoCartao(4));
        pagamentos.add(new PagamentoPix(5));
        pagamentos.add(new PagamentoCartao(47));

        pagamentos.forEach(System.out::println);//quando fazemos assim o objeto chama o toString
        //pagamentos.forEach(p -> p.pagar());
        pagamentos.forEach(Pagamento::pagar);




    }
}
