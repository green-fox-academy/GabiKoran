package main.java.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;

    public StringedInstrument() {
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.printf("%s, a %d-stringed instrument that goes ", this.getClass().getSimpleName(), this.numberOfStrings);
        this.sound();
    }
}