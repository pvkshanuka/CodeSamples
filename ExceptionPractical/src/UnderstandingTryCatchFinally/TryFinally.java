package UnderstandingTryCatchFinally;

public class TryFinally {

    public static void main(String[] args) {

        int[] ar = {10, 20};

        for (int i = 0; i < 3; i++) {
            try {

                System.out.println(ar[i]);

            } finally {
                System.out.println("IN Finally");
            }

            /*

            $ We can't use only try{} we must use it with finally or catch or with both.
            $ Either exception situation occures or not finally block will execute.
            $ If our code have Catched Exception we must use try with catch.

             */

        }
    }

}
