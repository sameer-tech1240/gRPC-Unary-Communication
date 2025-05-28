package com.book.server.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private int publishedYear;

}
