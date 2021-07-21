package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String externalId;
    private Value data;

    public Quote() {
    }



    public void setType(String type) {
        this.externalId = type;
    }


    public void setValue(Value value) {
        this.data = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + externalId + '\'' +
                ", value=" + data +
                '}';
    }
}