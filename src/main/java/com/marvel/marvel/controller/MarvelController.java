package com.marvel.marvel.controller;

import com.marvel.marvel.model.CharactersResponse;
import com.marvel.marvel.service.MarvelService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/marvel")
public class MarvelController {

    private MarvelService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/characters")
    public CharactersResponse findAll() {
        return service.findAll();
    }
    
    
}
