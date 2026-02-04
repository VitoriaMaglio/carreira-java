package br.com.alura.screenmatch.modelos;

import java.util.*;

public class DesafioTitulo implements Comparable<Titulo> {
    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    public static void main(String[] args) {


        List<Titulo> titulos = new ArrayList<>();

        Titulo ti1 = new Titulo("Vi", 2000);
        Titulo ti2 = new Titulo("Fe", 2020);
        Titulo ti3 = new Titulo("De", 2005);

        titulos.add(ti1);
        titulos.add(ti2);
        titulos.add(ti3);

        Collections.sort(titulos);
        titulos.forEach(System.out::println);

    }

}
