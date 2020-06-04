package virtualpetshelter;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class OrganicCatTest {

    OrganicCat organicCat = new OrganicCat("rosie","cat","real cat",2,44,45,46,45,45, 50);

    @Test
    public void shouldBeAbleToReturnWasteLevel() {
        Integer wasteLevel = organicCat.getWasteLevel();
        assertThat(wasteLevel).isEqualTo(45);

    }

    @Test
    public void shouldBeAbltToReturnThirstLevel() {
        Integer thirstLevel = organicCat.getThirstLevel();
        assertThat(thirstLevel).isEqualTo(45);
    }

    @Test
    public void shouldBeAbleToReturnHungerLevel() {
        Integer hungerLevel = organicCat.getHungerLevel();
        assertThat(hungerLevel).isEqualTo(46);
    }

    @Test
    public void shouldBeAbleToReturnHealthLevel() {
        Integer healthLevel = organicCat.getHealth();
        assertThat(healthLevel).isEqualTo(44);
    }

    @Test
    public void shouldBeAbleToReturnLitterLevel() {
        Integer litterLevel = organicCat.getLitterLevel();
        assertThat(litterLevel).isEqualTo(50);
    }

}
