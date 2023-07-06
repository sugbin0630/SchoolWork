package Grade12.Grade11_review;

import java.io.*;

public class Filereader {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error! " + e);
        }

        try {
            BufferedReader wr = new BufferedReader(new FileReader(fileName));
            
            wr.close();
        } catch (IOException e) {
            System.out.print("Error!\nErrorType:" + e);
        }
    }
}
