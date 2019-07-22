package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose transpose;

    //Creating object before running the test cases
    @Before
    public void setUp() {
        this.transpose = new Transpose();
    }

    //Destroying object after running the test cases
    @After
    public void tearDown() {
        this.transpose = null;
    }

    @Test
    public void givenStringShouldReturnTranspose() {
        String actualResult = transpose.transposeString("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", actualResult);
    }

    @Test
    public void givenStringShouldReturnNotNull() {
        String actualResult = transpose.transposeString("a quick brown fox jumps over the lazy dog");
        assertNotNull( actualResult);
    }

    @Test
    public void givenNullShouldReturnNull() {
        String actualResult = transpose.transposeString(null);
        assertNull(actualResult);
    }
}