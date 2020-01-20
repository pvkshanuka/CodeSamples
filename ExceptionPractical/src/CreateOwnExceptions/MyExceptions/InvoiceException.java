package CreateOwnExceptions.MyExceptions;

public class InvoiceException extends OrderException {
    public InvoiceException() {
        super();
    }

    public InvoiceException(String message) {
        super(message);
    }

    public InvoiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvoiceException(Throwable cause) {
        super(cause);
    }

    protected InvoiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
