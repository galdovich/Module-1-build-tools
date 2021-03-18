package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void isPositiveNumberPositiveTest() {
        boolean result = new StringUtils().isPositiveNumber("3.9");
        assertEquals(true, result);
    }

    @Test
    public void isPositiveNumberNegativeTest() {
        boolean result = new StringUtils().isPositiveNumber("-5");
        assertEquals(false, result);
    }
}