package br.com.alura.cursos.modelos;

import br.com.alura.cursos.modelos.exception.ErroConsultaGitHubException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioAPI {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do Giuthub: ");
        String nomeGithub = leitura.nextLine();

        //criar uma var para armazenar o endereço externo API
        String endereco = "https://api.github.com/users/" + nomeGithub;

        //Java puro -> HttpClient dentro do try-catch para tratar as possíveis execeções

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")//declaa que aceita o formato da resposta
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();//pega o corpo da resposta
            System.out.println(json);//imprime json


        } catch (InterruptedException | ErroConsultaGitHubException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
