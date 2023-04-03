import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot= new Pilot("James",Rank.CAPTAIN,"GHJD3634");
    }

    @Test
    public void hasName(){
        assertEquals("James",pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals("Captain",
                pilot.getRank().getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("GHJD3634",pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("It is time for take off",pilot.flyPlane());
    }
}
