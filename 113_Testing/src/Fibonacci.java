public class Fibonacci {

    public int fibonacci(int n) throws NegativeIntegerException {
        if (n < 0) {
            throw new NegativeIntegerException();
        } else if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
