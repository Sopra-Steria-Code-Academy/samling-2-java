package no.soprasteria.codeacademyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/v1/hello")
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
}
