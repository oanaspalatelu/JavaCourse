package com.example.demo.controller;

import com.example.demo.model.Card;
import com.example.demo.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping(path="/add/card")
    public void addCard(@RequestBody Card card, HttpServletResponse response){
        cardService.addCard(card, response);
    }



}
