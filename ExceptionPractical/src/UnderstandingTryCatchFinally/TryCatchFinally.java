package UnderstandingTryCatchFinally;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            int i = 100/10;
        } catch (ArithmeticException e) {
            System.out.println("Devided by zero.");
        }finally {
            System.out.println("In finally");
        }
    }

    /*

    $ We can use filnally with try & catch, but we must put finally after catch if we use catch, if we dont use catch we must put it after try.
    $ Finally will always execute if exception occures or not.
    $ There is only two reasons that fainally block will not execute.
        1 If JVM crashed before executing finally.
        2 If thread was killed before execute finally.

     */

}
