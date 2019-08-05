package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId") String movieId){

        RestTemplate restTemplate = new RestTemplate();
        Rating rating = restTemplate.getForObject("http://localhost:8083/ratingsdata/5", Rating.class);

        return rating;
    }
}
