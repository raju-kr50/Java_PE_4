package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {
    StringMatcher matcher;
    //Creating object before running the test cases
    @Before
    public void setUp() {
        this.matcher = new StringMatcher();
    }

    //Destroying object after running the test cases
    @After
    public void tearDown() {
        this.matcher = null;
    }

    @Test
    public void givenStringShouldReturnIndexOfString(){
        String expectedResult = "Found at: 4-6\n"+"Found at: 10-12\n"+"Found at: 27-29\n";
        String actualResult = matcher.stringMatcher("She sells seashells by the seashore","se");
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenStringShouldNotReturnNull(){
        String expectedResult = "Found at: 4-6\n"+"Found at: 10-12\n"+"Found at: 27-29\n";
        String actualResult = matcher.stringMatcher("She sells seashells by the seashore","se");
        assertNotNull(actualResult);
    }

    @Test
    public void givenNullShouldNotReturnNull(){
        String expectedResult = null;
        String actualResult = matcher.stringMatcher(null,"se");
        assertNull(null);
    }
}