package Grade11.unit2.HW11a_Output;import java.util.*;/*
Made by Austin
Made in 2022 03/24
Purpose : ask temperture and show how much it hot/cold
*/
public class Temperture {
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);        System.out.print("Write temperture : ");
        temp = sc.nextDouble();        // very cold
        if (temp < -18) {
            System.out.print("very cold");
        }
        // cold
        else if (temp <= 0) {
            System.out.print("cold");
            if (temp == 0) {
                System.out.print("\nfreezing point of water");
            }
        }
        // very cool
        else if (temp <= 10) {
            System.out.print("very cool");
        }
        // moderate
        else if (temp <= 20) {
            System.out.print("moderate");
        }
        // warm
        else if (temp <= 30) {
            System.out.print("warm");
        }
        // hot
        else if (temp <= 40) {
            System.out.print("hot");
        }
        // extremely hot
        else if (temp <= 100) {
            System.out.print("extremely hot");
            if (temp == 100) {
                System.out.print("\nboiling point of water");
            }
        }
        sc.close();
    }
}