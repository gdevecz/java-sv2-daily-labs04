package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private String planeID;

    private int maxCapacity;

    private List<Passenger> passengers = new ArrayList<>();

    public Plane(String planeID, int maxCapacity) {
        this.planeID = planeID;
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() == maxCapacity) {
            return false;
        }
        passengers.add(passenger);
        return true;
    }

    public int numberOfPackages() {
        int sum = 0;
        for (Passenger passenger : passengers) {
            sum += passenger.getPackages();
        }
        return sum;
    }
}
