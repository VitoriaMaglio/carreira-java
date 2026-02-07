package br.com.alura.cursos.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        Collections.sort(numeros);
        //Aqui ele compila sem usar a interface Comparable pois a lista é de um tipo primitivo ent ele sabe o parâmetro de comparação


    }
}
