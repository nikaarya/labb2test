package org.example;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class TextProcessorTest {
    @AfterEach
    void init() {
        System.out.println("Testing... Testing..");
    }

    @Test
    @DisplayName("Stora")
    public void upperCaseTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("HEJ VÄRLDEN!".equals(textProcessor.upper("Hej Världen!")));
    }

    @Disabled
    @DisplayName("Små")
    public void lowerCaseTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("hej världen!".equals(textProcessor.lower("hej världen!")));

    }

    @RepeatedTest(4)
    @DisplayName("Omvänd")
    public void backwardsTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("!nedlräV jeH".equals(textProcessor.turn("Hej Världen!")));
        assertNotNull("Hej Världen!");
    }
}
