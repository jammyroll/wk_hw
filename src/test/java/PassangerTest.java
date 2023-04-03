import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassangerTest {
    Passanger passanger;

    @Before
    public void setUp(){
        passanger= new Passanger("James",1);
    }

    @Test
    public void hasName(){
        assertEquals("James",passanger.getName());
    }
    @Test
    public void hasBags(){
        assertEquals(1,
                passanger.getBags());
    }
}
