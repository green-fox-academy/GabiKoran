package TheGardenApplication;

public class Plant {

    private String name;
    private int waterAmount;
    private boolean isThirsty;
    private int thirstyLevel;
    private int absorbationLevel;
    private String plantType;

    public Plant(String name, int waterAmount) {
        this.name = name;
        this.waterAmount = waterAmount;
    }

    public boolean setIsThirsty() {
        if (waterAmount < thirstyLevel) {
            this.isThirsty = true;
        } else {
            this.isThirsty = false;
        }
        return this.isThirsty;
    }

    public String getThirstyToString() {
        if (this.setIsThirsty()) {
            return "needs water";
        } else {
            return "doesn't need water";
        }
    }

    public void info() {
        System.out.printf("The %s %s %s.\n", name, plantType, getThirstyToString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public boolean isThirsty() {
        return isThirsty;
    }

    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    public int getThirstyLevel() {
        return thirstyLevel;
    }

    public void setThirstyLevel(int thirstyLevel) {
        this.thirstyLevel = thirstyLevel;
    }

    public int getAbsorbationLevel() {
        return absorbationLevel;
    }

    public void setAbsorbationLevel(int absorbationLevel) {
        this.absorbationLevel = absorbationLevel;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }
}
