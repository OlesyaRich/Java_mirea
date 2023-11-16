package Pr_24;

public class OrderAlreadyAddedException extends RuntimeException {
    public OrderAlreadyAddedException(String errormessage) {
        super(errormessage);
    }
}