package AircraftCarrier;

public class Aircraft {

    private int ammunition;
    private int maxAmmo;
    private int baseDamage;
    private int damage;
    private int allDamage;
    private boolean isPriority;

    public Aircraft() {
        ammunition = 0;
    }

    public int fight() {
        damage = this.baseDamage * this.ammunition;
        this.ammunition = 0;
        this.allDamage += damage;
        return damage;
    }

    public int refill(int fillingAmmuAmount) {
        int fillingCapacityNow = this.maxAmmo - this.ammunition;
        int remainingAmmu;
        if (fillingCapacityNow <= fillingAmmuAmount) {
            this.ammunition = this.maxAmmo;
            remainingAmmu = fillingAmmuAmount - fillingCapacityNow;
        } else {
            remainingAmmu = 0;
            this.ammunition += fillingAmmuAmount;
        }
        return remainingAmmu;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + this.getType() + ", Ammo: " + this.ammunition + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.allDamage;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public int getAllDamage() {
        return allDamage;
    }
}
