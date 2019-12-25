package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private String name;
    private List<Aircraft> carrierName;
    private int ammoStorage;
    private int healthPoints;

    public Carrier(String name, int ammoStorage, int healthPoints) {
        this.name = name;
        this.carrierName = new ArrayList<Aircraft>();
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft) {
        this.carrierName.add(aircraft);
    }

    public int getNeededAmmo() {
        int neededAmmo = 0;
        for (int i = 0; i < this.carrierName.size(); i++) {
            neededAmmo += (this.carrierName.get(i).getMaxAmmo() - this.carrierName.get(i).getAmmunition());
        }
        return neededAmmo;
    }

    public void fill() throws ThereIsNoAmmoException {
        if (this.ammoStorage == 0) {
            throw new ThereIsNoAmmoException();
        } else if (this.getNeededAmmo() <= this.ammoStorage) {
            for (int i = 0; i < this.carrierName.size(); i++) {
                this.ammoStorage = this.carrierName.get(i).refill(this.ammoStorage);
            }
        } else {
            List<Aircraft> firstPriorityAircrafts = new ArrayList<Aircraft>();
            List<Aircraft> secondPriorityAircrafts = new ArrayList<Aircraft>();
            for (int i = 0; i < this.carrierName.size(); i++) {
                if (this.carrierName.get(i).isPriority()) {
                    firstPriorityAircrafts.add(this.carrierName.get(i));
                } else {
                    secondPriorityAircrafts.add(this.carrierName.get(i));
                }
            }
            for (int i = 0; i < firstPriorityAircrafts.size(); i++) {
                if ((firstPriorityAircrafts.get(i).getMaxAmmo() - firstPriorityAircrafts.get(i).getAmmunition()) <= this.ammoStorage) {
                    this.ammoStorage = firstPriorityAircrafts.get(i).refill(this.ammoStorage);
                } else {
                    firstPriorityAircrafts.get(i).setAmmunition(this.ammoStorage);
                    this.ammoStorage = 0;
                }
            }
            if (this.ammoStorage > 0) {
                for (int i = 0; i < secondPriorityAircrafts.size(); i++) {
                    if ((secondPriorityAircrafts.get(i).getMaxAmmo() - secondPriorityAircrafts.get(i).getAmmunition()) < this.ammoStorage) {
                        this.ammoStorage = secondPriorityAircrafts.get(i).refill(this.ammoStorage);
                    } else {
                        secondPriorityAircrafts.get(i).setAmmunition(this.ammoStorage);
                        this.ammoStorage = 0;
                    }
                }
            }
        }
    }


    public void fight(Carrier anotherCarrier) {
        if (this.getHealthPoints() != 0 && anotherCarrier.getHealthPoints() != 0) {
            int totalDamage = 0;
            for (int i = 0; i < this.carrierName.size(); i++) {
                totalDamage += this.carrierName.get(i).fight();
            }
            if (anotherCarrier.getHealthPoints() > totalDamage) {
                anotherCarrier.setHealthPoints(anotherCarrier.getHealthPoints() - totalDamage);
            } else {
                anotherCarrier.setHealthPoints(0);
                System.out.println("It's dead Jim :(");
            }
        }
    }

    public String getStatus() {
        String status = "";
        int totalDamage = 0;
        for (int i = 0; i < this.carrierName.size(); i++) {
            totalDamage += this.carrierName.get(i).getAllDamage();
        }
        status += "HP: " + this.healthPoints + ", Aircraft count: " + this.carrierName.size() + ", Ammo Storage: " + this.ammoStorage + ", Total damage: " + totalDamage + "\n";
        status += "Aircrafts:\n";
        for (int i = 0; i < this.carrierName.size(); i++) {
            status += this.carrierName.get(i).getStatus() + "\n";
        }
        return status;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
