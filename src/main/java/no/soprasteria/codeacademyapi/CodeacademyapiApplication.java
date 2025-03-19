package no.soprasteria.codeacademyapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@SpringBootApplication
@RestController
@RequestMapping(value = "/api/v1/hello")
public class CodeacademyapiApplication {

    private final Random random = new Random();

    public static void main(String[] args) {
        SpringApplication.run(CodeacademyapiApplication.class, args);
    }

    @Operation(summary = "Get a greeting")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "I am alive",
                    content = { @Content(mediaType = "text/plain") }),
            @ApiResponse(responseCode = "500", description = "My server has crashed. Sorry bro.",
                    content = @Content(mediaType = "text/plain"))})
    @GetMapping(value = "/spring", produces = "text/plain")
    public ResponseEntity<String> spring() {
        return ResponseEntity.ok("Spring is here!");
    }

    @GetMapping(value = "/world", produces = "text/plain")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello code Academy!");
    }

    @DeleteMapping(value = "/world/remove", produces = "text/plain")
    public ResponseEntity<String> deleteBooks(@RequestParam Integer bookId) {
        return ResponseEntity.ok("I have deleted the book with id " + bookId);
    }
    @Operation(summary = "Create a book")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Created",
                    content = { @Content(mediaType = "application/json") }),
            @ApiResponse(responseCode = "500", description = "Failed to create book.",
                    content = @Content(mediaType = "application/json"))})
    @PutMapping(value = "/book/create", produces = "application/json")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {

        int myRandomValuye = random.nextInt(0, 10);
        if (myRandomValuye > 5) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(book);
    }
}
