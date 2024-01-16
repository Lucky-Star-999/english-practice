package com.example.englishpractice.controller;

import com.example.englishpractice.request.WordRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/external/words")
@CrossOrigin(origins = "https://www.oxfordlearnersdictionaries.com", allowedHeaders = "*", allowCredentials = "true")
public class ExternalWordController {

    @PostMapping("")
    public ResponseEntity<Void> importWord(@RequestBody WordRequest wordRequest) {
        log.info("Word Request: {}", wordRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
