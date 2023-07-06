package Grade12.unit2_object.HW17;

public class Pantry {
    private Jam jam1;
    private Jam jam2;
    private Jam jam3;

    public Pantry(Jam j1, Jam j2, Jam j3) {
        this.jam1 = j1;
        this.jam2 = j2;
        this.jam3 = j3;
    }

    public void removeJam(Jam j, int amount) {
        j.removeJam(amount);
    }

    public String toString() {
       return "1" + jam1.toString() + "\n2" + jam2.toString() + "\n3" + jam3.toString();
    }
}