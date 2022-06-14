import java.util.ArrayList;

public class BusStop {

    private String name;

    private ArrayList<People> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }


    public void addPassenger(People passenger) {
        this.queue.add(passenger);
    }

    public int queueSize() {
        return this.queue.size();
    }

    public People removePassenger() {
        return this.queue.remove(0);
    }
}
