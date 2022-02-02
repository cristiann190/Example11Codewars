package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigPowTest {

    @Test
    public void TestNumber1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }

    @Test
    public void TestMissingNumber() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }

    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }

    @Test
    public void Test4() {
        assertEquals(-1, DigPow.digPow(46288, 5));
    }
}