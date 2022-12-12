package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientCreateBook {

    public static void main(String[] args) {

        BookDTO newBook = new BookDTO();
        newBook.setTitle("Codigo Da Vinci");
        newBook.setCategory("Ficção");

        Mono<BookDTO> monoBook = WebClient.create("http://localhost:8080")
                .post()
                .uri("/book")
                .bodyValue(newBook)
                .retrieve()
                .bodyToMono(BookDTO.class);

        monoBook.subscribe();

        BookDTO createdBook = monoBook.block();

        System.out.println(createdBook);
    }
}
