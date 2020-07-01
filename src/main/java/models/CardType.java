package models;

import java.util.Map;

public class CardType {
    private Map<CardTypeEnum, CardProperties> typeDetailsMapping;

    public Map<CardTypeEnum, CardProperties> getTypeDetailsMapping() {
        return typeDetailsMapping;
    }

    public void setTypeDetailsMapping(Map<CardTypeEnum, CardProperties> typeDetailsMapping) {
        this.typeDetailsMapping = typeDetailsMapping;
    }
}
