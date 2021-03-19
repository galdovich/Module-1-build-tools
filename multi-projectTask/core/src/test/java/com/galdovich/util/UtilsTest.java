package com.galdovich.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    public void isAllPositiveNumbersPositiveTest() {
        boolean result = Utils.isAllPositiveNumbers("4", "1", "6", "9", "34");
        assertEquals(true, result);
    }

    @Test
    public void isAllPositiveNumbersNegativeTest() {
        boolean result = Utils.isAllPositiveNumbers("r", "1", "-6", "9", "34");
        assertEquals(false, result);
    }
}