package edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void add() {
        Sample sample = new Sample();
        assertEquals("dog", sample.reverseString("god"));
    }
}