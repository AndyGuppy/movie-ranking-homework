package example.codeclan.com.movies;

/**
 * Created by user on 16/01/2017.
 */

public class Movie {
    private String title;
    private String genre;
    int ranking;

    public Movie(String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String toString(Movie movie) { //must it be called this? works with other name?
        return "Title: '" + this.title + "', Genre: '" + this.genre + "', Ranking: " + this.ranking;


    }
}
