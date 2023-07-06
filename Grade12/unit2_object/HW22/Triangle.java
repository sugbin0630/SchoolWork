package Grade12.unit2_object.HW22;

public class Triangle extends Shape {
    int line1;
    int line2;
    int line3;
    
    public Triangle(int line1, int line2, int line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    @Override
    public double area() {
        double angle = Math.acos((line1 * line1 + line3 * line3 - line2 * line2) / (2 * line2 * line3));
        if (angle > Math.PI / 2) {
            return line1 * line3 * Math.sin(angle) / 2;
        } else if (angle < Math.PI / 2){
            return line1 * line3 * Math.sin(Math.PI / 2 - angle) / 2;
        }
        return line1 * line2 / 2;
    }

    @Override
    public double parameter() {
        return line1 +line2 + line3;
    }
}