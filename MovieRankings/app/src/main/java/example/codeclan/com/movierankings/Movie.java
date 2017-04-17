package example.codeclan.com.movierankings;

/**
 * Created by user on 17/04/2017.
 */
public class Movie {
        private String name;
        private String genre;
        private int ranking;

    public Movie(String name, String genre, int ranking) {
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getName() {
        String name = this.name;
        return name;
    }

    public String getGenre() {
        String genre = this.genre;
        return genre;
    }

    public int getRanking() {
        int ranking = this.ranking;
        return ranking;
    }
}
