package _15Pirates;

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
    // TODO: 11/26/2019  //The loser crew has a random number of losses (deaths).
    // TODO: 11/26/2019  //The winner captain and crew has a party, including a random number of rum :)
//    public boolean battle(Ship anotherShip) {
//        int aliveCounter = 0;
//        for (int i = 0; i < this.crewOfShip.size(); i++) {
//            if (this.crewOfShip.get(i).isAlive) {
//                aliveCounter ++;
//            }
//        }
//        int scoreThisShip = aliveCounter - this.captain.intoxication;
//
//        int aliveCounterOfAnotherShip = 0;
//        for (int i = 0; i < anotherShip.crewOfShip.size(); i++) {
//            if (anotherShip.crewOfShip.get(i).isAlive) {
//                aliveCounterOfAnotherShip ++;
//            }
//        }
//        int scoreAnotherShip = aliveCounterOfAnotherShip - anotherShip.captain.intoxication;
//
//        if (scoreThisShip > scoreAnotherShip) {
//            return true;
//        }
//    }
}
