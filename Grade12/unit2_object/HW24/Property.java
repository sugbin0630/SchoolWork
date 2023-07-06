package Grade12.unit2_object.HW24;

public class Property {
    /*
     * Fields: id, address, primSpec, secSpec
     * o Methods:
     * Constructor – initialize all fields
     * matchProperty - returns whether this property matches the specified
     * primary and secondary spec (with given matching percentage)
     * toString – returns the id and address ONLY in organized format
     */
    private int id;
    private String address;
    private PrimarySpec primSpec;
    private SecondarySpec secSpec;

    public Property(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public void matchProperty() {

    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "id: " + id + "\naddress: " + address;
    }
}
