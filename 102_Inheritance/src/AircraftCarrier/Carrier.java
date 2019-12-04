package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    //The carrier should be able to store aircrafts
    //Each carrier should have a store of ammo represented as number
    //The initial ammo should be given by a parameter in its constructor
    //The carrier also has a health point given in its constructor as well
    private String name;
    private List<Aircraft> carrierName;
    private int ammoStorage;
    private int healthPoints;

    public Carrier(String name, int ammo, int healthPoints) {
        this.name = name;
        this.carrierName = new ArrayList<Aircraft>();
        this.ammoStorage = ammo;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft) {
        this.carrierName.add(aircraft);
    }

    //fill
    //It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    //If there is not enough ammo then it should start to fill the aircrafts with priority first
    //If there is no ammo when this method is called, it should throw an exception
//    public void fill() {
//
//    }


    //fight
    //It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
    //getStatus
    //It should return a string about itself and all of its aircrafts' statuses in the following format:
}
