package io.javabrains.movieinfoservice.models;

import lombok.Getter;
import lombok.Setter;

public class Movie {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
