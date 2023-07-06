package Grade12.Grade11_review;

import java.io.*;

public class Filewriter {
    public static void main(String[] args) {
        String fileName = "file.txt";
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(fileName));

            wr.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
