package NumberSuming;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SummatorTest {

    @org.junit.jupiter.api.Test
    void testSumOfIntegers()
    {
        assertEquals(8, Summator.sum(5,3));
    }

    @org.junit.jupiter.api.Test
    void testSumOfFloating()
    {
        assertEquals(8f, Summator.sum(5f,3f));
    }

    @org.junit.jupiter.api.Test
    void testSumOfStrings()
    {
        assertEquals("123", Summator.sum("12","3"));
        assertNull(Summator.sum("ds",null));
    }

    @org.junit.jupiter.api.Test
    void testSumOfBigIntegers()
    {
        assertEquals(BigInteger.valueOf(10), Summator.sum(BigInteger.valueOf(5),BigInteger.valueOf(5)));
        assertNull(Summator.sum(BigInteger.valueOf(5),null));
    }

    @org.junit.jupiter.api.Test
    void testSum3()
    {
        assertEquals(BigDecimal.valueOf(10), Summator.sum(BigDecimal.valueOf(5),BigDecimal.valueOf(5)));
        assertNull(Summator.sum(BigDecimal.valueOf(5),null));
    }
}