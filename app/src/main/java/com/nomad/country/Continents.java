package com.nomad.country;

public class Continents {
    private String name;
    private Integer image;
    private Integer id;

    public Continents(String name, Integer image) {
        this.name = name;
        this.image = image;
    }

    public Continents(String name, Integer image, Integer id) {
        this.name = name;
        this.image = image;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }


}
