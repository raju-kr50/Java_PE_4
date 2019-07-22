package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsHarryTest {
    IsHarry isHarry;

    //Creating object before running the test cases
    @Before
    public void setUp() {
        this.isHarry = new IsHarry();
    }

    //Destroying object after running the test cases
    @After
    public void tearDown() {
        this.isHarry = null;
    }

    @Test
    public void givenStringShouldReturnHarryPresent() {
        String actualResult = isHarry.stringMatcher("This is Harry?");
        assertEquals("Is Harry here ? true", actualResult);
    }

    @Test
    public void givenStringShouldReturnHarryNotPresent() {
        String actualResult = isHarry.stringMatcher("This is Henry?");
        assertEquals("Is Harry here ? false", actualResult);
    }

    @Test
    public void givenStringShouldReturnNotNull() {
        String actualResult = isHarry.stringMatcher("This is Harry?");
        assertNotNull(actualResult);
    }

}