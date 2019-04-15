package com.example.demo.repositories;

import com.example.demo.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {

    public List<Card> list = new ArrayList<Card>();

    public void addCard(Card card){
        list.add(card);
    }

    public List<Card> getCard(){
        return  list;
    }

}
