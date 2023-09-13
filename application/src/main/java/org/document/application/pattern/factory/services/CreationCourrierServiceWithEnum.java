package org.document.application.pattern.factory.services;

import org.document.application.pattern.factory.dto.CourrierDto;
import org.document.application.pattern.factory.dto.CourrierFactory;

public class CreationCourrierServiceWithEnum implements CourrierServiceWithEnum{

    @Override
    public CourrierDto getCourrier(CourrierFactory courrier) {
        return CourrierFactory.valueOf(courrier.name()).create();
    }

}
