package com.CairbeVerde.GeneradorConsolidados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Se encarga de mostrar y los archivos xls atravez de consultas http segun la empresa
@RestController
public class ConsolidadoController {
    @GetMapping("/chek")
    public String test() {
        return "OK";
    }
}

