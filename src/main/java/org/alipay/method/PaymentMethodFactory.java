package org.alipay.method;

import org.alipay.method.impl.BalancePayment;
import org.alipay.method.impl.BankCardPayment;
import org.alipay.method.impl.HuabeiPayment;

// 支付方式工厂
public class PaymentMethodFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        switch (type) {
            case "BALANCE":
                return new BalancePayment();
            case "BANKCARD":
                return new BankCardPayment();
            case "HUABEI":
                return new HuabeiPayment();
            default:
                throw new IllegalArgumentException("Invalid payment method type: " + type);
        }
    }
}
