package virtualpetshelter;

public class OrganicCat extends OrganicPet{
    public Integer litterLevel;

    public OrganicCat(String name, String description, String type, int boredom, int health, int happiness, int hunger, int thirst, int waste, int litterLevel) {
        super(name, description, type, boredom, health, happiness, hunger, thirst, waste);
        this.litterLevel = litterLevel;


    }

    public Integer getLitterLevel() {
        return litterLevel;
    }

    public void setLitterLevel(Integer litterLevel) {
        this.litterLevel = litterLevel;
    }
}
