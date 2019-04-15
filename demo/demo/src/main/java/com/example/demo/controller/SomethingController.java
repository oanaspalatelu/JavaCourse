package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SomethingController {

    //@RequestMapping(path="/something/{name}", method = RequestMethod.GET)
    // or
    @GetMapping(path="/something/{name}")
    public ResponseEntity<String> firstGet(@PathVariable String name){
        String value = "hello, " + name+"!";
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

    @PostMapping(path="/something/mypost")
    public ResponseEntity<BankAccount> myPost(@RequestBody BankAccount account){
        account.balance+=50;

        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
