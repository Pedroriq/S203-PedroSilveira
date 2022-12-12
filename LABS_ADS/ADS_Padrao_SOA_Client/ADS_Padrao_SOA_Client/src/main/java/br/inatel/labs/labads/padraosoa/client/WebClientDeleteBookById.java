package br.inatel.labs.labads.padraosoa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

public class WebClientDeleteBookById {

    public static void main(String[] args) {
        try{
            Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhost:8080")
                    .delete()
                    .uri("/book/2")
                    .retrieve()
                    .toBodilessEntity();

            monoVoid.subscribe();

            ResponseEntity<Void> responseEntity = monoVoid.block();

            System.out.println( responseEntity.getStatusCode());
        } catch (WebClientResponseException e){
            e.printStackTrace();
        }
    }
}
