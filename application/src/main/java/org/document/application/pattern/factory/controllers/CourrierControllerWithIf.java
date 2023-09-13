package org.document.application.pattern.factory.controllers;


import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.services.CourrierServiceWithIf;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourrierControllerWithIf {
    private final CourrierServiceWithIf courrierServiceWithIf;

    public CourrierControllerWithIf(CourrierServiceWithIf courrierServiceWithIf) {
        this.courrierServiceWithIf = courrierServiceWithIf;
    }

    @GetMapping("/courrier/withif/naissance")
    public ResponseEntity<CourrierDto>  getCourrierNaissance() {
        return new ResponseEntity<>(courrierServiceWithIf.getCourrier(DemandeType.COURRIER_NAISS), HttpStatus.OK);
    }
    @GetMapping("/courrier/withif/mariage")
    public ResponseEntity<CourrierDto> getCourrierMariage() {
             return new ResponseEntity<>(courrierServiceWithIf.getCourrier(DemandeType.COURRIER_MARIAGE), HttpStatus.OK);
    }
    @GetMapping("/courrier/withif/deces")
    public ResponseEntity<CourrierDto> getCourrierDeces() {
        return new ResponseEntity<>(courrierServiceWithIf.getCourrier(DemandeType.COURRIER_DECES), HttpStatus.OK);
    }
    @GetMapping("/courrier/withif/autres")
    public ResponseEntity<CourrierDto> getCourrierAutres() {
          return new ResponseEntity<>(courrierServiceWithIf.getCourrier(DemandeType.COURRIER_AUTRE), HttpStatus.OK);
    }
}
