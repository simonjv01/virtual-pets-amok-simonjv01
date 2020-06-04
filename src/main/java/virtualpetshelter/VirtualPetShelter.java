package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> shelterPets = new HashMap<>();

    public void addPet(VirtualPet pet) {
        shelterPets.put(pet.getName(), pet);
    }

    public Collection<VirtualPet> getAllPets() {
        return shelterPets.values();
    }


    public VirtualPet findPet(String name) {

        return shelterPets.get(name);
    }

    public void removePet(VirtualPet pet) {

        shelterPets.remove(pet.getName());
    }



    public Collection<OrganicPet> listOrganicPets() {
        Map<String, OrganicPet> organicPets = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicPet) {
                organicPets.put(pet.getName(), (OrganicPet) pet);
            }

        }
        return organicPets.values();


    }

    public Collection<RobotPet> listRobotPets() {
        Map<String, RobotPet> robotPets = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof RobotPet) {
                robotPets.put(pet.getName(), (RobotPet) pet);
            }
        }
        return robotPets.values();
    }

    public Collection<RobotPet> oilAllRobotPets() {
        Map<String, RobotPet> robotPets = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof RobotPet) {
                ((RobotPet) pet).oilLevel += 5;
                ((RobotPet) pet).happiness += 5;
                ((RobotPet) pet).health += 5;
            }
        }
        return robotPets.values();
    }

    public Collection<OrganicPet> waterAllOrganicPets() {
        Map<String, OrganicPet> organicPets = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).thirst += 5;
                ((OrganicPet) pet).happiness += 5;
                ((OrganicPet) pet).health += 5;
            }
        }
        return organicPets.values();
    }

    public Collection<OrganicPet> feedAllOrganicPets() {
        Map<String, OrganicPet> organicPets = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).hunger += 5;
            }
        }
        return organicPets.values();
    }


    public Collection<OrganicDog> walkAllOrganicDogs() {
        Map<String, OrganicDog> organicDogs = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).happiness += 5;
                ((OrganicDog) pet).health += 5;
                ((OrganicDog) pet).thirst -= 5;
                ((OrganicDog) pet).hunger += 5;
                ((OrganicDog) pet).waste -= 5;
                ((OrganicDog) pet).cageCleanliness -= 2;
            }
        }
        return organicDogs.values();
    }

    public Collection<RobotDog> walkAllRobotDogs() {
        Map<String, RobotDog> robotDogs = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof RobotDog) {
                ((RobotDog) pet).health += 5;
                ((RobotDog) pet).happiness += 5;
                ((RobotDog) pet).oilLevel -= 1;

            }
        }
        return robotDogs.values();
    }

    public Collection<OrganicDog> cleanAllCages() {
        Map<String, OrganicDog> organicDogs = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cageCleanliness -= 15;
                ((OrganicDog) pet).happiness += 15;
                ((OrganicDog) pet).health += 15;
                ((OrganicDog) pet).waste -= 15;
            }
        }
        return organicDogs.values();
    }

    public Collection<OrganicCat> cleanAllLitterBoxes() {
        Map<String, OrganicCat> organicCats = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).litterLevel -= 15;
                ((OrganicCat) pet).happiness += 15;
                ((OrganicCat) pet).health += 15;
                ((OrganicCat) pet).waste -= 15;
            }
        }
        return organicCats.values();
    }

    public void playPet(String name) {
        int playAmt = 5;
        VirtualPet subtractBoredomBalance = findPet(name);
        subtractBoredomBalance.playPet(playAmt);
    }

    public Collection<OrganicDog> organicDogTick() {
        Map<String, OrganicDog> organicDog = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).hunger += 5;
                ((OrganicDog) pet).thirst += 5;
                ((OrganicDog) pet).health += 5;
                ((OrganicDog) pet).happiness += 2;
                ((OrganicDog) pet).waste += 5;
                ((OrganicDog) pet).boredom += 5;
                ((OrganicDog) pet).cageCleanliness += 5;
            }
        }
        return organicDog.values();
    }

    public Collection<OrganicCat> organicCatTick() {
        Map<String, OrganicCat> organicCat = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).hunger += 5;
                ((OrganicCat) pet).thirst += 5;
                ((OrganicCat) pet).health += 5;
                ((OrganicCat) pet).happiness += 2;
                ((OrganicCat) pet).waste += 5;
                ((OrganicCat) pet).boredom += 5;
                ((OrganicCat) pet).litterLevel += 5;
            }
        }
        return organicCat.values();
    }

    public Collection<RobotCat> robotCatTick() {
        Map<String, RobotCat> robotCat = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof RobotCat) {
                ((RobotCat) pet).health += 5;
                ((RobotCat) pet).happiness += 2;
                ((RobotCat) pet).boredom += 5;
                ((RobotCat) pet).oilLevel += 5;
            }
        }
        return robotCat.values();
    }
    public Collection<RobotDog> robotDogTick() {
        Map<String, RobotDog> robotDog = new HashMap<>();
        for (VirtualPet pet : shelterPets.values()) {
            if (pet instanceof RobotDog) {
                ((RobotDog) pet).health += 5;
                ((RobotDog) pet).happiness += 2;
                ((RobotDog) pet).boredom += 5;
                ((RobotDog) pet).oilLevel += 5;
            }
        }
        return robotDog.values();
    }
}






