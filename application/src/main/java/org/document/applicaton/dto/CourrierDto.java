package org.document.applicaton.dto;

public class CourrierDto {
    private String typeDemande;
    private String codeOperation;
    private String codeDocument;

    public CourrierDto() {
    }

    public CourrierDto(String typeDemande, String codeOperation, String codeDocument) {
        this.typeDemande = typeDemande;
        this.codeOperation = codeOperation;
        this.codeDocument = codeDocument;
    }

    public String getTypeDemande() {
        return typeDemande;
    }

    public String getCodeOperation() {
        return codeOperation;
    }

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setTypeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
    }

    public void setCodeOperation(String codeOperation) {
        this.codeOperation = codeOperation;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }
}
