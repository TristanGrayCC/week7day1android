package example.codeclan.com.movierankings;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    @Test
    public void hasName(){
        Movie movie = new Movie("Sunshine", "Sci-Fi", 7);
        assertEquals("Sunshine", movie.getName());
    }

    @Test
    public void hasGenre(){
        Movie movie = new Movie("Sunshine", "Sci-Fi", 7);
        assertEquals("Sci-Fi", movie.getGenre());
    }

    @Test
    public void hasRanking(){
        Movie movie = new Movie("Sunshine", "Sci-Fi", 7);
        assertEquals(7, movie.getRanking());
    }
}
