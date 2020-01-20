package CatchingCheckedException;

import sun.rmi.runtime.Log;

import java.io.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CatchingCheckedException {

    public static void main(String[] args) {

        String path = "C:\\Users\\Kusal Shanuksa\\Desktop\\Sample.txt";

        try {

            writeOnFile(path);

        } catch (FileNotFoundException e) {
            File file = new File(path);
            try {
                System.out.println("File not found. Creating new file.");
                file.createNewFile();
                writeOnFile(path);
            } catch (IOException ex) {
                System.out.println("File create failed.");
                System.out.println("Please give another path.");
            }
        } catch (IOException e) {
            System.out.println("Please give another path.");
        }

    }

    private static void writeOnFile(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("This is sample.");
        bufferedWriter.close();
        System.out.println("Writed on file");
    }

}
