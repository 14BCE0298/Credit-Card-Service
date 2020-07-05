package com.project.ccs.controllers;

import com.project.ccs.models.CardType;
import com.project.ccs.models.CardTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ccs/v1/")
public class CardTypeController {
    public CardType cardType;

    @Autowired
    public CardTypeController(CardType cardType) {
        this.cardType = cardType;
    }

    @GetMapping("cardType/{type}")
    public int getMonthlyLimitForSilverCard(@PathVariable("type") String type) {
        System.out.println(type);
        return 202;
        //return this.cardType.getTypeDetailsMapping().get(CardTypeEnum.GOLD).getMonthlyLimit();
    }
}
