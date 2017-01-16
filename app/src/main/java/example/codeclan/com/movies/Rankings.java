package example.codeclan.com.movies;

import java.util.ArrayList;

/**
 * Created by user on 16/01/2017.
 */

public class Rankings {

    private ArrayList<Movie> movies;

    public Rankings() {
        movies = new ArrayList<Movie>();
        //add setup movies
    }

    public Rankings(ArrayList<Movie> movies) {
        movies = new ArrayList<Movie>(movies);
    }

    public ArrayList<Movie> getRankings() {
        return new ArrayList<Movie>(movies);
    }

    public int getLength() {
        return movies.size();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getMovieByIndex(int index) {
        return movies.get(index);
    }

    public void addMovieByRating(Movie movie) {
        int ranking = movie.getRanking();
        int index = ranking -1;
        movies.add(index, movie);
    }

    public void replaceLastMovie(Movie movie) {
        int index = getLength() - 1;
        movies.set(index, movie); //replaces at this index
    }
}
