package Grade12.unit2_object.HW24;

public class HouseSpec extends SecondarySpec {
    /*
     * Fields: vacuum, ac, fireplace, hardwood, basement
     * o Methods:
     * Constructor – initialize all fields
     * matchSpec - check if this condo spec matches the given percentage of
     * the given spec
     * toString - Returns the value all of the specification in this object in an
     * organized format
     */
    private int vacuum;
    private int ac;
    private int fireplace;
    private int hardwood;
    private int basement;

    public HouseSpec(int vacuum, int ac, int fireplace, int hardwood, int basement) {
        this.vacuum = vacuum;
        this.ac = ac;
        this.fireplace = fireplace;
        this.hardwood = hardwood;
        this.basement = basement;
    }

    public boolean matchSpec(SecondarySpec spec) {
        if (this.vacuum != spec.vacuum)
            return false;
        if (this.ac != spec.ac)
            return false;
        if (this.fireplace != spec.fireplace)
            return false;
        if (this.hardwood != spec.hardwood)
            return false;
        if (this.basement != spec.basement)
            return false;
        return true;
    }

    public String toString() {
        return "";
    }
}
