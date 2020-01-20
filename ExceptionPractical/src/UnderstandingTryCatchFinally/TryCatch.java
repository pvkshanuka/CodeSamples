package UnderstandingTryCatchFinally;

import java.io.FileNotFoundException;

public class TryCatch {

    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            try {

                if (i == 0) throw new ArrayIndexOutOfBoundsException();
                else if (i == 1) throw new IndexOutOfBoundsException();
                else if (i == 2) throw new RuntimeException();
                else throw new Exception();

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }catch (IndexOutOfBoundsException e){
                System.out.println("IndexOutOfBoundsException");
            }catch (RuntimeException e){
                System.out.println("RuntimeException");
            }catch (Exception e){
                System.out.println("Exception");
            }


        }
            /*

            $ We can use multiple catchs to try, but we need to put them in order (Most specified ones fist & parents last)
            otherwise we cant run our program(Compile error).
            $ We can use catchs for exceptions of different branches in hierarchy.
            $ We can't put same catch twise.

             */

    }

}
