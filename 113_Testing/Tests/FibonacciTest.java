import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciShouldWorkCorrectlyWhenAPositiveIntegerWasGiven() throws NegativeIntegerException {
        assertEquals(0, fibonacci.fibonacci(0));
        assertEquals(5, fibonacci.fibonacci(5));
        assertEquals(8, fibonacci.fibonacci(6));
    }

    @Test (expected = NegativeIntegerException.class)
    public void fibonacciShouldSendErrorMessageWhenNegativeIntegerWereGiven() throws NegativeIntegerException {
        fibonacci.fibonacci(-5);
    }
}