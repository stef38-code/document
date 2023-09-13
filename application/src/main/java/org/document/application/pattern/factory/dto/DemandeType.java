package org.document.application.pattern.factory.dto;

public enum DemandeType {
    COURRIER_NAISS("Courrier de naissance"),
    COURRIER_MARIAGE("Courrier de mariage"),
    COURRIER_DECES("Courrier de deces"),
    COURRIER_AUTRE("Autres types courriers");
    private final String code;

    DemandeType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
