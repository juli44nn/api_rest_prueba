package com.example.inicial1.controllers;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.PersonaServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServicesImp> {

    @GetMapping(path = "/search")
    public ResponseEntity<?> searchPersona(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping(path = "/seachPaged")
    public ResponseEntity<?> seachPagedPersona(@RequestParam String filtro, Pageable paged){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro,paged));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"" + e.getMessage() + "\"}");
        }
    }




}