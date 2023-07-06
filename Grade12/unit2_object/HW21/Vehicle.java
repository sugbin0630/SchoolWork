package Grade12.unit2_object.HW21;

public class Vehicle {
    private int numWheels;

    public Vehicle(int nw) {
        numWheels = nw;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public boolean equals(Vehicle other) {
        return other != null &&
                numWheels == other.numWheels;
    }

    public boolean isBig() {
        return numWheels > 4;
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int nw, int lc) {
        super(nw);
        loadCapacity = lc;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean equals(Truck other) {
        return other != null &&
                loadCapacity == other.loadCapacity;
    }
}

class Car extends Vehicle {
    private int numSeats;

    public Car(int ns) {
        super(4);
        numSeats = ns;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isBig() {
        return numSeats > 5;
    }
}
