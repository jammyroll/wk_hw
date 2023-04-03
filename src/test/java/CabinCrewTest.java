import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember= new CabinCrewMember("James",Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("James",cabinCrewMember.getName());
    }
    @Test
    public void hasRank(){
        assertEquals("Flight Attendant",
                cabinCrewMember.getRank().getRank());
    }

    @Test
    public void canSpeak(){
        assertEquals("Welcome aboard our flight",cabinCrewMember.welcomeAboard());
    }
}
