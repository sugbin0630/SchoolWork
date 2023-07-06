package Grade12.unit2_object.HW24;

public class CondoSpec extends SecondarySpec {

    private boolean pool;
    private boolean exRoom;
    private boolean locker;
    private boolean hydroIncluded;
    private boolean cableIncluded;

    public CondoSpec(boolean pool, boolean exRoom, boolean locker, boolean hydroIncluded, boolean cableIncluded) {
        this.pool = pool;
        this.exRoom = exRoom;
        this.locker = locker;
        this.hydroIncluded = hydroIncluded;
        this.cableIncluded = cableIncluded;
    }

    // matchSpec - check if this condo spec matches the given percentage of the
    // given spec
    public boolean matchSpec(SecondarySpec spec) {
        if (this.pool != spec.pool)
            return false;
        if (this.exRoom != spec.exRoom)
            return false;
        if (this.locker != spec.locker)
            return false;
        if (this.hydroIncluded != spec.hydroIncluded)
            return false;
        if (this.cableIncluded != spec.cableIncluded)
            return false;
        return true;
    }

    // toString - Returns the value all of the specification in this object in an
    // organized format
    public String toString() {
        return "";
    }
}
