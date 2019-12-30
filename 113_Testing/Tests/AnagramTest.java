import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;
    String text1;
    String text2;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void anagramShouldWorkCorrectlyWhenTwoStringsWereGiven() throws NullPointerException {
        text1 = "17";
        text2 = "71";
        assertTrue(anagram.isAnagram(text1, text2));

        text1 = "indul a görög";
        text2 = "görög aludni";
        assertTrue(anagram.isAnagram(text1, text2));
    }

    @Test
    public void anagramShouldWorkCorrectlyWhenDifferentSpacesAreInTheStrings() throws NullPointerException {
        text1 = "1 7 1";
        text2 = "171";
        assertTrue(anagram.isAnagram(text1, text2));
    }

    @Test
    public void anagramShouldSendErrorMessageWhenStringsHaventTheSameLengths() throws NullPointerException {
        text1 = "indul a görög aludni";
        text2 = "görög aludni";
        assertFalse(anagram.isAnagram(text1, text2));
    }

    @Test (expected = NullPointerException.class)
    public void anagramShouldSendErrorMessageWhenAtLeastOneStringIsMissing() throws NullPointerException {
        text1 = null;
        text2 = "görög aludni";
        assertFalse(anagram.isAnagram(text1, text2));
    }
}