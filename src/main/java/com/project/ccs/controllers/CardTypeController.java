package com.project.ccs.controllers;

import com.project.ccs.models.CardProperties;
import com.project.ccs.services.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/ccs/v1/card-type")
public class CardTypeController {
    public CardTypeService cardTypeService;

    @Autowired
    public CardTypeController(CardTypeService cardTypeService) {
        this.cardTypeService = cardTypeService;
    }

    @GetMapping("/details")
    public Map<String, CardProperties> getDetailsForCardType(@RequestParam(name = "type", required = false) String type) {
       return cardTypeService.getDetailsForCardType(type);
    }
}
