package day04;

public class Passenger {

    private String passengerID;

    private int packages;

    public Passenger(String passengerID, int packages) {
        this.passengerID = passengerID;
        this.packages = packages;
    }

    public void addPackage(int addNumberOfPackages) {
        packages += addNumberOfPackages;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public int getPackages() {
        return packages;
    }
}
