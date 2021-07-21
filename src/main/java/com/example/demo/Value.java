package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long filmId;
    private String nameRu;

    public Value() {
    }


    public void setId(Long id) {
        this.filmId = id;
    }

    public void setQuote(String quote) {
        this.nameRu = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + filmId +
                ", quote='" + nameRu + '\'' +
                '}';
    }
}