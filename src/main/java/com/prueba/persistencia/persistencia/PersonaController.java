package com.prueba.persistencia.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaDao personaDao;


    @GetMapping("/personas")
    public ResponseEntity<?> obtenerMonitoreo(){
        return new ResponseEntity<>(personaDao.getAll(), HttpStatus.FOUND);
    }
}
