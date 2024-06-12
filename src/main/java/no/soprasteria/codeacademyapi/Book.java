package no.soprasteria.codeacademyapi;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Book {

    @Schema(example = "280682ba-15dd-4131-927d-22cb299a0e98")
    private UUID id;
    @Schema(example = "Eple")
    private String title;
    @Schema(example = "Røyksopp")
    private String author;
    @Schema(example = "2010")
    private int year;
}
