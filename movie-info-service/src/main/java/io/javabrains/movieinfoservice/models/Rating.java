package io.javabrains.movieinfoservice.models;

import lombok.Getter;
import lombok.Setter;

public class Rating {

    @Getter
    @Setter
    private String movieId;

    @Getter
    @Setter
    private int rating;

    public Rating() {
    }

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
