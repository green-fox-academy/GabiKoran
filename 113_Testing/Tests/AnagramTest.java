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
    public void anagramShouldWorkCorrectlyWhenTwoStringsWereGiven() throws StringsHaventTheSameLengthsException {
        text1 = "17";
        text2 = "71";
        assertTrue(anagram.isAnagram(text1, text2));

        text1 = "indul";
        text2 = "ludni";
        assertTrue(anagram.isAnagram(text1, text2));

        text1 = "17";
        text2 = "17";
        assertFalse(anagram.isAnagram(text1, text2));
    }

    @Test (expected = StringsHaventTheSameLengthsException.class)
    public void anagramShouldThrowExceptionWhenTwoStringsLenghtsArentTheSame() throws StringsHaventTheSameLengthsException {
        text1 = "indul aludni";
        text2 = "indul";
        anagram.isAnagram(text1, text2);
    }
}