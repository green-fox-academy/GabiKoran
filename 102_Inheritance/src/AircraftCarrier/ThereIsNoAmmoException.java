package AircraftCarrier;

public class ThereIsNoAmmoException extends Exception {

    public ThereIsNoAmmoException() {
        super("The carrier's ammo storage is zero.");
    }
}