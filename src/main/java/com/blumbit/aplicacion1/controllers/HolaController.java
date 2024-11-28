package com.blumbit.aplicacion1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping({"/", "/hola", "/saludo"})
    public String saludo(){
        return "Hola Mundo desde SPRING";
    }
    
    @GetMapping("/producto")
    public String getProductos(){
        return "Teclado, Monitor";
    }
    
}
