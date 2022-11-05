package shelter;

public class VirtualPet {

    //instance variables
    private String name;
    private int nutrition;
    private int happiness;
    private int energy;
    private String description;
    private int water;


    //constructors
    public VirtualPet(String name, int nutrition, int happiness, int energy, int water) {
        this.nutrition = nutrition;
        this.happiness = happiness;
        this.energy = energy;
        this.name = name;
        this.water = water;
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public VirtualPet(String name, String description, int nutrition, int happiness, int energy, int water) {
        this.name = name;
        this.description = description;
        this.nutrition = 50;
        this.happiness = 50;
        this.energy = 50;
        this.water = 50;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public int getNutrition() {
        return nutrition;
    }

    public String getDescription() {
        return description;
    }

    public int getWater() {
        return water;
    }


    public void updateFields (int nutrition, int happiness, int energy, int water) {
        this.nutrition += nutrition;
        this.happiness += happiness;
        this.energy += energy;
        this.water += water;
    }


    public void feedAll(){
        this.nutrition += 5;
    }


    public void waterAll(){
        this.water += 5;
        this.energy += 5;
    }


    public void tick() {
        nutrition -= 1;
        happiness -= 1;
        energy -= 1;
        water -= 1;
    }

    public void showPetStats() {
        System.out.println("Nutrition: " + getNutrition());
        System.out.println("Happiness: " + getHappiness());
        System.out.println("Energy: " + getEnergy());
        System.out.println("Water: " + getWater());
    }
}


