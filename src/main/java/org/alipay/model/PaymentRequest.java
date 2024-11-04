package org.alipay.model;

public class PaymentRequest {
    private long userId;
    private double amount;

    public PaymentRequest(long userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    // Getter methods
    public long getUserId() { return userId; }
    public double getAmount() { return amount; }
}
