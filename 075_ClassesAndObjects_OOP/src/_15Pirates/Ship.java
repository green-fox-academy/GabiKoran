package _15Pirates;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.ArrayList;

public class Ship {
    //The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    ArrayList<Pirate> crewOfShip = new ArrayList<>();
    Pirate captain;
    //When a ship is created it doesn't have a crew or a captain.

    //The ship can be filled with pirates and a captain via fillShip() method.
    //Filling the ship with a captain and random number of pirates.
    public void fillShip(Pirate captain) {
        this.captain = captain;
        int numberOfCrew = (int)(Math.random() * 20);
        for (int i = 0; i < numberOfCrew; i++) {
            this.crewOfShip.add(new Pirate());
        }
    }

    //Ships should be represented in a nice way on command line including information about
    //!!!!! captains consumed rum, state (passed out / died) !!!!!
    //number of alive pirates in the crew
    public void represent() {
        if (!this.captain.isAlive) {
            System.out.println("Captain had died.");
        } else {
            System.out.print("Captain is alive");
            if (this.captain.intoxication >= 5) {
                System.out.println(", but he's passed off.");
            } else if (this.captain.intoxication > 0) {
                System.out.printf(" and awaken, but he comsumed rum at %d times.\n", this.captain.intoxication);
            } else if (this.captain.intoxication == 0) {
                System.out.println(" and he's sober.");
            }
        }
        int aliveCounter = 0;
        for (int i = 0; i < this.crewOfShip.size(); i++) {
            if (this.crewOfShip.get(i).isAlive) {
                aliveCounter ++;
            }
        }
        System.out.printf("Number of alive pirates in the crew: %d", aliveCounter);
    }

    //Ships should have a method to battle other ships: ship.battle(otherShip)
    //should return true if the actual ship (this) wins
    //the ship should win if its calculated score is higher
    //calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    //The loser crew has a random number of losses (deaths).
    //The winner captain and crew has a party, including a random number of rum :)
    public boolean battle(Ship anotherShip) {
        // counting this ship's score:
        int aliveCounter = 0;
        for (int i = 0; i < this.crewOfShip.size(); i++) {
            if (this.crewOfShip.get(i).isAlive) {
                aliveCounter++;
            }
        }
        int scoreThisShip = aliveCounter - this.captain.intoxication;
        // counting another ship's score:
        int aliveCounterOfAnotherShip = 0;
        for (int i = 0; i < anotherShip.crewOfShip.size(); i++) {
            if (anotherShip.crewOfShip.get(i).isAlive) {
                aliveCounterOfAnotherShip++;
            }
        }
        int scoreAnotherShip = aliveCounterOfAnotherShip - anotherShip.captain.intoxication;
        // who wins the battle:
        if (scoreThisShip > scoreAnotherShip) {
            for (int i = 0; i < anotherShip.crewOfShip.size(); i++) {       // ha ez a hajó nyert, akkor
                if ((int) (Math.random() + 1) == 0) {                       // az ellenfél crew-jában random számú kalóz haljon meg
                    anotherShip.crewOfShip.get(i).isAlive = false;
                }
            }
            for (int i = 0; i < this.crewOfShip.size(); i++) {
                this.crewOfShip.get(i).intoxication += (int) (Math.random() + 4);
            }
            return true;
        } else if (scoreThisShip < scoreAnotherShip) {
            for (int i = 0; i < this.crewOfShip.size(); i++) {       // ha ez a hajó nyert, akkor
                if ((int) (Math.random() + 1) == 0) {                       // az ellenfél crew-jában random számú kalóz haljon meg
                    this.crewOfShip.get(i).isAlive = false;
                }
            }
            for (int i = 0; i < anotherShip.crewOfShip.size(); i++) {
                anotherShip.crewOfShip.get(i).intoxication += (int) (Math.random() + 4);
            }
            return false;
        } else {
            return false;
        }
    }
}
