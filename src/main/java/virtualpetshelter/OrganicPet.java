package virtualpetshelter;

public class OrganicPet extends VirtualPet {
    public Integer hunger;
    public Integer thirst;
    public Integer waste;

    public OrganicPet(String name, String description, String type, int boredom, int health, int happiness, int hunger, int thirst, int waste) {
        super(name, description, type, boredom, health, happiness);

        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }

    public static void feedPet(OrganicPet pet) {
        pet.hunger += 5;
    }


    public int getHungerLevel() {
        return hunger;
    }

    public int getThirstLevel() {
        return thirst;
    }

    public int getWasteLevel() {
        return waste;
    }


}
