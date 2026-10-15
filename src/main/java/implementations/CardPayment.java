package implementations;

import interfaces.PaymentInterface;

public class UPIPayment implements PaymentInterface {
    @Override
    public void pay() {
        IO.println("Payment Process through UPI");
    }
}
