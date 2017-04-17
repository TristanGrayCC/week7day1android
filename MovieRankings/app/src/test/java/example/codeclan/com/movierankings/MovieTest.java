package example.codeclan.com.movierankings;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    @Test
    public void hasname(){
        Movie movie = new Movie("Sunshine", "Sci-Fi", 7);
        assertEquals("Sunshine", movie.getName());
    }
}
