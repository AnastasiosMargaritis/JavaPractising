package com.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterTest;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @Test
    public void everyNthchar () {
        char[] output = utilities.everyNthchar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);

        char[] output2 = utilities.everyNthchar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);
    }



    @Test
    public void converter() {
        int output = utilities.converter(10, 5);
        assertEquals(300, output);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            utilities.converter(10, 0);
        });
    }


    @Test
    public void nullIfOddLength() {
        String output = utilities.nullIfOddLength("Anas");
        assertEquals("Anas", output);

        String output2 = utilities.nullIfOddLength("Hello");
        assertEquals(null, output2);
    }

    @Test
    public void removePairs() {
        assertEquals("", utilities.removePairs(""));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("A", utilities.removePairs("AA"));
        assertEquals("AB", utilities.removePairs("AAAABBBBB"));
        assertEquals("Aa", utilities.removePairs("AAAAAaaaa"));
    }
}