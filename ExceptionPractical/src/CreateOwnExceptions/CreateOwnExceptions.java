package CreateOwnExceptions;

import CreateOwnExceptions.MyExceptions.ClientException;
import CreateOwnExceptions.MyExceptions.InvoiceException;
import CreateOwnExceptions.MyExceptions.OrderException;

public class CreateOwnExceptions {

    public static void main(String[] args) {
        try {
            m1();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    private static void m1() {
        try {
            m2();
        } catch (OrderException e) {
            throw new ClientException(e);
        }
    }

    private static void m2() {
        try {
            m3();
        } catch (InvoiceException e) {
            throw new OrderException(e);
        }
    }

    private static void m3() {
        try {
            int i = 100 / 0;
        } catch (ArithmeticException e) {
            throw new InvoiceException(e);
        }
    }

}
