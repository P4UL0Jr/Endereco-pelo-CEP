package src.Servico;

import src.Entidade.Endereco;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class BuscarEndereco {
    public Endereco encontrarEndereco(String cep){
        URI endereco = "viacep.com.br/ws/"+cep+"/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();

        return cep;
    }
}
