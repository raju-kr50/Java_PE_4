package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter replaceCharacter;
    //Creating object before running the test cases
    @Before
    public void setUp() throws Exception {
        this.replaceCharacter = new ReplaceCharacter();
    }

    //Destroying object after running the test cases
    @After
    public void tearDown() throws Exception {
    this.replaceCharacter = null;
    }

    @Test
    public void givenStringShouldReturnStringReplacedWithSomeCharacter() {
        String actualResut = replaceCharacter.characterReplacer("daily dry");
        assertEquals("faity fry",actualResut);
    }

    @Test
    public void givenStringShouldReturnNotNull() {
        String actualResut = replaceCharacter.characterReplacer("daily dry");
        assertNotNull(actualResut);
    }

    @Test
    public void givenNullShouldReturnNull() {
        String actualResut = replaceCharacter.characterReplacer(null);
        assertNull(actualResut);
    }
}