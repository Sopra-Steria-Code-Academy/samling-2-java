package no.soprasteria.codeacademyapi;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Book {
    @Schema(example = "Maos lille røde", description = "Her kan man oppgi en tittel")
    private String title;
    @Schema(example = "Mao")
    private String author;
    @Schema(example = "2024")
    private int year;
}
