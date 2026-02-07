package br.com.alura.cursos.principal;

import br.com.alura.cursos.calculos.CalculadoraDeTempo;
import br.com.alura.cursos.calculos.FiltroRecomendacao;
import br.com.alura.cursos.modelos.Episodio;
import br.com.alura.cursos.modelos.Filme;
import br.com.alura.cursos.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);


        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);



        //java.util -> Java Collections
        //Interfaces e classes para organizar e armazenar dados em grupo
        //Arrays são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo
        //Para declarar precisa definir o seu tipo e tamanho -> ruim pois tem tamanho fixo e  métodos eficientes ausentes
        //ArrayList -> lista com array
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        //toString devolve uma representação do objeto como uma String
        //quando vc declara uma variável com nome de var o compilador infere o tipo com base no valor atribuído a ela.
        //construtor criar e inicializar um objeto

    }
}