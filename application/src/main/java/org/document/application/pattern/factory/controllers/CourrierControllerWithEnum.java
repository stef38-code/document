package org.document.application.pattern.factory.controllers;


import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.CourrierFactory;
import org.document.application.pattern.factory.services.CourrierServiceWithEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourrierControllerWithEnum {
    private final CourrierServiceWithEnum courrierServiceWithEnum;

    public CourrierControllerWithEnum(CourrierServiceWithEnum courrierServiceWithEnum) {
        this.courrierServiceWithEnum = courrierServiceWithEnum;
    }

    @GetMapping("/courrier/withenum/naissance")
    public ResponseEntity<CourrierDto>  getCourrierNaissance() {
        return new ResponseEntity<>(courrierServiceWithEnum.getCourrier(CourrierFactory.NAISSANCE), HttpStatus.OK);
    }
    @GetMapping("/courrier/withenum/mariage")
    public ResponseEntity<CourrierDto> getCourrierMariage() {
             return new ResponseEntity<>(courrierServiceWithEnum.getCourrier(CourrierFactory.MARIAGE), HttpStatus.OK);
    }
    @GetMapping("/courrier/withenum/deces")
    public ResponseEntity<CourrierDto> getCourrierDeces() {
        return new ResponseEntity<>(courrierServiceWithEnum.getCourrier(CourrierFactory.DECES), HttpStatus.OK);
    }
    @GetMapping("/courrier/withenum/autres")
    public ResponseEntity<CourrierDto> getCourrierAutres() {
          return new ResponseEntity<>(courrierServiceWithEnum.getCourrier(CourrierFactory.AUTRES), HttpStatus.OK);
    }
}
