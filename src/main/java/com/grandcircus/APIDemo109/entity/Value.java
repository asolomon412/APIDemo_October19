package com.grandcircus.APIDemo109.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * This @JsonIgnoreProperties annotation allows us to skip over 
 * data that we don't want to consume from the API
 * 
 * This is optional, but encouraged
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	// @JsonProperty("quote_id") -- you can use this annotation if your instance variable names
	// don't match the properties (keys) from the json data (API)
    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}