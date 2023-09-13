package org.document.application.pattern.factory.dto;

public enum CourrierFactory {

    NAISSANCE{
        @Override
        public CourrierDto create() {
            return generate(DemandeType.COURRIER_NAISS,Document.COURRIER_NAISS,Operation.COURRIER_NAISS);
        }
    },
    MARIAGE{
        @Override
        public CourrierDto create() {
            return generate(DemandeType.COURRIER_MARIAGE,Document.COURRIER_MARIAGE,Operation.COURRIER_MARIAGE);
        }
    },
    DECES{
        @Override
        public CourrierDto create() {
            return generate(DemandeType.COURRIER_DECES,Document.COURRIER_DECES,Operation.COURRIER_DECES);
        }
    },
    AUTRES{
        @Override
        public CourrierDto create() {
            return generate(DemandeType.COURRIER_AUTRE,Document.COURRIER_AUTRE,Operation.COURRIER_AUTRE);
        }
    };

    private static CourrierDto generate(DemandeType demandeType, Document document, Operation operation){
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(demandeType.getCode());
        courrier.setCodeDocument(document.getCode());
        courrier.setCodeOperation(operation.getCode());
        return courrier;
    }

    public abstract CourrierDto create();

}
