import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleFunctionExamplesTest {

    private static SimpleFunctionExamples sf;

    @BeforeClass
    public static void init() {
        sf = new SimpleFunctionExamples();
    }

    @Test
    public void add_should_addNumbers_when_numbersAreGiven() {
        // AAA - Triple A

        // Assignment
        int number1 = 1;
        int number2 = 2;
        int number3 = -3;
        int expectedResult1 = 3;
        int expectedResult2 = -1;

        // Act
        int result1 = sf.add(number1, number2);
        int result2 = sf.add(number2, number3);

        // Assertion
        assertEquals(expectedResult1, result1);
        assertEquals(expectedResult2, result2);
    }

    @Test
    public void add_shoud_returnIntegerMaxVelue_when_sumIsBiggerThanMaximum() {
        int max = Integer.MAX_VALUE;
        int number = 5;
        int expectedResult = Integer.MAX_VALUE;

        int result = sf.add(max, number);

        assertEquals(expectedResult, result);
    }

    @Test
    public void arrayAverage_should_returnAverage_when_numberArrayIsGiven() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
        float expectedResult1 = 3f;
        float expectedResult2 = 3.5f;

        float result1 = sf.arrayAverage(numbers);
        float result2 = sf.arrayAverage(numbers2);

        assertEquals(expectedResult1, result1, 0.01);
        assertEquals(expectedResult2, result2, 0.01);
    }

    @Test
    public void arrayAverage_should_return0_when_emptyArrayIsGiven() {
        int[] emptyArray = {};
        float expextedResult = 0;

        float result = sf.arrayAverage(emptyArray);

        assertEquals(expextedResult, result, 0.01);
    }

    @Test
    public void arrayAverage_should_return0_when_nullIsGiven() {
        float expectedResult = 0;

        float result = sf.arrayAverage(null);

        assertEquals(expectedResult, result, 0.01);
    }

}