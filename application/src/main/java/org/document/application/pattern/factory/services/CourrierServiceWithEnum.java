package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.CourrierFactory;

public interface CourrierServiceWithEnum {
    CourrierDto getCourrier(CourrierFactory courrier);
}
