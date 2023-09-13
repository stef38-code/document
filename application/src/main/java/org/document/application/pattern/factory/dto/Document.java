package org.document.application.pattern.factory.dto;

public enum Document {
    COURRIER_NAISS("json"),
    COURRIER_MARIAGE("json"),
    COURRIER_DECES("xml"),
    COURRIER_AUTRE("txt");
    private final String code;

    Document(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
