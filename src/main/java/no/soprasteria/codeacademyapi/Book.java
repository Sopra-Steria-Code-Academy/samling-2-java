package no.soprasteria.codeacademyapi;

import lombok.Data;

import java.util.UUID;

@Data
public class Book {

    private UUID id;
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = UUID.randomUUID();
    }
}
