package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 16/01/2017.
 */

public class MovieTest {
    Movie movie;
    Movie movie2;

    @Before
    public void before() {
        movie = new Movie("Jaws", "Action", 1);
        movie2 = new Movie("Watership Down", "Cartoon", 2);
    }

    @Test
    public void canGetTitle(){
        assertEquals("Jaws", movie.getTitle());
    }

    @Test
    public void canSetTitle(){
        movie.setTitle("Jaws 2");
        assertEquals("Jaws 2", movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Action", movie.getGenre());
    }

    @Test
    public void canSetGenre(){
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void canGetRanking(){
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking(){
        movie.setRanking(3);
        assertEquals(3, movie.getRanking());
    }

    @Test
    public void canToString(){
        String string = movie.toString(movie);
        assertEquals("Title: 'Jaws', Genre: 'Action', Ranking: 1", string);
    }


}


