package service;

import interfaces.PaymentInterface;

import java.math.BigDecimal;

public class PaymentProccesorService {
    private final PaymentInterface payment;
    public PaymentProccesorService(PaymentInterface payment) {
        this.payment = payment;
    }
    public void pay(BigDecimal amount) {

        if(amount.compareTo(BigDecimal.ZERO)<=0){
            IO.println("Amount must be greater than zero");
        }
        payment.pay(amount);
    }
}
