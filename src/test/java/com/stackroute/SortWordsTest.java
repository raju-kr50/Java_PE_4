package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;
    @Before
    public void setUp() {
        this.sortWords = new SortWords();
    }

    @After
    public void tearDown() {
        this.sortWords = null;
    }

    @Test
    public void givenStringOfWordsShouldReturnSortedWords() {
        String actualResult = sortWords.sort("This is just a String which needs to be sorted into alphabetical order");
        assertEquals("a alphabetical be into is just needs order sorted string this to which ", actualResult);
    }

    @Test
    public void givenStringOfWordsShouldNotNull() {
        String actualResult = sortWords.sort("This is just a String which needs to be sorted into alphabetical order");
        assertNotNull(actualResult);
    }

    @Test
    public void givenNullShouldReturnNull(){
        String actualResult =sortWords.sort(null);
        assertNull(actualResult);
    }
}