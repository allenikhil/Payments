package org.example;

import implementations.CardPayment;
import implementations.UPIPayment;
import interfaces.PaymentInterface;
import service.PaymentProccesorService;

import java.math.BigDecimal;

public class Main {
     void main() {
        PaymentInterface paymentInterface = new CardPayment();
        PaymentProccesorService service = new PaymentProccesorService(paymentInterface);
        service.pay(new BigDecimal("100.50"));
    }
}
