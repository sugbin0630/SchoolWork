package Grade12.unit2_object.HW24;

public class PrimarySpec {
    /*
     * Fields: zoneCode, price, size, numBedRoom
     * o Methods:
     * Constructor – initialize all fields
     * matchSpec - check if this primary spec matches the given primary spec
     * toString - Returns the value all of the specification in this object in an
     * organized format
     */
    private String zoneCode;
    private int price;
    private int size;
    private int numBedRoom;

    public PrimarySpec(String zoneCode, int price, int size, int numBedRoom) {
        this.zoneCode = zoneCode;
        this.price = price;
        this.size = size;
        this.numBedRoom = numBedRoom;
    }
    /*
     * matchSpec - check if this primary spec matches the given primary spec
     * toString - Returns the value all of the specification in this object in an
     * organized format
     */

    public boolean matchSpec(PrimarySpec spec) {
        if (this.zoneCode != spec.zoneCode) return false;
        if (this.price != spec.price) return false;
        if (this.size != spec.size) return false;
        if (this.numBedRoom != spec.numBedRoom) return false;
        return true;
    }

    public String toString() {
        return zoneCode + "\n" + price + "\n" + size + "\n" + numBedRoom + "\n";
    }
}
