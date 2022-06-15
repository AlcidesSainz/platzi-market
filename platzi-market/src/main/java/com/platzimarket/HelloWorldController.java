package com.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWorldController {
    @GetMapping("/hola")
    public String saludar(){
        return "Nunca Pares de Aprender!\uD83D\uDE80";
    }
}
