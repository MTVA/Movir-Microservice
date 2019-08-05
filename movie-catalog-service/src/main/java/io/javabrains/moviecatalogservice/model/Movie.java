package io.javabrains.moviecatalogservice.model;

import lombok.Getter;
import lombok.Setter;

public class Movie {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    public Movie() {
    }

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
