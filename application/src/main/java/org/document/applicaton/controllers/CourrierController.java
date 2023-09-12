package org.document.applicaton.controllers;


import org.document.applicaton.dto.CourrierDto;
import org.document.applicaton.services.CourrierService;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public CourrierDto getCourrierNaissance() {
        return courrierNaissanceService.getCourrier();
    }
    @GetMapping("/courrier/mariage")
    public CourrierDto getCourrierMariage() {
        return courrierMariageService.getCourrier();
    }
    @GetMapping("/courrier/deces")
    public CourrierDto getCourrierDeces() {
        return courrierDecesService.getCourrier();
    }
    @GetMapping("/courrier/autres")
    public CourrierDto getCourrierAutres() {
        return courrierAutresService.getCourrier();
    }
}
