public class NegativeIntegerException extends Exception {

    public NegativeIntegerException() {
        System.err.println("You should give a positive integer. This was negative one.");
    }
}
