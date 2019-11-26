package _15Pirates;

public class Pirate {
    boolean isAlive;
    int intoxication; // 0 - józan -> 5 - elájul és kidől
    boolean isAwake;

    public Pirate() {
        this.isAlive = true;
        intoxication = 0;
        this.isAwake = true;
    }

    public void drinkSomeRum() { // részegíti a kalózt
        if (this.intoxication <= 4) {
            this.intoxication ++;
        } else if (this.intoxication == 5) {
            this.isAwake = false;
            this.intoxication ++;
            System.out.println("He can't drink, because he's passed off.");
        } else if (this.intoxication > 5) {
            System.out.println("He can't drink, because he's passed off.");
        }
    }

    public void howsItGoingMate() { // ha ez meg van hívva, a kalóz válaszol:
        if (this.intoxication < 4) {
            System.out.println("\"Pour me anudder!\"");     // 0 - 4-szer "Tölts még!"
        } else if (this.intoxication == 4) {
            System.out.println("\"Arghh, I'ma Pirate. How d'ya d'ink its goin?\"");
            this.isAwake = false;                           // egyébként elájul és elalszik
        }
        this.drinkSomeRum();

    }

    public void die() {  // ez megöli a kalózt... (drinkSomeRum etc.)
        this.isAlive = false;
        System.out.println("He's dead.");
    }

    public void brawl(Pirate nameOfPirate) {    // harcol egy másik kalózzal, ha a másik életben van
            // 1/3 az esély, hogy az egyik, vagy a másik, vagy mindketten meghallnak
    }
}
