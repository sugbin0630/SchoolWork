package Grade12.unit2_object.HW19a;

public class Shirt {
    private String color;
    private int size;
    private int purchasYear;
    static final int currentYear = 2022;

    public Shirt(String color, int size, int purchasYear) {
        this.color = color;
        this.size = size;
        this.purchasYear = purchasYear;
    }
    
    public int howOld() {
        return currentYear - purchasYear;
    }

    public String toString() {
        return "Color: " + color + "\nSize: " + size + "\nPurchas year: " + purchasYear;
    }

    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

    public int getPurchasYear() {
        return this.purchasYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPurchasYear(int purchasYear) {
        this.purchasYear = purchasYear;
    }
}