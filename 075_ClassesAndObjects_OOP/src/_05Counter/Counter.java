package _05Counter;

public class Counter {
    //Create Counter class
    //which has an integer field value
    int counter;
    int originalValue;

    //when creating it should have a default value 0 or we can specify it when creating
    public Counter() {
        this.counter = 0;
        originalValue = 0;
    }

    public Counter(int givenNumber) {
        this.counter = givenNumber;
        originalValue = givenNumber;
    }

    //we can add(number) to this counter another whole number
    public void add(int addingNumber) {
        counter += addingNumber;
    }

    //or we can add() without parameters just increasing the counter's value by one
    public void add() {
        counter++;
    }

    //and we can get() the current value
    public int getCounter() {
        return counter;
    }

    //also we can reset() the value to the initial value
    public void reset() {
        counter = originalValue;
    }

    public int get() {
        return  counter;
    }

    //Check if everything is working fine with the proper test
    //Download CounterTest.java and place it next to your solution
    //If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
    //Then run the tests with the green play button before the lines (run all of them before the classname)
}
