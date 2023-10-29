package tech.buildrun.annotation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.annotation.log.Log;

@RestController
public class HelloController {

    @Log
    @GetMapping
    public ResponseEntity<Void> hello() {
        System.out.println("No meio da execucao");
        metodoPrivado();
        return ResponseEntity.ok().build();
    }

    @Log
    private void metodoPrivado() {
        System.out.println("Metodo privado!");
    }
}
