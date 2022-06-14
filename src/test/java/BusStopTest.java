import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop bustStop;
    private People passenger;

    @Before public void before(){
        bustStop = new BusStop("Haymarket");
        passenger = new People();

    }

    @Test public void canAddToQueue(){
        bustStop.addPassenger(passenger);
        assertEquals(1,bustStop.queueSize());
    }

    @Test public void canRemoveFromQueue(){
        bustStop.addPassenger(passenger);
        bustStop.removePassenger();
        assertEquals(0, bustStop.queueSize());
    }

}
