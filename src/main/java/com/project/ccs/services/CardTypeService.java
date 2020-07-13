package com.project.ccs.services;

import com.project.ccs.models.AllCardTypeDetails;
import com.project.ccs.models.CardProperties;
import com.project.ccs.models.CardTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CardTypeService {

    public AllCardTypeDetails allCardTypeDetails;

    @Autowired
    public CardTypeService(AllCardTypeDetails allCardTypeDetails) {
        this.allCardTypeDetails = allCardTypeDetails;
    }

    public Map<CardTypeEnum, CardProperties> getDetailsForCardType(String cardType) {
        if(cardType == null) {
            return allCardTypeDetails.mappingCardTypeDetails();
        } else {
            HashMap<CardTypeEnum, CardProperties> cardDetails = new HashMap<>();
            cardDetails.put(CardTypeEnum.valueOf(cardType.toUpperCase()),
                    allCardTypeDetails.mappingCardTypeDetails().get(CardTypeEnum.valueOf(cardType.toUpperCase())));
            return cardDetails;
        }
    }
}
