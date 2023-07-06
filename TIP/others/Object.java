package TIP.others;
import java.util.*;

public class Object {
    double length;
    double height;
    double width;
    double x_value;
    double y_value;
    String name;

    public Object(double length, double height, double width, double x_value, double y_value, String name){
        this.length = length;
        this.height = height;
        this.width = width;
        this.x_value = x_value;
        this.y_value = y_value;
        this.name = name;
    }

    public static void main(String[] args) {
    //class_name object_name = new class_name()
    Scanner sc = new Scanner (System.in);
    boolean a = true;    
    Object object_Info = new Object(78, 90, 23, 255, 75, "object1");
    //object_name.object_Info
        do {
            System.out.println("length: " + object_Info.length);
            System.out.println("height: " + object_Info.height);
            System.out.println("width: " + object_Info.width);
            System.out.println("area: " + object_Info.area());
            System.out.println("volumne: " + object_Info.volume(object_Info));
            System.out.println("x value: " + object_Info.x_value);
            System.out.println("y value: " + object_Info.y_value);
            System.out.println("name: " + object_Info.name);

            System.out.println("\nCompile Y/N");
            switch (sc.nextLine().charAt(0)){
                case 'y': case 'Y':
                    a = true;
                    break;
                case 'n': case 'N':
                    a = false;
                    object_Info.newObject();
                    break;
            }
        }while (a);
        sc.close();
    }
    public double area(){
        return this.length * this.height;
    }
    public double volume(Object a){
        return this.area() * a.width;
    }
    public Object newObject(){
        Scanner sc = new Scanner (System.in);
        Object a = new Object(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextLine());
        sc.close();
        return a;
    }
}
