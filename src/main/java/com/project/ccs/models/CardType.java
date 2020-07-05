package com.project.ccs.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class CardType {
    //@Value("${creditCardType}")
    private Map<CardTypeEnum, CardProperties> typeDetailsMapping;

    public Map<CardTypeEnum, CardProperties> getTypeDetailsMapping() {
        return typeDetailsMapping;
    }

    public void setTypeDetailsMapping(Map<CardTypeEnum, CardProperties> typeDetailsMapping) {
        this.typeDetailsMapping = typeDetailsMapping;
    }
}
