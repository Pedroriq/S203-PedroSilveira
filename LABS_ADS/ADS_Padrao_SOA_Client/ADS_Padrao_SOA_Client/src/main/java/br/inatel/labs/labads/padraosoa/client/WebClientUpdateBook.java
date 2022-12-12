package br.inatel.labs.labads.padraosoa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientUpdateBook {

    public static void main(String[] args) {

        BookDTO existingBook = new BookDTO();
        existingBook.setId(3L);
        existingBook.setTitle("Cozinha Mineira da Fazenda");
        existingBook.setCategory("Gastronomia Regional");

        Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhost:8080")
                .put()
                .uri("/book")
                .bodyValue(existingBook)
                .retrieve()
                .toBodilessEntity();

        monoVoid.subscribe();

        ResponseEntity<Void> responseEntity = monoVoid.block();

        System.out.println( responseEntity.getStatusCode());
    }
}
