import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private People passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow");
        passenger = new People();
        busStop = new BusStop("Waverley");
        busStop.addPassenger(passenger);
    }

    @Test
    public void busStartEmpty(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassengerToBus(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassengerToBus(passenger);
        bus.removePassengerToBus(passenger);
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void canPickUpCustomerFromBustStop(){
        bus.pickUp(busStop);
        assertEquals(1,bus.passengerCount());
    }

}

