package org.document.application.pattern.factory.dto;

public enum Operation {
    COURRIER_NAISS("email"),
    COURRIER_MARIAGE("email"),
    COURRIER_DECES("courrier"),
    COURRIER_AUTRE("courrier,email");
    private final String code;

    Operation(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
