import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int excepted = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int excepted = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted, result);
    }

    @Test
    void testFindAbsolute2() {
        int number = -1;
        int excepted = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted, result);
    }
}