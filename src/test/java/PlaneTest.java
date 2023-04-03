import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane= new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100,plane.getCapacity());
    }
    @Test
    public void hasWeight(){
        assertEquals(10,
                plane.getPlaneType().getTotalWeight());
    }

}
