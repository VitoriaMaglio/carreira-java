package model.exercicio;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class Livro {

    private String titulo;
    private int diasAtraso;

    private double multaDia = 2.50;
    Scanner scanner = new Scanner(System.in);

    public void atraso(){
        System.out.println("Qual título do seu livro? ");
        titulo = scanner.nextLine();
        System.out.println("Quantos dias de atrasado ?");
         diasAtraso = scanner.nextInt();
        double multa = multaDia * diasAtraso;
        System.out.println("Livro" + titulo + "Multa por " + diasAtraso + " dias de atraso " + multa);
    }

    static void main() {
        Livro livro = new Livro();
        livro.atraso();
    }
}
