package tests;

import model.Aluno;
import model.AlunoBolsista;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda" , "regular");

        AlunoBolsista aluno2 = new AlunoBolsista("Lucas");

        aluno.identificar();
        aluno2.identificar();


    }
}
