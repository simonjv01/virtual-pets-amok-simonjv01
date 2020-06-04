package virtualpetshelter;

public abstract class VirtualPet {
    String name;
    String description;
    String type;
    Integer boredom;
    Integer health;
    Integer happiness;

    public VirtualPet(String name, String description, String type, int boredom, int health, int happiness) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.boredom = boredom;
        this.health = health;
        this.happiness = happiness;

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getBoredom() {
        return boredom;
    }

    public void setBoredom(Integer boredom) {
        this.boredom = boredom;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getHappiness() {
        return happiness;
    }

    public void setHappiness(Integer happiness) {
        this.happiness = happiness;
    }

    public void displayBalances() {
        System.out.print(getName() + "\t |");
        System.out.print(getHealth() + "\t\t |");
        System.out.print(getHappiness() + "\t\t |");
        System.out.print(getBoredom() + "\t\t |");
        System.out.print(getType() + "\t\t |");
    }

    public void playPet(int playAmt) {
        boredom -= playAmt;
    }

    public String toString() {

        return name + "  \t" + description + "\n";

    }



}
