package RethrowException;

import java.io.File;
import java.io.IOException;

public class RethrowException {

    public static void main(String[] args) {
        try {
            m1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void m1() {
        try {

            File file = new File("");
            file.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException("Reason to occur",e);
        }
    }

    /*

    $ In here we catched checked exception & we throw it as a runtime exception.
    $ In main method i print exception, so we can see tha STACKTRACE of that exception.

     */

}
