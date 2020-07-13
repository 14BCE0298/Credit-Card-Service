package com.project.ccs.controllers;

import com.project.ccs.models.CardProperties;
import com.project.ccs.models.CardTypeEnum;
import com.project.ccs.services.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ccs/v1/")
public class CardTypeController {
    public CardTypeService cardTypeService;

    @Autowired
    public CardTypeController(CardTypeService cardTypeService) {
        this.cardTypeService = cardTypeService;
    }

    @GetMapping("cardType")
    public Map<CardTypeEnum, CardProperties> getDetailsForCardType(@RequestParam(name = "type", required = false) String type) {
       return cardTypeService.getDetailsForCardType(type);
    }
}
