package com.github.fwerther28.controller;

import com.github.fwerther28.dto.Exchange;
import com.github.fwerther28.environment.InstanceInformationService;
import com.github.fwerther28.model.Book;
import com.github.fwerther28.proxy.ExchangeProxy;
import com.github.fwerther28.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Book Endpoint")
@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private InstanceInformationService informationService;

    @Autowired
    private BookRepository repository;
    @Autowired
    private ExchangeProxy proxy;


    // http://localhost:8100/book-service/1/BRL
    @Operation(summary = "Find a specific book by your ID")
    @GetMapping(value = "/{id}/{currency}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBook(
            @PathVariable("id") Long id,
            @PathVariable("currency") String currency
    ){
        String port = informationService.retrieveServerPort();

        var book = repository.findById(id).orElseThrow();

        Exchange exchange = proxy.getExchange(book.getPrice(), "USD", currency);

        //book.setEnvironment(port + " FEIGN");
        book.setEnvironment("BOOK PORT: " + port +
                " EXCHANGE PORT: " + exchange.getEnvironment());
        book.setPrice(exchange.getConvertedValue());
        book.setCurrency(currency);
        return book;
    }
}
