public class StringsHaventTheSameLengthsException extends Throwable {

    public StringsHaventTheSameLengthsException() {
        System.err.println("These words cannot be anagrams of each other, because their lengths are not the same.");
    }
}
