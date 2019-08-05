package io.javabrains.ratingdataservice.models;

import lombok.Getter;
import lombok.Setter;

public class Rating {

    @Getter
    @Setter
    private String movieId;

    @Getter
    @Setter
    private int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
