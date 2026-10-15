package implementations;

import interfaces.PaymentInterface;

import java.math.BigDecimal;

public class CardPayment implements PaymentInterface {
    @Override
    public void pay(BigDecimal amount) {
        IO.println(amount+ " Paid through Card");
    }
}
