package no.soprasteria.codeacademyapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping(value = "/v1/hello")
@Slf4j
public class CodeacademyapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeacademyapiApplication.class, args);
    }

    @RequestMapping(value = "/world", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello code Academy!");
    }

    @Operation(summary = "Create a book")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Book created",
                    content = { @Content(mediaType = "application/json") }),
            @ApiResponse(responseCode = "401", description = "You have no power here",
                    content = @Content(mediaType = "text/plain")),
            @ApiResponse(responseCode = "500", description = "My server has crashed. Sorry bro.",
                    content = @Content(mediaType = "text/plain"))})
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Book> hello(@RequestBody Book book) {
        return ResponseEntity.ok(book);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<String> deleteBookById(@PathVariable("id") Integer id) {
        log.info("Delete book with id {}", id);
        return ResponseEntity.ok("Deleted ok!");
    }
}
