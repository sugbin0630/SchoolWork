package Grade12.unit2_object.HW19;

public class Computer {
    private String serialNum;
    private String manufacturer;
    private int madeYear;
    private int purchaseYear;
    private double speed;
    private int ramSize;
    private int expiryYear;

    public Computer(String serialNum, String manufacturer, int madeYear, int purchaseYear, double speed, int ramSize,
            int expiryYear) {
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.madeYear = madeYear;
        this.purchaseYear = purchaseYear;
        this.speed = speed;
        this.ramSize = ramSize;
        this.expiryYear = expiryYear;
    }

    public String toString() {
        return "serialNum: " + serialNum + "\n" + "manufacturer: " + manufacturer + "\n" + "madeYear: " + madeYear
                + "\n" + "purchaseYear: " + purchaseYear + "\n" + "speed: " + speed + "\n" + "ramSize: " + ramSize
                + "\n" + "expiryYear: " + expiryYear;
    }

    public boolean isNewer(Computer c) {
        if (this != null && c != null && this.madeYear >= c.madeYear) {
            return true;
        }
        return false;
    }

    public boolean isFaster(Computer c) {
        if (this != null && c != null && this.speed >= c.speed) {
            return true;
        }
        return false;
    }

    public boolean isLarger(Computer c) {
        if (this != null && c != null && this.ramSize >= c.ramSize) {
            return true;
        }
        return false;
    }

    // accessors
    public String getSerialNum() {
        return this.serialNum;
    }

    public String getManyfacturer() {
        return this.manufacturer;
    }

    public int getmadeYear() {
        return this.madeYear;
    }

    public int getPurchaseYear() {
        return this.purchaseYear;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public int getExpiryYear() {
        return this.expiryYear;
    }

    public double getSpeed() {
        return this.speed;
    }

    // mutators
    public void setSerialNum(String serial) {
        this.serialNum = serial;
    }

    public void setManyfacturer(String madeBy) {
        this.manufacturer = madeBy;
    }

    public void setmadeYear(int year) {
        this.madeYear = year;
    }

    public void setPurchaseYear(int year) {
        this.purchaseYear = year;
    }

    public void setRamSize(int size) {
        this.ramSize = size;
    }

    public void setExpiryYear(int year) {
        this.expiryYear = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // serial number, manufacturer, year of made, year of purchase, processor speed,
    // size of RAM, and warranty expiry year.
}