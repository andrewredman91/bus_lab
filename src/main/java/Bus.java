import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity = 40;
    private ArrayList<People> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.capacity = capacity;
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerToBus(People passenger) {
        if (passengerCount() < capacity){
        this.passengers.add(passenger);
        }
    }

    public void removePassengerToBus(People passenger) {
        this.passengers.remove(passenger);
    }

    public void pickUp(BusStop busStop) {
        People passenger = busStop.removePassenger();
        addPassengerToBus(passenger);
    }
}
