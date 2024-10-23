package com.example.inicial1.controllers;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.LocalidadServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImp>{
}
