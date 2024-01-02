package com.example.PigLatin.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PigLatinConverterTest {

    PigLatinConverter pigLatinConverter = new PigLatinConverter();

    @Test
    public void testConvertToPigLatin_RegularSentence(){
        assertEquals("Isthay isay aay esttay", pigLatinConverter.convertToPigLatin("This is a test"));
    }

    @Test
    public void testConvertToPigLatin_WithPunctuation() {
        assertEquals("Isthay isay aay esttay.", pigLatinConverter.convertToPigLatin("This is a test."));
    }

    @Test
    public void testConvertToPigLatin_WithUpperCase(){
        assertEquals("Isthay isay aay esttay", pigLatinConverter.convertToPigLatin("This IS A tESt"));
    }

    @Test
    public void testConvertToPigLatin_EmptyString(){
        assertEquals("", pigLatinConverter.convertToPigLatin(""));
    }

    @Test
    public void testConvertToPigLatin_MultipleSentences(){
        assertEquals("Isthay isay aay esttay. Ithway aay econdsay entencesay!", pigLatinConverter.convertToPigLatin("This is a test. With a second sentence!"));
    }

}
