package no.soprasteria.codeacademyapi;

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
