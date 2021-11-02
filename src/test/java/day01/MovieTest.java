package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie movie = new Movie("TestName",2000);

    @Test
    void testActorsInTheirTwenites() {

        movie.addActor(new Actor("Jon Doe",1969));
        movie.addActor(new Actor("Jon Doe",1970));
        movie.addActor(new Actor("Jon Doe",1971));
        movie.addActor(new Actor("Jon Doe",1979));
        movie.addActor(new Actor("Jon Doe",1980));
        movie.addActor(new Actor("Jon Doe",1981));

        assertEquals(3, movie.actorsInTheirTwenites());
    }
}