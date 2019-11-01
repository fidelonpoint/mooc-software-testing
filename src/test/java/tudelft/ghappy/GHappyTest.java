package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void isHappy(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isNotHappy(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxgxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void isNotHappy1(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }

}
