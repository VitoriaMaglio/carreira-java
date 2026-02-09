package model;

public class Colaborador {

    private String nome;
    private String cargo;
    private int nivelAAcesso;

    public Colaborador() {
    }

    public Colaborador(String nome, String cargo, int nivelAAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAAcesso = nivelAAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAAcesso() {
        return nivelAAcesso;
    }

    public void setNivelAAcesso(int nivelAAcesso) {
        this.nivelAAcesso = nivelAAcesso;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", nivelAAcesso=" + nivelAAcesso +
                '}';
    }

    public void atualizar(String novoCargo, int nivelAAcessoNovo){

        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAAcesso + "\n");

        cargo = novoCargo;
        nivelAAcesso = nivelAAcessoNovo;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAAcessoNovo);

    }

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.nome = "Júlia Oliveira";
        colaborador.cargo = "Desenvolvedor Júnior";
        colaborador.nivelAAcesso = 1;

        colaborador.atualizar("Desenvolvedor Pleno", 2);
    }
}
