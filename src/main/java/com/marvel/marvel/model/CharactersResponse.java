package com.marvel.marvel.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class CharactersResponse {

    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private DataResponse data;

}
