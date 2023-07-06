package Grade12.unit2_object.HW19a;

public class Closet {
    Shirt[] shirts;

    public Closet(int maxNum, int numOfShirt, Shirt[] shirts) {
        shirts = new Shirt[maxNum];
    }

    public boolean addShirt(String color, int size, int purchasYear) {
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i] == null) {
                shirts[i].setColor(color);
                shirts[i].setSize(size);
                shirts[i].setPurchasYear(purchasYear);
                return true;
            }
        }
        return false;
    }

    public Shirt oldestShirt() {
        int old = 0;
        for (int i = 0; i < shirts.length - 1; i++) {
            if (shirts[old].getPurchasYear() < shirts[i].getPurchasYear()){
                
            }
        }
        return shirts[old];
    }

    public boolean removeShirt(Shirt s) {
        if (s != null){
            s = null;
            return true;
        }
        return false;
    }
}
