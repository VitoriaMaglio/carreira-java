package br.com.alura.cursos.modelos;

import java.io.*;
import java.util.Scanner;

public class DesafioArq {

    public static void main(String[] args) {
        //CRIAR ARQ E ESCREVER ALGO
        //Declara o q vc quer escrever, cria o arq com try. chama o método de escrita
        String data = "Conteúdo a ser gravado no arquivo.";
        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Escrever no arquivo o q o user escreve no terminal
        Scanner escreva = new Scanner(System.in);
        System.out.println("Escreva o q vc quer registar no arq: ");
        String dados = escreva.nextLine();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))){
            writer.write(dados);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Lê o q o user escreveu

        try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
