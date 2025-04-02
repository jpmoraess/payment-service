package br.com.jpmoraess.payment_service.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<HelloResponse> hello() {
        return ResponseEntity.ok(HelloResponse.of("Hello", LocalDateTime.now()));
    }

    public record HelloResponse(String message, LocalDateTime dateTime) {
        public static HelloResponse of(String message, LocalDateTime dateTime) {
            return new HelloResponse(message, dateTime);
        }
    }
}
