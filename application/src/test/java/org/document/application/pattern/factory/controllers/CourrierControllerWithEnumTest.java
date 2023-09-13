package org.document.application.pattern.factory.controllers;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.dto.Document;
import org.document.application.pattern.factory.dto.Operation;
import org.document.application.pattern.factory.services.CourrierServiceWithEnum;
import org.document.application.pattern.factory.services.CreationCourrierServiceWithEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CourrierControllerWithEnumTest {
    private CourrierControllerWithEnum controller;

    private static void assertThatCourrierDto(CourrierDto courrierDto,DemandeType demandeType,Document document,Operation operation) {
        assertThat(courrierDto).isNotNull();
        assertThat(courrierDto.getTypeDemande()).isNotNull().isEqualTo( demandeType.getCode());
        assertThat(courrierDto.getCodeDocument()).isNotNull().isEqualTo( document.getCode());
        assertThat(courrierDto.getCodeOperation()).isNotNull().isEqualTo( operation.getCode());
    }

    @BeforeEach
    void setUp() {
        CourrierServiceWithEnum courrierServiceWithEnum = new CreationCourrierServiceWithEnum();

        controller = new CourrierControllerWithEnum(courrierServiceWithEnum);
    }

    @Test
    void courrierNaissance(){
        ResponseEntity<CourrierDto> response = controller.getCourrierNaissance();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThatCourrierDto(response.getBody(),
                DemandeType.COURRIER_NAISS, Document.COURRIER_NAISS, Operation.COURRIER_NAISS);
    }

    @Test
    void courrierMariage(){
        ResponseEntity<CourrierDto> response = controller.getCourrierMariage();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThatCourrierDto(response.getBody(),
                DemandeType.COURRIER_MARIAGE, Document.COURRIER_MARIAGE, Operation.COURRIER_MARIAGE);
    }

    @Test
    void courrierDeces(){
        ResponseEntity<CourrierDto> response = controller.getCourrierDeces();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThatCourrierDto(response.getBody(),
                DemandeType.COURRIER_DECES, Document.COURRIER_DECES, Operation.COURRIER_DECES);
    }

    @Test
    void courrierAutres(){
        ResponseEntity<CourrierDto> response = controller.getCourrierAutres();
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThatCourrierDto(response.getBody(),
                DemandeType.COURRIER_AUTRE, Document.COURRIER_AUTRE, Operation.COURRIER_AUTRE);
    }
}
