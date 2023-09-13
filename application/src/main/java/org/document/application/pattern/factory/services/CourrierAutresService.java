package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.dto.Document;
import org.document.application.pattern.factory.dto.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("courrierAutresService")
public class CourrierAutresService implements CourrierService{
    private static final Logger log = LoggerFactory.getLogger(CourrierAutresService.class);
    @Override
    public CourrierDto getCourrier() {
        log.info("Courrier de autre cas");
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(DemandeType.COURRIER_AUTRE.getCode());
    courrier.setCodeDocument(Document.COURRIER_AUTRE.getCode());
        courrier.setCodeOperation(Operation.COURRIER_AUTRE.getCode());

        return courrier;
    }
}
