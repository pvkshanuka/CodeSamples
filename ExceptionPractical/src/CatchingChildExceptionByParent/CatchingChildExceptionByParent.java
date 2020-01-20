package CatchingChildExceptionByParent;

import java.io.FileNotFoundException;

public class CatchingChildExceptionByParent {

    public static void main(String[] args) {
        try {

//            throw new ArrayIndexOutOfBoundsException();
//            throw new IndexOutOfBoundsException();
            throw new RuntimeException();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException ex){
            System.out.println("IndexOutOfBoundsException");
        }
    }

    /*

    $ Parent exception classes can catch child exceptions.
    $ But child exceptions classes can't catch patent exceptions.

    */

}
