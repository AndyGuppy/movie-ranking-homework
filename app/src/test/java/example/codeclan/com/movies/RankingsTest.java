package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 16/01/2017.
 */

public class RankingsTest {
    Rankings rankings;
    Movie movie;
    Movie movie2;
    Movie movie3;


    @Before
    public void before(){
        rankings = new Rankings();
        movie = new Movie("Jaws", "Comedy", 1);
        movie2 = new Movie("Watership Down", "Horror", 2);
        movie3 = new Movie("Jurassic Park", "Action", 3);
    }

    @Test
    public void canGetRankings(){
        assertNotNull(rankings.getRankings());
    }

    @Test
    public void canGetLength(){
        assertEquals(0, rankings.getLength());
    }

    @Test
    public void canAddMovie(){
        rankings.addMovie(movie);
        assertEquals(1, rankings.getLength());
    }

    @Test
    public void canAddMovieByRating(){
        rankings.addMovieByRating(movie);
        assertEquals(movie, rankings.getMovieByIndex(0));
    }

    @Test
    public void canReplaceLastMovie(){
        rankings.addMovie(movie);
        rankings.addMovie(movie2);
        rankings.replaceLastMovie(movie3);
        assertEquals(movie3, rankings.getMovieByIndex(1));
    }




}












