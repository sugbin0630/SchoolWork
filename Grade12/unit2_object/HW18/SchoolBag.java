package Grade12.unit2_object.HW18;

public class SchoolBag {
    private String style;
    private Binder bin1;
    private Binder bin2;
    
    public SchoolBag(String style, Binder b1, Binder b2){
        this.style = style;
        bin1 = new Binder(b1.getLabel(), b1.getColor(), b1.getSheetNum());
        bin2 = new Binder(b2.getLabel(), b2.getColor(), b2.getSheetNum());
    }

    public void addSheet(Binder b, int num){
        b.addSheet(num);
    }

    public void removeSheet(Binder b, int num){
        b.removeSheet(num);
    }

    public String toString(int bagId) {
        return "\nSchoolBag #" + bagId + "\nStyle: " + this.style + "\nBinder #" + 0 + " - \n" + bin1.toString() + "\n" + "\nSchoolBag #" + bagId + "\nStyle: " + this.style + "\nBinder #" + 1 + " - \n" + bin2.toString() + "\n";
    }
}
