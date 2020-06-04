package virtualpetshelter;

public class OrganicDog extends OrganicPet {
    public Integer cageCleanliness;

    public OrganicDog(String name, String description, String type, int boredom, int health, int happiness, int hunger, int thirst, int waste, int cageCleanliness) {
        super(name, description,type, boredom, health, happiness, hunger, thirst, waste);
        this.cageCleanliness = cageCleanliness;


    }

    public Integer getCageCleanliness() {
        return cageCleanliness;
    }

    public void setCageCleanliness(Integer cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }
}
