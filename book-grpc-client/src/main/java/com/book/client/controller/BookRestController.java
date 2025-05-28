package com.book.client.controller;

import com.book.client.dto.BookDto;
import com.book.client.service.BookServiceClient;
import com.book.server.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/books")
public class BookRestController {
    
    @Autowired
    private BookServiceClient bookServiceClient;

    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable int id) {
        BookResponse protoResponse = bookServiceClient.getBookById(id);

        // Convert protobuf BookResponse to BookDTO
        BookDto dto = new BookDto();
        dto.setBookId(protoResponse.getBookId());
        dto.setTitle(protoResponse.getTitle());
        dto.setAuthor(protoResponse.getAuthor());
        dto.setGenre(protoResponse.getGenre());
        dto.setPublishedYear(protoResponse.getPublishedYear());

        return dto;
    }
}
