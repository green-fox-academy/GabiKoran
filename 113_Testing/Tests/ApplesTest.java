import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void getApple() {
        Apples apple = new Apples();
        assertEquals("Apple", apple.getApple());
    }
}