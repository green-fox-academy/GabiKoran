public class _02Greet {
    public static void main(String[] args) {
        //  From now on, create the usual class wrapper
        //  and main method on your own.

        // - Create a string variable named `al` and assign the value `Green Fox` to it
        String al ="Green Fox";
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox
        // - Greet `al`
        System.out.println(greet(al));
    }
    public static String greet(String name) {
        String greeting = "Greetings dear, " + name;
        return greeting;
    }
}
