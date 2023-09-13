package org.document.application.pattern.factory.controllers;


import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.services.CourrierService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourrierController {
    @Qualifier("courrierNaissanceService")
    private final CourrierService courrierNaissanceService;

    @Qualifier("courrierNaissanceService")
    private final CourrierService courrierMariageService;

    @Qualifier("courrierNaissanceService")
    private final CourrierService courrierDecesService;

    @Qualifier("courrierNaissanceService")
    private final CourrierService courrierAutresService;

    public CourrierController(CourrierService courrierNaissanceService, CourrierService courrierMariageService, CourrierService courrierDecesService, CourrierService courrierAutresService) {
        this.courrierNaissanceService = courrierNaissanceService;
        this.courrierMariageService = courrierMariageService;
        this.courrierDecesService = courrierDecesService;
        this.courrierAutresService = courrierAutresService;
    }

    @GetMapping("/courrier/naissance")
    public ResponseEntity<CourrierDto>  getCourrierNaissance() {
        return new ResponseEntity<>(courrierNaissanceService.getCourrier(), HttpStatus.OK);
    }
    @GetMapping("/courrier/mariage")
    public ResponseEntity<CourrierDto> getCourrierMariage() {
             return new ResponseEntity<>(courrierMariageService.getCourrier(), HttpStatus.OK);
    }
    @GetMapping("/courrier/deces")
    public ResponseEntity<CourrierDto> getCourrierDeces() {
        return new ResponseEntity<>(courrierDecesService.getCourrier(), HttpStatus.OK);
    }
    @GetMapping("/courrier/autres")
    public ResponseEntity<CourrierDto> getCourrierAutres() {
          return new ResponseEntity<>(courrierAutresService.getCourrier(), HttpStatus.OK);
    }
}
