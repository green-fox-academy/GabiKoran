import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters;
    String text1;
    HashMap<Character, Integer> testHashMap;
    HashMap<Character, Integer> expectedResult;

    @Before
    public void setUp() {
        countLetters = new CountLetters();
        testHashMap = new HashMap<>();
        expectedResult = new HashMap<>();
    }

    @Test
    public void countLettersShouldWorkCorrectlyWhenAStringIsGiven() {
        text1 = "almáspite";
        testHashMap = countLetters.countLetters(text1);

        expectedResult.put('a', 1);
        expectedResult.put('l', 1);
        expectedResult.put('m', 1);
        expectedResult.put('á', 1);
        expectedResult.put('s', 1);
        expectedResult.put('p', 1);
        expectedResult.put('i', 1);
        expectedResult.put('t', 1);
        expectedResult.put('e', 1);

        assertEquals(expectedResult, testHashMap);
    }

    @Test
    public void countLettersShouldWorkWithEmptyString() {
        text1 = "";
        testHashMap = countLetters.countLetters(text1);

        assertEquals(expectedResult, testHashMap);
    }
}