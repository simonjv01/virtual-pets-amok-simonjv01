package virtualpetshelter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrganicDogTest {

    OrganicDog organicDog = new OrganicDog("dude","dude dog","real dog",2,44,45,46,45,45, 50);

    @Test
    public void shouldBeAbleToReturnWasteLevel() {
        Integer wasteLevel = organicDog.getWasteLevel();
        assertThat(wasteLevel).isEqualTo(45);

    }

    @Test
    public void shouldBeAbltToReturnThirstLevel() {
        Integer thirstLevel = organicDog.getThirstLevel();
        assertThat(thirstLevel).isEqualTo(45);
    }

    @Test
    public void shouldBeAbleToReturnHungerLevel() {
        Integer hungerLevel = organicDog.getHungerLevel();
        assertThat(hungerLevel).isEqualTo(46);
    }

    @Test
    public void shouldBeAbleToReturnHealthLevel() {
        Integer healthLevel = organicDog.getHealth();
        assertThat(healthLevel).isEqualTo(44);
    }


    @Test
    public void shouldBeAbleToRetrieveCageLevel() {
        Integer cageLevel = organicDog.getCageCleanliness();
        assertThat(cageLevel).isEqualTo(50);
    }


}
