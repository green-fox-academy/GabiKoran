package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }
}