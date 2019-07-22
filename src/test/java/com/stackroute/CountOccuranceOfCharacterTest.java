package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccuranceOfCharacterTest {
    CountOccuranceOfCharacter countOccuranceOfCharacter;

    //Creating object before running the test cases
    @Before
    public void setUp() {
        this.countOccuranceOfCharacter = new CountOccuranceOfCharacter();

    }
    //Destroying object after running the test cases
    @After
    public void tearDown() {
        this.countOccuranceOfCharacter = null;
    }

    @Test
    public void givenAStringShouldReturnTheNumberOfOccuranceOfCharacter() {
        String input = "Java is java again java again";
        String actualResult = countOccuranceOfCharacter.countOccurance(input, 'a');
        assertEquals("The number of occurance of a in the string is 10", actualResult);
    }

    @Test
    public void givenAStringShouldReturnTheNumberOfOccuranceOfCharacterZero() {
        String input = "fhehv wnfwenvk kwenfkwen knfwenf";
        String actualResult = countOccuranceOfCharacter.countOccurance(input, 'a');
        assertEquals("The number of occurance of a in the string is 0", actualResult);
    }
    @Test
    public void givenNullShouldReturnErrorMessage() {
        String input = "";
        String actualResult = countOccuranceOfCharacter.countOccurance(input, 'a');
        assertEquals("Error: This is null", actualResult);
    }
}