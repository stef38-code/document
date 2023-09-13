package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.dto.Document;
import org.document.application.pattern.factory.dto.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreationCourrierServiceWithIf implements CourrierServiceWithIf{
    private static final Logger log = LoggerFactory.getLogger(CreationCourrierServiceWithIf.class);
    @Override
    public CourrierDto getCourrier(DemandeType demandeType) {

        if(demandeType.getCode().equals(DemandeType.COURRIER_NAISS.getCode())){
            return createCourrier(DemandeType.COURRIER_NAISS,Document.COURRIER_NAISS,Operation.COURRIER_NAISS);

        }else if(demandeType.getCode().equals(DemandeType.COURRIER_MARIAGE.getCode())){
            return createCourrier(DemandeType.COURRIER_MARIAGE,Document.COURRIER_MARIAGE,Operation.COURRIER_MARIAGE);

        }else if(demandeType.getCode().equals(DemandeType.COURRIER_DECES.getCode())){
            return createCourrier(DemandeType.COURRIER_DECES,Document.COURRIER_DECES,Operation.COURRIER_DECES);

        }



        return createCourrier(DemandeType.COURRIER_AUTRE,Document.COURRIER_AUTRE,Operation.COURRIER_AUTRE);
    }

    private CourrierDto createCourrier(DemandeType demandeType,Document document,Operation operation) {
        log.info("Courrier de autre cas");
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(demandeType.getCode());
        courrier.setCodeDocument(document.getCode());
        courrier.setCodeOperation(operation.getCode());

        return courrier;
    }
}
