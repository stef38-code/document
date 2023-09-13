package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.DemandeType;

public interface CourrierServiceWithIf {
    CourrierDto getCourrier(DemandeType demandeType);
}
