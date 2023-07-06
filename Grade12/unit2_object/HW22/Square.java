package Grade12.unit2_object.HW22;

public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double parameter() {
        return length * 4;
    }
}