package Grade12.unit2_object.HW17;

public class Jam {
    private String content;
    private String date;
    private int size;

    public Jam(String content, String date, int size) {
        this.content = content;
        this.date = date;
        this.size = size;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return ": " + this.content + "  " + this.date + "   " + this.size + " fl. oz.";
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void removeJam(int amount) {
        if (this.size >= amount) {
            this.size -= amount;
            System.out.println("Spreading " + amount + " fluid ounces of " + this.content);
        } else {
            amount = this.size;
            this.size = 0;
            System.out.println("Spreading " + amount + " fluid ounces of " + this.content);
        }
    }
}
