package TIP.others;

import java.io.*;
import java.util.Scanner;

public class IO_File {
    /*
     * It must be in the same folder as your program unless you supply the entire
     * file path as part of [fileName].
     */ 
    
     /*
     * If Scanner can read different types of data, and the Reader classes can only
     * read Strings and char, why do we use them? Why don��t we just use Scanner?
     * Scanner has a harder time determining when it has reached the end of a file.
     * A Scanner that reaches EOF returns an empty String, just like what it would
     * return if you had just pressed enter when asking for keyboard input.
     * This makes it hard to tell whether you are actually at the end of a file, or
     * if you had just read a blank line.
     * Because of this, you should only use Scanner when you want to know your file
     * is designed with this shortcoming in mind.
     */

    public static void main(String[] args) {

        String fileName = "IO_Example.txt";
        // All reader, writer must be in try-catch

        // WRITERS
        FileWriter(fileName);
        BufferedWriter(fileName); // more efficient

        // READERS
        FileReader(fileName);
        BufferedReader(fileName); // more efficient
        ScannerReader(fileName);

    }

    // WRITERS
    /**
     * FileWriter [writerName] = new FileWriter([fileName], [booleanValue]);
     */
    public static void FileWriter(String fileName) {
        try {
            /*
             * true: clear file and write text
             * false: write text from last line
             */
            FileWriter wr = new FileWriter(fileName, true);
            wr.write("Hello World!");
            wr.write("\n"); // FileWriter don't have .newLine();
            wr.close();
        } catch (IOException e) {
            System.out.println("Error!\nErrorType: " + e);
        }
    }

    /**
     * BufferedWriter [writerName] = new BufferedWriter(new FileWriter([fileName],
     * [booleanValue]));
     */
    public static void BufferedWriter(String fileName) {
        try {
            /*
             * true: clear file and write text
             * false: write text from last line
             */
            BufferedWriter wr = new BufferedWriter(new FileWriter(fileName, true));
            wr.write("Hello World!");
            wr.newLine(); // Enter
            wr.close();
        } catch (IOException e) {
            System.out.println("Error!\nErrorType: " + e);
        }
    }

    // READER
    /**
     * FileReader rd = new FileReader([fileName]);
     * 
     * @apiNote can use only .read()
     */
    public static void FileReader(String fileName) {
        int charIn;
        try {
            FileReader rd = new FileReader(fileName);
            charIn = rd.read(); // read char and return 0 when letter exist, -1 when doesn't exist
            while (charIn != -1) {
                System.out.print((char) charIn);
                charIn = rd.read();
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("Error!\nErrorType: " + e);
        }
    }

    /**
     * BufferedReader in = new BufferedReader(new FileReader([fileName]));
     */
    public static void BufferedReader(String fileName) {
        String str;
        try {
            BufferedReader rd = new BufferedReader(new FileReader(fileName));
            str = rd.readLine(); // read one line and return it. return null if the line doesn't exist
            while (str != null) { //until program end
                System.out.println(str);
                str = rd.readLine();
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("Error!\nErrorType: " + e);
        }
    }

    /**
     * Scanner wr = new Scanner(new File([fileName]));
     */
    public static void ScannerReader(String fileName) {
        try {
            Scanner wr = new Scanner(new File(fileName));
            while (wr.hasNextLine()) { // until end of file
                String str = wr.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) { // Not IOException
            System.out.println("Error!\nErrorType: " + e);
        }
    }
}