import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    @Test
    public void getName() {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }
}