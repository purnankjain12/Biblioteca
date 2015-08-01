package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListMoviesOperationTest {

    @Test
    public void shouldKnowItsName() {
        ListMoviesOperation listMoviesOperation = new ListMoviesOperation("List Movies", new MovieLibrary(new ArrayList<Movie>(), new ArrayList<Movie>()));

        assertEquals(true, listMoviesOperation.nameEquals("List Movies"));
    }
}
