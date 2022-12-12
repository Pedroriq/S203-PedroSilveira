package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class WebClientGetAllBooks_Flux {

    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();

        Flux<BookDTO> fluxBook = WebClient.create("http://localhost:8080")
                .get()
                .uri("/book")
                .retrieve()
                .bodyToFlux(BookDTO.class);

        fluxBook.subscribe(b -> bookList.add(b));

        fluxBook.blockLast();

        bookList.forEach(System.out::println);
    }
}
