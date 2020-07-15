package com.project.ccs.services;

import com.project.ccs.customExceptions.exceptions.IncorrectCardTypeException;
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

    public Map<String, CardProperties> getDetailsForCardType(String cardType) {
        if(cardType == null) {
            return allCardTypeDetails.mappingCardTypeDetails();
        } else {
            HashMap<String, CardProperties> cardDetails = new HashMap<>();
            CardProperties cardProperties = allCardTypeDetails.mappingCardTypeDetails().get(cardType);
            if(cardProperties != null) {
                cardDetails.put(cardType, cardProperties);
                return cardDetails;
            } else {
                throw new IncorrectCardTypeException(cardType);
            }
        }
    }
}
