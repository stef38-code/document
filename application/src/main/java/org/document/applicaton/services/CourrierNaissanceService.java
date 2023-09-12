package org.document.applicaton.services;

import org.document.applicaton.dto.CourrierDto;
import org.document.applicaton.dto.DemandeType;
import org.document.applicaton.dto.Document;
import org.document.applicaton.dto.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("courrierNaissanceService")
public class CourrierNaissanceService implements CourrierService{
    private static Logger log = LoggerFactory.getLogger(CourrierNaissanceService.class);
    @Override
    public CourrierDto getCourrier() {
        log.info("Courrier de naissance");
        CourrierDto courrier = new CourrierDto();
        courrier.setTypeDemande(DemandeType.COURRIER_NAISS.getCode());
        courrier.setCodeDocument(Document.COURRIER_NAISS.getCode());
        courrier.setCodeOperation(Operation.COURRIER_NAISS.getCode());

        return courrier;
    }
}
