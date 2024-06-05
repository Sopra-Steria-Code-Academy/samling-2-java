package no.soprasteria.codeacademyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/hello")
public class CodeacademyapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeacademyapiApplication.class, args);
    }
    @RequestMapping(value = "/world", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello code Academy!");
    }
}
