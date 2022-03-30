package day31_Constructors.movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat Altay", new ArrayList<>(Arrays.asList("Asiya", "Adam", "Muhtar", "Musa", "Ahmet", "Ayse", "Mehmet", "Fatma")));
        System.out.println(movie);
    }
}

/*
    3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */