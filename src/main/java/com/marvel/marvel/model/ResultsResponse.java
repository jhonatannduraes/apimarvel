package com.marvel.marvel.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ResultsResponse {

    private Long id;
    private String name;
    private String description;

}
