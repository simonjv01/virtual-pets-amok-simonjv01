package virtualpetshelter;

public class RobotPet extends VirtualPet {

    public Integer oilLevel;

    public RobotPet(String name, String description, String type, int boredom, int health, int oilLevel, int happiness) {
        super(name, description, type, boredom, health, happiness);

        this.oilLevel = oilLevel;

    }

    public static void oilPet(RobotPet pet) {

        pet.oilLevel += 5;
        pet.happiness += 5;
        pet.health += 5;
    }

    public int getOilLevel() {

        return oilLevel;
    }


}
