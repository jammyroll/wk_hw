import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

Flight flight;
    Plane plane;
    Pilot pilot;
 CabinCrewMember cabinCrewMember1;
 CabinCrewMember cabinCrewMember2;

  Passanger passanger1;
  Passanger passanger2;


    @Before
    public void before(){
        plane= new Plane(PlaneType.BOEING747);
        pilot=new Pilot("James",Rank.CAPTAIN,"FUGHJ363");
        cabinCrewMember1=new CabinCrewMember("John",Rank.FLIGHTATTENDANT);
        cabinCrewMember2=new CabinCrewMember("Jack",Rank.FLIGHTATTENDANT);
        passanger1=new Passanger("Jim",1);
        passanger2=new Passanger("Jimmy",2);
        flight= new Flight(pilot,plane,"HAJJSG","EDN","GLA","14:00");
        flight.checkInPassanger(passanger1);
        flight.checkInPassanger(passanger2);
        flight.addCrew(cabinCrewMember1);
        flight.addCrew(cabinCrewMember2);
    }

    @Test
    public void spaceLeft(){
        assertEquals(0,flight.checkForSpace());
    }

    @Test
    public void addPassangerWhenFull(){
        flight.checkInPassanger(passanger1);
        assertEquals(0,flight.checkForSpace());
    }


}
