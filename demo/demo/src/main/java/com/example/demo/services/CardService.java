package com.example.demo.services;

import com.example.demo.model.Card;
import com.example.demo.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card, HttpServletResponse response){
        cardRepository.addCard(card);
    }
}
