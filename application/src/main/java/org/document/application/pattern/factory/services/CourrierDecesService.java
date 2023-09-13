package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.dto.Document;
import org.document.application.pattern.factory.dto.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("courrierDecesService")
public class CourrierDecesService implements CourrierService{
    private static final Logger log = LoggerFactory.getLogger(CourrierDecesService.class);
    @Override
    public CourrierDto getCourrier() {
        log.info("Courrier de deces");
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(DemandeType.COURRIER_DECES.getCode());
        courrier.setCodeDocument(Document.COURRIER_DECES.getCode());
        courrier.setCodeOperation(Operation.COURRIER_DECES.getCode());

        return courrier;
    }
}
