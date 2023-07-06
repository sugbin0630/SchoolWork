package Grade12.unit2_object.HW22;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double parameter() {
        return (length + width) * 2;
    }
}
