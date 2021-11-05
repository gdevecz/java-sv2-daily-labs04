package day04;

public class PlaneMain {

    public static void main(String[] args) {
        Passenger p1 = new Passenger("utas1",3);
        Passenger p2 = new Passenger("utas2",2);
        Passenger p3 = new Passenger("utas3",1);

        Plane plane = new Plane("werwerw",2);
        plane.addPassenger(p1);
        plane.addPassenger(p2);

        System.out.println(plane.numberOfPackages());
        System.out.println(plane.addPassenger(p3));
        System.out.println(plane.numberOfPackages());
    }
}
