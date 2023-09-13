package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;
import org.document.application.pattern.factory.dto.Document;
import org.document.application.pattern.factory.dto.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("courrierMariageService")
public class CourrierMariageService implements CourrierService{
    private static final Logger log = LoggerFactory.getLogger(CourrierMariageService.class);
    @Override
    public CourrierDto getCourrier() {
        log.info("Courrier de mariage");
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(DemandeType.COURRIER_MARIAGE.getCode());
    courrier.setCodeDocument(Document.COURRIER_MARIAGE.getCode());
        courrier.setCodeOperation(Operation.COURRIER_MARIAGE.getCode());

        return courrier;
    }
}
