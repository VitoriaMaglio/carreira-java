package model.exercicio;

public  class Aluno {
    //Declarei que é uma classe abstrata, ou seja não pode ser instanciada diretamente, possui comportamentos genéricos.

    //atributtes
    private String nome;
    private String tipo;

    //constructor


    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " Tipo: "+ tipo;
    }

    public void identificar(){
        System.out.println("Aluno: " + nome + " Tipo: "+ tipo);
    }
}
