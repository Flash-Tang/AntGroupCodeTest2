package org.alipay.method;

// 支付方式接口
public interface PaymentMethod {
    boolean isAvailable(long userId, double amount);
    void pay(long userId, double amount);
}
