package io.javabrains.moviecatalogservice.model;

import lombok.Getter;
import lombok.Setter;

public class CatalogItem {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private Integer rating;

    public CatalogItem(String name, String description, Integer rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

}
