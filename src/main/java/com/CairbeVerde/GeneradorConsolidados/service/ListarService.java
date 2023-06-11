package com.CairbeVerde.GeneradorConsolidados.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Clase encargada de generar lista de consolidado segun la empresa que lo necesite
@RestController
public class ListarService {
    @GetMapping("/chek")
    public String test() {
        return "OK";
    }
}
