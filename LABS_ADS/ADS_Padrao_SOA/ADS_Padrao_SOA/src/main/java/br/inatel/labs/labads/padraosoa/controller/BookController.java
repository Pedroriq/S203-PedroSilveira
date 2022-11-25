package br.inatel.labs.labads.padraosoa.controller;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import br.inatel.labs.labads.padraosoa.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.management.relation.RelationServiceNotRegisteredException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> books = service.searchBook();
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long bookId){
        Optional<Book> opBook = service.findBookById(bookId);

        if (opBook.isPresent()){
            Book book = opBook.get();
            return book;
        } else {
            String msgErro = "No book found by id: " + bookId;
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, msgErro);
        }
    }
}
