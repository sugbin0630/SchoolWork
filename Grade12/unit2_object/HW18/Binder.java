package Grade12.unit2_object.HW18;

public class Binder {
    private String label;
    private String color;
    private int sheetNum;
    private static int paperWeight;
    private static int binderWeight;

    public Binder(String label, String color) {
        this.label = label;
        this.color = color;
        this.sheetNum = 0;
    }

    public Binder(String label, String color, int sheetNum) {
        this.label = label;
        this.color = color;
        this.sheetNum = sheetNum;
    }

    public String getLabel() {
        return this.label;
    }

    public String getColor() {
        return this.color;
    }

    public int getSheetNum() {
        return this.sheetNum;
    }

    public void addSheet(int num) {
        this.sheetNum += num;
    }

    public void removeSheet(int num) {
        this.sheetNum -= num;
    }

    public int totalWeight() {
        return this.sheetNum * paperWeight + binderWeight;
    }

    public boolean compareWeight(Binder b) {
        return this.totalWeight() >= b.totalWeight();
    }

    public String toString() {
        return "\tLabel: " + this.label + "\n\tColor: " + this.color + "\n\t# of sheets: " + this.sheetNum;
    }
}
