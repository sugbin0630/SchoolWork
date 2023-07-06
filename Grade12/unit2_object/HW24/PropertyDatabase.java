package Grade12.unit2_object.HW24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PropertyDatabase {
    private int numProperty;
    private Property list[];

    public Property seachByID(int id) {
        for (int i = 0; i < numProperty; i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }

    public void printAllMatch() {

    }

    public void listProperty() {

    }

    public void listHouse() {
        
    }

    public void listCondo() {
        
    }

    public void averagePriceInZone() {

    }

    public void largestCondo() {

    }
    /*
     * If the property is a house
     * house
     * <id>
     * <address>
     * <zone code>
     * <price>
     * <size>
     * <number of bedrooms>
     * <vacuum (Y/N)>
     * <air condition (Y/N)>
     * <fireplace (Y/N)>
     * <hardwood floor (Y/N)>
     * <finished basement (Y/N)>
     * 
     * If the property is a condo
     * condo
     * <id>
     * <address>
     * <zone code>
     * <price>
     * <size>
     * <number of bedrooms>
     * <pool (Y/N)>
     * <exercise (Y/N)>
     * <locker (Y/N)>
     * <hydro included (Y/N)>
     * <cable included (Y/N)>
     */

    public boolean loadFile() {
        String fileName = "data.txt";
        String str1 = "house";
        String str2 = "condo";
        try {
            BufferedReader rd = new BufferedReader(new FileReader(fileName));
            for (int i = 0; i < numProperty; i++) {
                if (str1.equals(rd.readLine())) {
                    list[i].setId(Integer.parseInt(rd.readLine())); // <id>
                    list[i].setAddress(rd.readLine()); // <adress>
                    rd.readLine(); // <zone code>
                    Integer.parseInt(rd.readLine()); // <price>
                    Integer.parseInt(rd.readLine()); // <size>
                    Integer.parseInt(rd.readLine()); // <number of bedrooms>
                    YorN(rd.readLine()); // <vacuum (Y/N)>
                    YorN(rd.readLine()); // <air condition (Y/N)>
                    YorN(rd.readLine()); // <fireplace (Y/N)>
                    YorN(rd.readLine()); // <hardwood floor (Y/N)>
                    YorN(rd.readLine()); // <finished basement (Y/N)>
                } else if (str2.equals(rd.readLine())) {
                    list[i].setId(Integer.parseInt(rd.readLine())); // <id>
                    list[i].setAddress(rd.readLine()); // <adress>
                    rd.readLine(); // <zone code>
                    Integer.parseInt(rd.readLine()); // <price>
                    Integer.parseInt(rd.readLine()); // <size>
                    Integer.parseInt(rd.readLine()); // <number of bedrooms>
                    YorN(rd.readLine()); // <pool (Y/N)>
                    YorN(rd.readLine()); // <exercise (Y/N)>
                    YorN(rd.readLine()); // <locker (Y/N)>
                    YorN(rd.readLine()); // <hydro included (Y/N)>
                    YorN(rd.readLine()); // <cable included (Y/N)>
                }
            }
            rd.close();
        } catch (IOException e) {
            return false;
        }
        return true;

    }

    public boolean saveFile() {
        String fileName = "data.txt";
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < list.length; i++) {
                if (list[i] instanceof House) {
                    wr.write("house");
                    wr.write(list[i].getId());
                    wr.write(list[i].getAddress());
                } else {
                    wr.write("condo");
                    wr.write(list[i].getId());
                    wr.write(list[i].getAddress());
                    wr.write(((Condo) list[i]).zoneCode);
                }

            }
            wr.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean YorN(String c) {
        switch (c) {
            case "y":
            case "Y":
                return true;

            case "n":
            case "N":
                return false;
            default:
                return false;
        }
    }
}
