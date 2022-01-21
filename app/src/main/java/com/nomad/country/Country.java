package com.nomad.country;

public class Country extends Continents{
    private String nameCountry;

    public Country(String name, Integer image, String nameCountry) {
        super(name, image);
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
