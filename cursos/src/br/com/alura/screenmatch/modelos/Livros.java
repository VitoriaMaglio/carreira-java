package br.com.alura.screenmatch.modelos;

public class Livros {

    private String titulo;

    private char categoria;
    //Tenho quatro categorias determinadas
    //Se o user escolher ela eu tenho que retornar um livro

    public Livros() {
    }

    public Livros(String titulo,  char categoria) {
        this.titulo = titulo;

        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
