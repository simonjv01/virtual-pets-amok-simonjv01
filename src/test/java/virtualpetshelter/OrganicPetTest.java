package virtualpetshelter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrganicPetTest {

    VirtualPetShelter shelter = new VirtualPetShelter();
    OrganicCat organicCat = new OrganicCat("Kitty","organic cat","cat",1,2,3,4,3, 3,50);
    OrganicDog organicDog = new OrganicDog("Doggy","organic dog","dog",1,2,3,4, 5, 3, 50);


    @Test
    public void shouldBeAbleToGetBoredom() {
        organicCat.getBoredom();
        organicDog.getBoredom();

        assertThat(organicCat.getBoredom()).isEqualTo(1);
        assertThat(organicDog.getBoredom()).isEqualTo(1);

    }

    @Test
    public void shouldBeAbleToRetrieveName() {
        organicDog.getName();
        organicCat.getName();
        assertThat(organicDog.name).isEqualTo("Doggy");
    }



}
